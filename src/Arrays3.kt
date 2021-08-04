import java.util.*

fun main(args: Array<String>) {
    var my_sccanner= Scanner(System.`in`)
    println("Enter the principle")
    var p=my_sccanner.nextDouble()

    println("Enter the rate")
    var r=my_sccanner.nextDouble()

    println("Enter time")
    var t= my_sccanner.nextDouble()

    var interest=(p*r*t)/100.0
    println("Your interest is $interest")
}