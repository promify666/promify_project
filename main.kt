fun main() {
    println(reverseArray(arrayListOf(32,5,78,45,3,9)))

}
fun reverseArray(myNums: ArrayList<Int>): ArrayList<Int>{
    var final = arrayListOf<Int>()
    for (i in myNums.indices) {
        val nums = myNums[myNums.size -1 -i]
        final.add(nums)
    }
    return  final
}