package au.edu.swin.sdmd.w02_kotlindemo

fun main() {
    greetStudent( "Hello", "Freya" )
    greetStudent( name = "Freya" )
    greetStudent( "Hi", null )
    greetStudent( name = null )
}

fun greetStudent(greeting: String = "Welcome", name: String?) {
    println("$greeting ${formatName(name)}")
}

fun formatName(name: String?) = name ?: "random student"