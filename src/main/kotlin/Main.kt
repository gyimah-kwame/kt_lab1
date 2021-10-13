fun main(args: Array<String>) {
    println("Hello World!")

    printSum(4,5)



    val rectangle = Rectangle(10.0, 2.0);

    println("perimeter is ${rectangle.perimeter}")

    rectangle.length = 20.0

    println("new perimeter ${rectangle.perimeter}")

    println(maxOf(10, 20))

    val items = listOf("apple", "banana", "kiwifruit");

    for (item in items) {
        println(item)
    }

    println("indices ${items.indices}")

    for (index in items.indices) {
        println("item ast $index is ${items[index]}");
    }

    val x = 10;

    if (x in 1..2) {
        println("in range")
    }else {
        println("not in range")
    }


    for (a in 9 downTo 0 step 3) {
        println(a)
    }

}

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a+b}")
}

fun maxOf(a: Int, b: Int): Int {
    return if (a > b) {
        a
    }else {
        b
    }
}