package io.kraftsman.collection.practice.statistics.generators

object CityGenerator {
    private val cities = listOf(
        "臺北市", "新北市", "桃園市", "臺中市",
        "臺南市", "高雄市",
        "新竹縣", "苗栗縣", "彰化縣", "南投縣",
        "雲林縣", "嘉義縣", "屏東縣", "宜蘭縣",
        "花蓮縣", "臺東縣", "澎湖縣", "金門縣",
        "連江縣",
        "基隆市", "新竹市", "嘉義市",
    )

    fun generate(): String = cities.random()
}