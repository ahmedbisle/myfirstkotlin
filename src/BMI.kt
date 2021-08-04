import java.util.*

fun main(args: Array<String>) {
    var my_scanner= Scanner(System.`in`)
    print("Enter your name")
    var name= my_scanner.next()
    println("Enter your weight")
    var weight= my_scanner.nextDouble()
    println("Enter your height")
    var height= my_scanner. nextDouble()

    BMI(name,weight,height )
}
fun BMI(n:String,w:Double,h:Double){
    var BMI= w/ Math.pow(h,2.0)

    if (BMI<50){
        println("hi $n, your  underweight")

    }else if (BMI>100){
        println("hi $n, your overweight")

        }else
            println("obseeeesssssss")


}