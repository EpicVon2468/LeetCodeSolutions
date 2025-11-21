package io.github.epicvon2468.leetcodesolutions.length_of_last_word
// "8ms | Beats 42.11%"
// "42.35MB | Beats 52.46%"

/**
 * [Problem](https://leetcode.com/problems/powx-n/)
 */
class Solution {

	fun lengthOfLastWord(s: String): Int {
		if (s.length !in 1..10_000) error("Invalid size")
		if (s.trim().isBlank()) error("No word present")
		return s.trim().takeLastWhile { !it.isWhitespace() }.length
	}
}