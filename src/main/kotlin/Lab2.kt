import java.lang.NumberFormatException

var funds : Double = 100.0
val pswd = "password"

fun main() {
    var input : String
    var cmd : List<String>

    while (true) {
        print("Command: ")
        input = readLine()!!
        cmd = input.split(" ")
        when (cmd[0]) {
            "balance" -> balance()
            "deposit" -> {
                try {
                    deposit(cmd[1].toDouble())
                } catch (e: NumberFormatException) {
                    println("${cmd[1]} is not a number")
                }

            }
            "withdraw" -> {
                try {
                    withdraw(cmd[1].toDouble())
                } catch (e: NumberFormatException) {
                    println("${cmd[1]} is not a number")
                }
            }
            else -> println("Invalid command")
        }
    }
}

fun balance() {
    println("current value of funds $funds")
}

fun deposit(amount: Double) {
    funds += amount
}

fun withdraw(amount: Double) {
    print("enter your password: ")
    val password = readLine();

    if (password == pswd) {

        funds -= amount

    }else {
        println("invalid password")
    }
}