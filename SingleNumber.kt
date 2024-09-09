fun main (){
    val nums = intArrayOf(4,1,2,1,2)
    // val nums = intArrayOf(1)
    // val nums = intArrayOf(2, 2, 1)
    println(singleNumber(nums))
}

fun singleNumber(nums: IntArray):Int {
    val map = HashMap<Int, Int> ()
    for (i in nums) {
        map.put(i, map.getOrDefault(i, 0) + 1)
    } 
    for (i in nums) {
        if (map.get(i) == 1) {
            return i
        }    
    }
    return 0
}