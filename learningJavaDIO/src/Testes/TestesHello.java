package Testes;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestesHello {

	@Test
	void test() {
		System.out.println("Hello , World!");
		assertEquals(5, 3+2);
	}

}
