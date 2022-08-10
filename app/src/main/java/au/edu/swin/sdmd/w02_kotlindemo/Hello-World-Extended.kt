package au.edu.swin.sdmd.w02_kotlindemo

fun main(args: Array<String>) {
    printHelloName(args[0])
}

fun printHelloName( name: String? ) {
    println("Hello ${name ?: "unknown"}")
}