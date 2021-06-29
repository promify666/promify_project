fun main(args: Array<String>) {
    println(evenSpaced(5, 7, 9))

}
fun evenSpaced (a:Int, b:Int, c:Int):Boolean {
    var firstDif: Int = a - b
    var secondDif: Int = b - c

    return firstDif == secondDif
    println(evenSpaced(2,4,6))
}