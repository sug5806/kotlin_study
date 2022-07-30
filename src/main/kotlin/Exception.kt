fun main() {

    // 기본적인 에러처리
    try {
        Thread.sleep(1)
    } catch (e: Exception) {
        println("에러 발생!")
    }


    // finally도 사용 가능하다.
    try {
        throw Exception()
    } catch (e: Exception) {
        println("에러 발생!")
    } finally {
        println("finally 실행!!")
    }

    // try-catch 는 표현식 이므로 값을 리턴할 수 있음.
    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println("예외 발생!")
    }
    println(a)

    // 강제 예외 발생
//    throw Exception("예외 발생!")

    // 값 리턴하기
    val b = failFast("예외 발생! 값 념겨주기")



}

// Nothing은 함수가 리턴될일이 없거나 예외를 던지는 경우 사용한다.
fun failFast(message: String): Nothing {
    throw java.lang.IllegalArgumentException(message)
}