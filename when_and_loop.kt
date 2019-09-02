fun main(args:Array<String>)
{
    val num : Int = 2       //val is used for declaring constants
   // var name: String ="abc"

  var str =  when(num)               //when expr
    {
        1-> "one"                   //in  place of pritln("one")
        2-> "two"
        3-> "three"
        else-> "give a proper input"

    }
    println("Number : $str")

    var nums = 1..5
    for (a in nums step 2)      //step 2 to print the number by taking 2 steps
    {
        println(a)
    }
    for ((i,e) in nums.withIndex())
    {
        println("$i:$e")
    }
}