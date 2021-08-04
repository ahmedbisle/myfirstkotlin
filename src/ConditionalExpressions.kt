fun main(args: Array<String>) {
    var x= 0
    var y= if (x<10){
        "x is less than 10"
    }else{
        "x is not less than 10"
    }
    println(y)

    var number= 3
    var result= if (number==1){
        "ooops!!! you lost"
    }else if(number == 2){
        "Ooops!!! You lost"
    }else if (number == 3){
        "Congrats!!! You won"
    }else{
        "please Enter a number from 1 to 4"
    }
    println(result)


    var a= 0
    var b = when (a){
        1->{
            "one was found"
        }

        2->{
        "Two was found"
    }
        3->{

            "Three was found"
        }
        else->{

            "sorry, we don't know that number"
        }

        }
        println(b)




}