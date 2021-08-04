import java.util.*

fun main(args: Array<String>) {
    var sccanner_yangu= Scanner(System.`in`)
    println("how many names do you have?")
    var number_of_names= sccanner_yangu.nextInt()
    //instantiate a string array that can only accommodate up to the number entered
    println("Enter the $number_of_names names")
    var names= arrayOfNulls<String>(number_of_names)

    // write a loop to take the names
    var position=0
    while (position < number_of_names){
        names[position] =sccanner_yangu.next()
        position++
    }
    for (jina in names){
        println(jina)
    }


    //create a logic that will capture both names and the admission numbers of any number of students


}