package cn.bcbook.lesson2

/**
 * @author yyz (杨云召)
 * @date   2019/8/23
 * time   11:51
 * description
 * 1. 创建一个 Kotlin 类，这个类需要禁止外部通过构造器创建实例，并提供至少一种实例化方式
 * 2. 分别用 Array、IntArray、List 实现 「保存 1-100_000 的数字，并求出这些数字的平均值」，打印出这三种数据结构的执行时间
 * 结论：IntArray最快，Array List 各有胜负
 */
class Test private constructor() {
    companion object {
        fun getInstance(): Test = Test()
    }


    fun calculateArray() {
        val starTime = System.currentTimeMillis()
        val list = Array(100000, init = { i -> i + 1 })
        var sum = 0L
        for (i in list) {
            sum += i
        }
        val average = sum / list.size
        log("array平均值为：$average 用时为${System.currentTimeMillis() - starTime}")
    }

    fun calculateIntArray() {
        val startTime = System.currentTimeMillis()
        val list = IntArray(100000, init = { i -> i + 1 })
        var sum = 0L
        for (i in list) {
            sum += i
        }
        val average = sum / list.size
        log("intArray平均值为：$average 用时为${System.currentTimeMillis() - startTime}")
    }

    fun calculateList() {
        val startTime = System.currentTimeMillis()
        val list = List(100000, init = { i -> i + 1 })
        var sum = 0L
        list.forEach { sum += it }
        val average = sum / list.size
        log("List平均值为：$average 用时为${System.currentTimeMillis() - startTime}")
    }
}