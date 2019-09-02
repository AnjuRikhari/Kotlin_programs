fun main(args:Array<String>)
{
    var a1=Developer()
    a1.skills = "Java"
    a1.show()

    var a2=Developer()
    a2.skills = "SQL"
    a2.show()

    var a3 = a1+a2                      // for ext func write a1.plus(a2)
    a3.show()
}

operator infix fun Developer.plus(a:Developer):Developer
{
    var newDeveloper = Developer()
    newDeveloper.skills = this.skills+" "+a.skills
    return newDeveloper
}