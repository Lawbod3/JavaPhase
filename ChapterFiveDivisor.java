import java.security.SecureRandom;
import java.util.Arrays;

public class ChapterFiveDivisor {

        public static void main(String[] args){

  int[][] empty = new int[4][3];

int[][] game = fillArrayWithRandomScore(empty);      
int[] total = findArcheryTotalScore(game);



String[] subOutput =  new String[game[1].length];
Arrays.fill(subOutput, "Hit"); 

System.out.println("----------------------------------------------------------------------------------");
System.out.println("---------------------------------------------------------------------------------\n");
System.out.print("PLAYERS      Hit1"); 
for(int row = 1; row < game[1].length; row++){ 
System.out.printf("%5s%d", subOutput[row], row + 1);
}
System.out.printf("%5s\n", "TOT");
System.out.println("----------------------------------------------------------------------------------");
System.out.println("---------------------------------------------------------------------------------\n");

for(int row = 0; row < game.length; row++){ 
System.out.printf("Player %d    ", row + 1);
for(int column = 0; column < game[1].length; column++){


System.out.printf("%5d",  game[row][column]);      

}
System.out.printf("%8d", total[row]);

System.out.println();
}

System.out.println("----------------------------------------------------------------------------------");
System.out.println("---------------------------------------------------------------------------------\n");












       System.out.println( "The total score of each player is " + Arrays.toString(findArcheryTotalScore(game)));
       System.out.println("The winner is player " + findArcheryWinner(game));
       System.out.println("The Index of the highest hit per round is " + Arrays.toString(findArcheryHighestHitIndex(game)));

       System.out.println("sum  divisor " + findDivisor(30, 3));







}


public static int findDivisor(int number, int divisor){
    int total = 0;
    if(number == 0 || divisor == 0)return 0;
    else{

      for(int count = 1; count <= number; count++){
    if(count % divisor == 0){
        total += count;
}

}

}
return total;

}

public static int[][] fillArrayWithRandomScore(int[][] game){

SecureRandom random = new SecureRandom();




for(int row = 0; row < game.length; row++){

for(int column = 0; column < game[1].length; column++){
game[row][column] = random.nextInt(10);

}

}


return game;



}


public static int[] findArcheryTotalScore(int[][] game){

   int[] total = new int[game.length];

   for(int row = 0; row < game.length; row++){
         int sum = 0;
    for(int column = 0; column < game[1].length; column++){
      sum += game[row][column];

}

total[row] = sum;

}

return total;

}
	
public static int findArcheryWinner(int[][] game){

  int winner = 0;
  int highestScore = Integer.MIN_VALUE;
  int[] total =  findArcheryTotalScore(game);

  for(int count = 0; count < total.length; count++){
   if(highestScore < total[count])highestScore = total[count];

}

for(int count = 0; count < total.length; count++){
   if(highestScore == total[count]){
     winner = count + 1;
    break;
}

}


return winner;


}

public static int[] findArcheryHighestHitIndex(int[][] game){

  int[] highestHitIndex = new int[2];
  int highestScore = Integer.MIN_VALUE;

 for(int row = 0; row < game.length; row++){
for(int column = 0; column < game[1].length; column++){
   if(highestScore < game[row][column])highestScore = game[row][column];
        
}

}

for(int row = 0; row < game.length; row++){
for(int column = 0; column < game[1].length; column++){
   if(highestScore == game[row][column]){
     highestHitIndex[0] = row;
     highestHitIndex[1] = column;
    break;
}

        
}

}


return highestHitIndex;
}




}