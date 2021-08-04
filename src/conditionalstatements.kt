fun main(args: Array<String>) {
    var age:Int
    age= 18
    if (age< 18){
       println("you are underage")
    }else{
        println("you qualify")
    }
    var marks=34
    if (marks< 40){
        println("E")
    }else if (marks< 50){
        println("D")
    }else if (marks < 60){
        println("C")
    }else if (marks < 70){
        println("B")
    }else{
        println("A")
    }

    var number= 1
    when(number){
        1->{
            println("Number one is found")
        }
        2->{
            println("Number two is found")
        }
        3->{
            println("Number three is found")
        }
        else->{
            println("sorry, we don't know that number")
        }
    }

}