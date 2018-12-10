fun main(args: Array<String>): Unit {
    println("Hello, World!")
    val range = 1..20 step 2
    val range2 = 20 downTo 12 step 3
    println(range)
    println(range2)
    for (r in range2) {
        println(r)
    }

    repeat(3) {
        println("${it + 1}asy peasy")
    }

    println(1 in range)
    println(16 in range2)
    println("-----------------------")


    println(mixColors("yellow", "red"))

    val s1 : String? = "Hey"
    val s2: String? = null
    val s3: String? = "     \n"

    s1?.echo()
    s2?.echo() //nothing happens

    val int1 : Int = 3
    3.abcfun()
    s1?.defg()

    println(s1 ?: "aaa" )
    println(s2 ?: "aaa" )

    println(s1.isNullOrBlank())
    println(s2.isNullOrBlank())
    println(s3.isNullOrBlank())
    println(s3.isNullOrEmpty())



}

fun String.echo() {
    println(this)
}

fun Int.abcfun() {
    println(this)
}

fun Any.defg() {
    println("defg ${this}")
}

fun mixColors(first: String, second: String) =
        when (setOf(first, second)) {
            setOf("red", "blue") -> "purple"
            setOf("red", "yellow") -> "orange"
            setOf("blue", "yellow") -> "green"
            else -> "unknown"
        }