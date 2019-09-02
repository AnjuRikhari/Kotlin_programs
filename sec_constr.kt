class human2(var n:String)
{
    var name:String=""
    var num:String = ""
    constructor(hname:String,no:String):this(hname)
    {
        name =hname
        num = no
    }
    fun think()
    {
        println("this is "+num+" kotlin session "+name)
    }
}
fun main()
{
    var h1 = human2("Anju","second")
    h1.think()
}