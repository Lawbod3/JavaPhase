import static org.junit.jupiter.api.Assertions.assertEquals;
import  org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;



public class TestPhaseGateOne {

	@Test
	public void testThatMethodFindPrimeNumber() {

        PhaseGateOne myTest = new PhaseGateOne();

        assertEquals(true,  myTest.primeNumber(7));

}


	@Test
        public void testThatMethodCanFindFactor() {

	 PhaseGateOne myTest = new PhaseGateOne();
	 
         int[] answer = {1, 2, 3, 4, 6, 12};
          
	 assertEquals(answer, myTest.factor(12));

}

	@Test
        public void testThatMethodCanFindLargestInArray() {

	PhaseGateOne myTest = new PhaseGateOne();
	int[] question = {5, 13, 67, 9, 0, 33, 10};

	assertEquals(67, myTest.largest(question));

}

	@Test
        public void testThatMethodCanFindIndexOfLargestInArray() {

	PhaseGateOne myTest = new PhaseGateOne();
	int[] question = {501, 13, 67, 9, 0, 33, 10};

	assertEquals(0, myTest.indexOfLargest(question));

}

	@Test
        public void testThatMethodCombineTwoArrayIntoSingleArray() {

	PhaseGateOne myTest = new PhaseGateOne();

	int[] question = {0, 1, 2, 3, 4};
	int[] question2 = {5, 6, 7, 8, 9, 10};

	int[] answer = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertEquals(Arrays.toString(answer), Arrays.toString(myTest.combine(question, question2)));


}

	@Test
        public void testThatMethodRemoveLargestInArray() {

	PhaseGateOne myTest = new PhaseGateOne();

	int[] question = {501, 13, 67, 9, 0, 33, 10};

	int[] answer = {13, 67, 9, 0, 33, 10};

	

  assertEquals(answer, myTest.removeLargest(question));

}

	@Test
        public void testThatMethodToFindIndexOfSumOfTwonumberInArray () {

	PhaseGateOne myTest = new PhaseGateOne();

	int[] question = {501, 13, 67, 9, 0, 33, 10};
	int[] answer = {2, 0};
      assertEquals(Arrays.toString(answer), Arrays.toString(myTest.twoSumIndex(question, 568)));


}





}