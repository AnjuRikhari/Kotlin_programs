import java.math.BigInteger

fun main(args:Array<String>)
{
    var num =BigInteger("7000")
    println(fact(num,BigInteger.ONE))
}
fun fact(num:BigInteger,result:BigInteger):BigInteger
{
    if(num==BigInteger.ZERO)
        return result
    else
        return fact(num-BigInteger.ONE ,num*result)            //5*fact(4)
    //4*fact(3)
}