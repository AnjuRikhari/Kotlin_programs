class human(var n:String)
{
    var name:String= ""

    init {
        name=n
        println("Human is here")
    }
    fun think()
    {
        println("This is a Kotlin session "+n)
    }

}
fun main(args:Array<String>)
{
    var abc = human("Anju")
    abc.think()
}