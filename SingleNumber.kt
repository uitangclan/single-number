fun main (){
    // val nums = intArrayOf(4,1,2,1,2)
    // val nums = intArrayOf(1)
    val nums = intArrayOf(2, 2, 1)
    println(singleNumber(nums))
}

fun singleNumber(nums: IntArray):Int? {
    val map = HashMap<Int, Int> ()
    for (i in nums.indices) {
        map.put(nums[i], i)
        println(!map.containsKey(1))
    }
    for (i in nums.indices) {
        if(!map.containsKey(1)) {
            return 500
        }
    }
    return null
}