fun main (){
    // val nums = intArrayOf(4,1,2,1,2)
    val nums = intArrayOf(1,2,3,1,2)
    // val nums = intArrayOf(1)
    // val nums = intArrayOf(2, 2, 1)
    println(singleNumber(nums))
}

fun singleNumber(nums: IntArray):Int {

    var a = 0
    for (i in nums) {
        a = a xor i
        println(a)
    } 
    return a
}