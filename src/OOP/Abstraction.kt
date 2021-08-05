package OOP

fun main(args: Array<String>) {
    var xyz= MySecond("kafiyo", "kafiyo@gmail.com")
    println(xyz.name)
    xyz.acc_balance_checker()
    xyz.age_checker()

}
abstract class MyFirst(open var name:String, open var email:String){
    abstract fun age_checker()
    abstract fun acc_balance_checker()
}
class MySecond(override  var name:String, override  var email: String):MyFirst(name,email){
    override fun age_checker() {
        println("yeah , i can check age")
    }

    override fun acc_balance_checker() {
        println("yeah, i can check balance")
    }

}