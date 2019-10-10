package cse360assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AddingMachineTest {

	//@Test
	//void testAddingMachine() {
	//	fail("Not yet implemented");
	//}

	@Test
	void testAddingMachineInt() {
		AddingMachine a = new AddingMachine(5);
		assertNotNull(a);
	}

	@Test
	void testGetTotal() {
		AddingMachine a = new AddingMachine();
		a.add(5);
		a.subtract(1);
		a.getTotal();
		assertNotNull(a);
	}

	@Test
	void testAdd() {
		AddingMachine a = new AddingMachine();
		a.add(10);
		assertNotNull(a);
	}

	@Test
	void testSubtract() {
		AddingMachine a = new AddingMachine();
		a.subtract(3);
		assertNotNull(a);
	}

	//@Test
	//void testToString() {
		//fail("Not yet implemented");
	//}

	//@Test
	//void testClear() {
		//fail("Not yet implemented");
	//}

}
