class Coffee (
    // var 키워드는 getter, setter를 자동으로 만들어준다.
    // val 키워드는 getter만 만들어준다.
    var name: String = "",
    var price: Int = 0,
){
    // val 키워드는 custom getter를 만들 수 있음
    val brand: String
        get() {
            return "스타벅스"
        }

    // setter에서 ㅍ로퍼티를 접근할때는 field로 접근해야 한다.
    var quantity : Int = 0
        set(value) {
            if (value > 0) {
                field = value;
            }
        }
}

fun main() {
    val coffee = Coffee()
    coffee.name = "아이스 아메리카노"
    coffee.price = 2000

    println("${coffee.name} 가격은 ${coffee.price}입니다. 브랜드는 ${coffee.brand}")
}