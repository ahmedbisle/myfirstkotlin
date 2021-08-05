package OOP

fun main(args: Array<String>) {
var teacher = Mwalimu("ahmed@gmail.com","ahmed123")
    teacher.register()
    teacher.add_marks()
}
 open class mwanafunzi(open var email:String,open var password:String){

    fun register(){
        println("yeah, i can register")
    }
    fun login(){
        println("yeah,   i can login")
    }

 }
class Mwalimu(override var email: String,override var password:String):mwanafunzi(email,password){
    fun add_marks(){
        println("yeah, add marks")
    }



}