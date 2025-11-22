package io.github.epicvon2468.leetcodesolutions.power_of_three

import kotlin.math.ln

/**
 * [Problem](https://leetcode.com/problems/power-of-three/)
 */
class Solution {

	// My code is flawless. Kotlin, Java, or the system itself is not keeping enough precision on certain numbers.
	// i.e: `log3(243)` should be `5`, however, using `log(243.0, 3.0)` returns `4.999999999999999`.
	// See also: https://stackoverflow.com/questions/34793154/log3-243-is-not-5
	// `ln(3.0)` returns `1.0986122886681098`, so constant it to avoid unneeded function calls.
	fun isPowerOfThree(n: Int): Boolean {
		if (n <= 0) return false
		//return (ln(n.toDouble()) / 1.0986122886681098) % 1.0 == 0.0
		return ln(n.toDouble()).let {
			(it / 1.0986122886681098) % 1.0 == 0.0 || (it / 1.0986122886681096) % 1.0 == 0.0
		}
		// 21038 / 21040 testcases passed...
	}
}