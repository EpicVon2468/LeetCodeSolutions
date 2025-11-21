package io.github.epicvon2468.leetcodesolutions.add_digits
// "2ms | Beats 19.54%"
// "41.06MB | Beats 55.17%"

/**
 * [Problem](https://leetcode.com/problems/add-digits/)
 */
class Solution {

	fun addDigits(num: Int): Int {
		if (num !in 0..Int.MAX_VALUE) error("Invalid size")
		var result: Int = summation(num)
		while (result.toString().length > 1) result = summation(result)
		return result
	}
}

fun summation(num: Int): Int = num.toString().sumOf(Character::getNumericValue)