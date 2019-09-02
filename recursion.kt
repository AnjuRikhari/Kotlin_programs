import java.math.BigInteger

fun main(args:Array<String>)
{
    var num =BigInteger("70")
    println(fact(num))
}
fun fact(num:BigInteger):BigInteger
{
    if(num==BigInteger.ZERO)
        return BigInteger.ONE
    else
        return num*fact(num-BigInteger.ONE )            //5*fact(4)
                                                                //4*fact(3)
}