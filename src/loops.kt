fun main(args: Array<String>) {
    var x=0
    while (x <=5){
        println(x)
        x++
    }
    var y= 10
    do {
        println(y)
        y++
    }while (y <=15)

   // var numbers=45..50
   var numbers =90 downTo 50
    for (nambari in numbers){
        println(nambari)
    }
    var names= arrayOf("grace", "mariga", "issack","liz", "Abdullahi", "Ahmed")
    for (jina in names){
        println(jina)
    }
    var z ="Golden"
    repeat(100){
        println(z)
    }

}