fun main (){
    val nums = intArrayOf(4,1,2,1,2)
    // val nums = intArrayOf(1)
    // val nums = intArrayOf(2, 2, 1)
    println(singleNumber(nums))
}

fun singleNumber(nums: IntArray):Int? {
    var list = mutableListOf<Int> ()
    for (i in nums) {
        if (!list.contains(i)) {
            list.add(i)
        } else {
            list.remove(i)
        }
    }
    return list[0]
}