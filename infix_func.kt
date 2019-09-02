fun main(args : Array<String>)
{
    var a1 = Developer()
    a1.skills = "Java"
    a1.show()
    var a2 = Developer()
    a2.skills = "Sql"
    a2.show()
    var a3 = a1 add a2
    a3.show()

}
infix fun Developer.add(a:Developer):Developer
{
    var newDeveloper = Developer()
    newDeveloper.skills = this.skills+" "+a.skills
    return newDeveloper
}