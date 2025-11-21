package io.github.epicvon2468.leetcodesolutions.happy_number
// "4ms | Beats 29.39%"
// "42.39MB | Beats 22.30%"

import kotlin.math.pow

/**
 * [Problem](https://leetcode.com/problems/happy-number/)
 */
class Solution {

	fun isHappy(n: Int): Boolean {
		if (n !in 0..Int.MAX_VALUE) error("Invalid size")
		var result: Int = summation(n)
		var count = 0
		while (result != 1) {
			count++
			result = summation(result)
			if (count > 20) break
		}
		return result == 1
	}
}

fun summation(num: Int): Int = num.toString().map(Character::getNumericValue).let {
	var result = 0
	for (entry in it) result += entry.toFloat().pow(2).toInt()
	return result
}