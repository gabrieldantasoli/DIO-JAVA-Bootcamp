package Testes;

import static org.junit.jupiter.api.Assertions.*;import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;


//@TestMethodOrder(MethodOrderer.MethodName.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class TestesHello {
	
	@BeforeAll
	static void init() {
		System.out.println("Init");
	}
	
	@BeforeEach
	void ok() {
		System.out.println("ok");
	}
	
	@AfterEach
	void ok2() {
		System.out.println("ok2");
	}
	
	@AfterAll
	static void end() {
		System.out.println("End");
	}

	@Order(2)
	@Test
	void test() {
		System.out.println("Hello , World!");
		assertEquals(5, 3+2);
	}
	
	@Order(1)
	@Test
	void test2() {
		System.out.println("Have a good day!");
		assertEquals(5, 3+2);
	}

}
