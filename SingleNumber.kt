fun main (){
    val nums = intArrayOf(4,1,2,1,2)
    // val nums = intArrayOf(1)
    // val nums = intArrayOf(2, 2, 1)
    println(singleNumber(nums))
}

fun singleNumber(nums: IntArray):Int {

    var set = HashSet<Int>()
    var j = 0
    var k = 0

    for (i in nums) {
        if (!set.contains(i)) {
            set.add(i)
            j += i
        }
        k += i
    } 
    return 2 * j -k
}