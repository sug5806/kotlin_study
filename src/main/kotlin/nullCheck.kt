fun main(args: Array<String>) {
    // null 자체를 넣으면 컴파일러가 에러를 낸다.
//    val a : String = null
//    var b : String = "aabbcc"
//    b = null

    // 뒤에 ?를 붙이면 nullable 하다.
    // 또한 nullPointException 방지할 수 있다.
    var a: String? = null
    println(a?.length);

    // 삼항 연산자
    var b: Int = if (a != null) a.length else 0
    println(b)

    // 삼항 연산자를 엘비스 표현식으로 변경
    val c = a?.length ?: 0
    println(c)

    // null이 할당되어도 !!를 붙이면 개발자가 컨트롤하겠다는 의미가 된다.
    // NPE가 발생한다.
    val d: String? = null
    val dd = d!!.length
}