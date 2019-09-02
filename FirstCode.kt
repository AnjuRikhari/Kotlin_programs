fun main(args:Array<String>)
{
 /*   println("Hello world")
    var title = Alien()     //Kotlin Alien class
    title.name="Vishal"
    println("Name is "+title.name)
*/
    var title2 = Alien2()          //java Alien2 class
    title2.name = "Bhoomi"      //Kotlin by default class setName()
    println("Alien name is : ${title2.name}")        //kotlin by default calls getName()

    var num1 : Int = 4
    var num2: Int = 7
    var result : Int
    result = if(num1>num2)              // if-else expr in Kotlin
                num1
            else
                num2
    println("Greater number is: $result")

    var str : String? =null
    println("String contains $str value")
    println("Length of this String is ${str?.length}")

    var str1 : String = "4"
    var num:Int = str1.toInt()
    num++
    println(num)
}