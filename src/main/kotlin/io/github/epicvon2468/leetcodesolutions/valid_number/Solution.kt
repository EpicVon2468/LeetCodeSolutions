package io.github.epicvon2468.leetcodesolutions.valid_number
// "5ms | Beats 58.70%"
// "42.86MB" | Beats 73.91%"

/**
 * [Problem](https://leetcode.com/problems/valid-number/)
 */
class Solution {

	fun isNumber(s: String): Boolean =
		s.length in 1..20 && NUMBER matches s
}

@JvmField
val NUMBER: Regex = Regex("(^[-+]?((\\d+\\.\$)|((\\d+)?\\.?\\d+(\\.?[eE]((\\d+)|([-+]\\d+)))?)))")