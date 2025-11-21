package io.github.epicvon2468.leetcodesolutions.valid_palindrome
// "14ms | Beats 30.88%"
// "46.83MB | Beats 25.22%"

/**
 * [Problem](https://leetcode.com/problems/valid-palindrome/)
 */
class Solution {

	fun isPalindrome(s: String): Boolean {
		if (s.length !in 1..200_000) return false
		var value = s.trim()
		val sb = StringBuilder(value.length)
		// I know about using `map` and `filter`, but this will save me from redundant iterations, doing the workload all at once
		for (entry: Char in value) {
			if (entry.isLetterOrDigit()) sb.append(entry.lowercaseChar())
		}
		value = sb.toString() // Reuse to avoid making a new variable
		return value == value.reversed()
	}
}