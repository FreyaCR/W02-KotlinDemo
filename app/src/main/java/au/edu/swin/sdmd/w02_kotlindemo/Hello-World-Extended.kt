package au.edu.swin.sdmd.w02_kotlindemo

fun main( args: Array<String> ) {
    printHelloName( if (args.isNotEmpty()) args[0] else null )
}

fun printHelloName( name: String? ) {
    println("Hello ${name ?: "unknown"}")
}