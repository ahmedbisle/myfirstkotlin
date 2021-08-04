import java.util.*

fun main(args: Array<String>) {
    var chukua= Scanner(System.`in`)
    println("Enter name")
    var name= chukua.next()

    println("Enter your height")
    var height= chukua.nextDouble()

    println("Enter your weight")
    var weight =chukua.nextDouble()

    println("Enter your age")
    var age= chukua.nextInt()

    println("hello $name, your height is $height, your age is $age and your weight is $weight")
}
