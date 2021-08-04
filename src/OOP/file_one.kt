package OOP

import java.util.*

fun main(args: Array<String>) {
    var gari1= Car()
    println(gari1.model)

    var mwanafunzi1= student("Ahmed",25,"Emb/001")
    var mwanafunzi2= student("Gabs",24,"Emb/002")
    var mwanafunzi3= student("Dante",23,"Emb/003")
    var mwanafunzi4= student("Kafiyo",22,"Emb/004")
    println(mwanafunzi4.name+ " " +mwanafunzi4.age+mwanafunzi4.adm_no)
    mwanafunzi4.register()

    var chukua=Scanner(System.`in`)
    println("Enter name")
    var name=chukua.next()

    println("Enter age")
    var age= chukua.nextInt()
    println("Enter admission number")
    var admission= chukua.next()

    var mwanafunzi= student(name,age,admission)

    println(mwanafunzi.name+" "+mwanafunzi.age+" "+mwanafunzi.adm_no)
}


class Car{
    var model ="Mercedes 2016"
    var color= "Gray"
    var Price= 3000000.00
    fun accelerate(){
      println("yeah , I can accelerate")
    }
    fun brake(){
        println("yeah,I can brake")
    }


}

class student(name:String,age:Int, adm_no:String){
    var name:String
    var age:Int
    var adm_no:String

    //This is constructor
    init {
        this.name=name
        this.age=age
        this.adm_no = adm_no
    }
    fun register(){
        println("yeah , I can register ")
    }
    fun login(){
        println("yeah, I can login")
    }

}

