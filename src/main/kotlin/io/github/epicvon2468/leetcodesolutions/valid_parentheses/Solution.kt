package io.github.epicvon2468.leetcodesolutions.valid_parentheses

import kotlin.system.exitProcess

// TODO: Finish. Will come back to this later.
/**
 * [Problem](https://leetcode.com/problems/valid-parentheses/)
 */
class Solution {

	fun isValid(s: String): Boolean {
		if (s.length !in 1..10_000) return false
		if (!s.all(VALID::contains)) return false
		val stack = ArrayDeque<Char>(s.length)
		var last: Char = s.first()
		stack.addLast(last)
		for (paren: Char in s.substring(1)) {
			stack.addLast(paren)
			// TODO: Cleanup?
			when (paren) {
				'(', '[', '{' -> openParen(paren, last, stack).let {
					if (!it) return false
					last = paren
					continue
				}
				')', ']', '}' -> closeParen(paren, last, stack).let {
					if (!it) return false else continue
				}
			}
		}
		return true
	}
}

fun Char.opposite(): Char = when (this) {
	'(' -> ')'
	')' -> '('
	'[' -> ']'
	']' -> '['
	'{' -> '}'
	'}' -> '{'
	else -> exitProcess(-1)
}

fun openParen(paren: Char, last: Char, stack: ArrayDeque<Char>): Boolean {
	if (paren.opposite() != last) return false
	TODO()
}

fun closeParen(paren: Char, last: Char, stack: ArrayDeque<Char>): Boolean {
	TODO()
}

@JvmField
val VALID: Array<Char> = arrayOf('(', ')', '[', ']', '{', '}')