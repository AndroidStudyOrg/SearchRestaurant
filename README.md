# SearchRestaurant
맛집 검색 앱
  - NaverMap
  - Naver Open API
  - BottomSheetBehavior
  - Moshi

## [NaverMap](https://navermaps.github.io/android-map-sdk/guide-ko/0.html)
  - 네이버 지도 SDK는 네이버 지도 앱을 비롯한 네이버의 여러 서비스에서 사용 중인 엔진이다. 대규모 사용자가 이용하는 서비스에 다년간 적용되어 기능과 안정성이 보장된다.
  - 개발자 친화적인 API를 제공하므로 SDK가 제공하는 강력한 기능을 쉽게 사용할 수 있다.
  - 네이버 지도 SDK는 네이버 지도같은 복잡한 서비스에서 요구되는 다양한 기능을 모두 수용하는 강력한 기능을 제공한다.

## [Naver Open API](https://developers.naver.com/docs/common/openapiguide/)
  - 네이버 플랫폼의 정보를 외부 개발자가 쉽게 이용할 수 있도록 제공하는 API
  - [검색 API](https://developers.naver.com/docs/serviceapi/search/local/local.md)

## [BottomSheetBehavior](https://m2.material.io/develop/android/components/bottom-sheet-dialog-fragment)
  - 2가지 방법: BottomSheetDialogFragment()  /  **View에 직접 사용**
  - **View에 직접 사용(CoordinatorLayout)**
      - FragmeLayout 기반의 강력한 상호작용 레이아웃 -> FragmeLayout에서 View를 배치하듯 해야한다
      - 자식 Behavior들과의 이동 및 애니메이션 작용 등을 다룰 때 사용할 수 있음
      - AppBarLayout의 스크롤 시 크기 변경
      - 하단 FloatingButton의 스크롤 시 위치 변경 등

## [Moshi](https://github.com/square/moshi)
  - Moshi는 안드로이드와 Java, Kotlin을 위한 최신 JSON 라이브러리이다. JSON 데이터를 Java 혹은 Kotlin으로 파싱하기 쉽다
  - Gson: google에서 만든 라이브러리
      - Java로 구현되어 있다
  - Moshi: Retrofit과 OkHttp를 만든 Square에서 만든 라이브러리
      - Kotlin으로 구현되어 있다
