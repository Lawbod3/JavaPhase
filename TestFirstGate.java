import static  org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test; 

public class TestFirstGate{

            @Test
            public void testFindGreatestDivisor(){
            FirstGate myFirstGate = new FirstGate();
            assertEquals(25, myFirstGate.findGreatestDivisor(125, 2525));

}

            @Test
            public void testFindTwoHighest(){
            FirstGate myFirstGate = new FirstGate();
            int[] expected = {1,4,5,6,9,7,10,9};
            int[] result = {10,9};
            assertArrayEquals(result, myFirstGate.findTwoHighest(expected));

}

            @Test
            public void testFindTwoLowest(){
            FirstGate myFirstGate = new FirstGate();
            int[] expected = {4,7,9,-1,0};
            int[] result = {-1,0};
            assertArrayEquals(result, myFirstGate.findTwoLowest(expected));

}



           @Test
            public void testFindHighestLowest(){
            FirstGate myFirstGate = new FirstGate();
            int[] expected = {4,7,9,-1,0};
            int[] result = {9,-1};
            assertArrayEquals(result, myFirstGate.findHighestLowest(expected));

}

            @Test
            public void testCheckIndex(){
            FirstGate myFirstGate = new FirstGate();
            assertTrue( myFirstGate.checkIndex("1210"));

}

             @Test
            public void testCheckIndexTwo(){
            FirstGate myFirstGate = new FirstGate();
            assertFalse( myFirstGate.checkIndex("030"));

}



















}
