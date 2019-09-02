@file: JvmName("First")

fun main(args:Array<String>)
{
    var result = add(4,5)
    println(result)
    var mxm = max(6,54)
    println(mxm)
}
 fun add(a:Int,b:Int) : Int=a+b        //inline function
 /*{
     return a+b
 }*/
fun max(a:Int,b: Int):Int=if(a>b) a else b
/* {
     if(a>b)
         return a
     else
         return b
 }*/
