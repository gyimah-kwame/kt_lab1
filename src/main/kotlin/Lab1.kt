
fun main(arg: Array<String>) {

    println("Hello, World!")

    var hello = "Hello"

    println(hello)


    for (i in -5..5) {
        println("3x - 1 => 3($i) -1  => ${calculate(3, i, -1)}")
    }

    println("************")

    for (i in 0..20) {
        val x = calculate(3, i, 5);
        val y = calculate(4, i, 2);

        if (x == y) {
            println("lines intersects at ($i, $y)");
        }
    }

    println("\n")

    intersection(3, 5, 4, 2)
    intersection(2, 1, 3, 3)
    intersection(-2,3,3,-2)

}

fun calculate(m: Int, x: Int, c: Int): Int {
    return m*x + c;
}

fun intersection(mOne : Int, cOne : Int, mTwo : Int, cTwo : Int) : Unit {

   var x: Int? = null

    for (i in 1 until 100) {
        val yOne = calculate(mOne, i, cOne)
        val yTwo = calculate(mTwo, i, cTwo)

        if (yOne == yTwo) {
            x = i

        }
    }

    if (x == null) {
        println("lines do not intersect")
    } else {
        println("lines intersect at x value $x")
    }

}