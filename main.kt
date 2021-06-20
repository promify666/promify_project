fun main() {
   var str = "Good Food"
   var reverse = str.reversed ()
   println(reverse)

}
fun main(args: Array<String>) {
   for (i in 1..100){
      when{
         (i % 3 == 0 && i % 5 == 0) ->
            println("FIZZBUZZ")
         i % 3 == 0 -> println("Fizz")
         i % 5 == 0 -> println("Buzz")
         else -> println("$i")
      }
   }

}