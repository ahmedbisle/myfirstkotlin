import java.util.*

fun main(args: Array<String>) {
    var scanner_yangu= Scanner(System.`in`)
    println("how many names do you have? ")
    var number_of_names = scanner_yangu.nextInt()
    println("Enter the names with their corrosponding ADM numbers")
    var names= arrayOfNulls<String>(number_of_names)
    var adm_numbers = arrayOfNulls<String>(number_of_names)

    var position = 0
    while (position < number_of_names){
        names[position] = scanner_yangu.next()
        adm_numbers[position] = scanner_yangu.next()
        position++
    }
    var print_postion = 0
    while (print_postion < number_of_names){
        println("Names is "+names[print_postion]+"______ADM NO is "+adm_numbers[print_postion])
        print_postion++
        }



}