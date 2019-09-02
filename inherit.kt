open class person
{
    open fun think()
    {
        println("real thinking")
    }
}
class newalien:person()
{
    override fun think()
    {
        println("Virtual thinking")
    }
}
fun main()
{
    var john=newalien()
    var smith:person=newalien()         //reference of person

    john.think()
    smith.think()
}