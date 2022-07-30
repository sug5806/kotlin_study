open class Dog {
    open var age: Int = 0

    open fun bark() {
        println("멍멍")
    }
}

// open을 붙여야 상속가능하고 final을 붙이면 상속이 불가능하다.
open class Bulldog(final override var age: Int = 0) : Dog() {

    final override fun bark() {
        super.bark()
    }
}

// 추상 클래스
abstract class Developer {

    abstract var age: Int
    abstract fun code(language: String)

}

class BackendDeveloper(override var age : Int) : Developer() {

    override fun code(language: String) {
        println("I code with $language")
    }
}

fun main() {
    val backendDeveloper = BackendDeveloper(age = 20)
    println(backendDeveloper.age)
    backendDeveloper.code("Kotlin")


    val dog = Bulldog(age = 2)
    println(dog.age)
    dog.bark()

}