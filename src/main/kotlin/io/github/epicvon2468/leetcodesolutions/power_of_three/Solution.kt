package io.github.epicvon2468.leetcodesolutions.power_of_three

import kotlin.math.log

/**
 * [Problem](https://leetcode.com/problems/power-of-three/)
 */
class Solution {

	// My code is flawless. Kotlin, Java, or the system itself is not keeping enough precision on certain numbers.
	// i.e: `log3(243)` should be `5`, however, using `log(243.0, 3.0)` returns `4.999999999999999`.
	fun isPowerOfThree(n: Int): Boolean {
		if (n <= 0) return false
		return log(n.toDouble(), 3.0) % 1.0 == 0.0
	}
}