package com.kata.foobarquix

import com.kata.foobarquix.services.FooBarQuixService
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class FooBarQuixApplicationTests {

	val fooBarQuixService = FooBarQuixService();

	@Test
	fun contextLoads() {
	}

	@Test
	fun fooBarQuixNumber1shouldReturn1() {
		assertEquals("1", fooBarQuixService.convertNumber(1))
	}

	@Test
	fun fooBarQuixNumber3shouldReturnFooFoo() {
		assertEquals("FooFoo", fooBarQuixService.convertNumber(3))
	}

	@Test
	fun fooBarQuixNumber5shouldReturnBarBar() {
		assertEquals("BarBar", fooBarQuixService.convertNumber(5))
	}

	@Test
	fun fooBarQuixNumber7shouldReturnQuix() {
		assertEquals("Quix", fooBarQuixService.convertNumber(7))
	}

	@Test
	fun fooBarQuixNumber9shouldReturnFoo() {
		assertEquals("Foo", fooBarQuixService.convertNumber(9))
	}

	@Test
	fun fooBarQuixNumber51shouldReturnFooBar() {
		assertEquals("FooBar", fooBarQuixService.convertNumber(51))
	}

	@Test
	fun fooBarQuixNumber53shouldReturnBarFoo() {
		assertEquals("BarFoo", fooBarQuixService.convertNumber(53))
	}

	@Test
	fun fooBarQuixNumber33shouldReturnFooFooFoo() {
		assertEquals("FooFooFoo", fooBarQuixService.convertNumber(33))
	}

	@Test
	fun fooBarQuixNumber27shouldReturnFooQuix() {
		assertEquals("FooQuix", fooBarQuixService.convertNumber(27))
	}

	@Test
	fun fooBarQuixNumber15shouldReturnFooBarBar() {
		assertEquals("FooBarBar", fooBarQuixService.convertNumber(15))
	}

}
