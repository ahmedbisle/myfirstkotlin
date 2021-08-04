fun main(args: Array<String>) {
        motto()
        mission()
        avg(300,54.458,1234.345f)
        rectangle_area(20.5,24.6)
    cylinder_volume("Bisle",787.9,40.5)
            


}
fun motto() {
    println("Hey ,this is our Motto")
}
fun mission(){
    println("Hey, this is our mission")
}
fun avg(x:Int, y:Double, z:Float){
    var average =(x+y+z)/3.0
    println("Your average is $average")
}
fun rectangle_area(l:Double, w:Double){
    var area=l*w
    println("Your area is $area")
}
fun cylinder_volume(n:String,r:Double,h:Double){
    var volume= Math.PI * Math.pow(r,2.0) *h

    if (volume<10000){
        println("hi $n , your vole is $volume and this is a small cylinder")
        println("hi $n , your vole is $volume and this is a large cylinder")
    }
}