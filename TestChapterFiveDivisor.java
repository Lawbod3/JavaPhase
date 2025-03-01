import static  org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test; 

public class TestChapterFiveDivisor {


             @Test
             public void testFindDivisor(){
             ChapterFiveDivisor myChapterFiveDivisor = new ChapterFiveDivisor();
             assertEquals(165, myChapterFiveDivisor.findDivisor(30, 3));
  
}

             @Test
             public void testFindDivisorWillReturnZeroIfNumberIsZero(){
             ChapterFiveDivisor myChapterFiveDivisor = new ChapterFiveDivisor();
             assertEquals(0, myChapterFiveDivisor.findDivisor(0, 3));
  
}

              @Test
             public void testFindDivisorWillReturnZeroIfDivisorIsZero(){
             ChapterFiveDivisor myChapterFiveDivisor = new ChapterFiveDivisor();
             assertEquals(0, myChapterFiveDivisor.findDivisor(30, 0));
  
}


























}
