package org.shop.searchrestaurant

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.naver.maps.geometry.LatLng
import org.shop.searchrestaurant.databinding.ItemRestaurantsBinding

class RestaurantsListAdapter(private val onClick: (LatLng) -> Unit) :
    RecyclerView.Adapter<RestaurantsListAdapter.RestaurantsViewHolder>() {
    private var dataSet = emptyList<SearchItem>()

    inner class RestaurantsViewHolder(private val binding: ItemRestaurantsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: SearchItem) {
            with(binding) {
                titleTextView.text = item.title
                categoryTextView.text = item.category
                locationTextView.text = item.roadAddress

                binding.root.setOnClickListener {
                    onClick(LatLng(item.mapy.toDouble() / 1E7, item.mapx.toDouble() / 1E7))
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantsViewHolder {
        return RestaurantsViewHolder(
            ItemRestaurantsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RestaurantsViewHolder, position: Int) {
        holder.bind(dataSet[position])
    }

    override fun getItemCount(): Int = dataSet.size

    @SuppressLint("NotifyDataSetChanged")
    fun setData(dataSet: List<SearchItem>) {
        this.dataSet = dataSet
        notifyDataSetChanged()
    }
}