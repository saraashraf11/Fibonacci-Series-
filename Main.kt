import java.util.Scanner
/*
    Sara Ashraf
 */
fun main(arg: Array<String>) {
    println("Enter the number to get it's Fibonacci series: ")
    val num = readln().toInt()
    fib(num)
}

fun fib(num:Int){
    var first = 0
    var second = 1
    print("Fibonacci Series = ")
    for(item in 0..<num){
        print("$first, ")
        var sum = first + second
        first = second
        second = sum
    }
}