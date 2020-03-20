package junit_saiabhijith;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_case {
	Remove rem = new Remove();
	@Test
	void test() {
		String res=rem.removal("AA");
		assertEquals("",res);
		}
	@Test
	void test2() {
		assertEquals("BCD",rem.removal("ABCD"));
	}
	@Test
	void test3() {
		assertEquals("BCC",rem.removal("BACC"));
	}
	@Test
	void test4() {
		assertEquals("",rem.removal(""));
	}
	@Test
	void test5() {
		assertEquals("BBAA",rem.removal("BBAA"));
	}
	@Test
	void test6() {
		assertEquals("",rem.removal("A"));
	}
	@Test
	void test7() {
		assertEquals("B",rem.removal("B"));
	}
}
