import static  org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test; 
import java.security.SecureRandom;


public class TestArcheryTotalScore {


             @Test
             public void testFindArcheryTotalScore(){
             ChapterFiveDivisor myChapterFiveDivisor = new ChapterFiveDivisor();
              SecureRandom random = new SecureRandom();
             int numberOfPlayers = 4;
             int numberOfRounds = 3;
             int[][] expected = new int[numberOfPlayers][numberOfRounds];
             for(int row = 0; row < numberOfPlayers; row++){
             for(int column = 0; column < numberOfRounds; column++){
             expected[row][column] = random.nextInt(10);

}

}
             int[] result = myChapterFiveDivisor.findArcheryTotalScore(expected);


             assertEquals(result, myChapterFiveDivisor.findArcheryTotalScore(expected));
  
}
























}