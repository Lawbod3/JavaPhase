import java.util.Arrays;
import java.util.ArrayList;

public class FirstGate {

      public static void main(String[] args){
     int[] expected = {1,6,7,8,1000};
     int[] lowest = {4,7,9,-1,0};
     int[] result = {1,2,3,2};

      System.out.println(findGreatestDivisor(125, 0));
     //System.out.println(Arrays.toString(findTwoHighest(expected)));
    // System.out.println(Arrays.toString(findTwoLowest(lowest)));
       System.out.println((checkIndex("030")));
	System.out.println(sumUniqueNumber(result));






}
public static int findGreatestDivisor(int numberOne,  int numberTwo){
   int answer = 0;
 if(numberOne == 0 || numberTwo == 0) return 0;
else{
   int bound = numberOne;
   if(numberOne < numberTwo )bound = numberTwo; 
    for(int counter = 1; counter <= bound; counter++){
     if( numberOne % counter == 0 &&  numberTwo % counter == 0){
        answer = counter;
}
}
 
}
 return answer;


}

public static int[] findTwoHighest(int[] number){
    int[] result = new int[2];
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    int count = 0;

    for(int counter = 0; counter < number.length; counter++){
    if(largest < number[counter]){
    largest = number[counter];
    count = counter;}
}
    result[0] = largest;
    number[count] = 0;

for(int counter = 0; counter < number.length; counter++){
    if(secondLargest < number[counter])secondLargest = number[counter];
}

   result[1] = secondLargest;

return result;
}


public static int[] findTwoLowest(int[] number){
    int[] result = new int[2];
    int lowest = Integer.MAX_VALUE;
    int secondLowest = Integer.MAX_VALUE;
    int count = 0;

    for(int counter = 0; counter < number.length; counter++){
    if(lowest > number[counter]){
    lowest = number[counter];
    count = counter;}
}
    result[0] = lowest;
    number[count] = 0;

for(int counter = 0; counter < number.length; counter++){
    if(secondLowest > number[counter])secondLowest = number[counter];
}

   result[1] = secondLowest;

return result;
}


public static int[] findHighestLowest(int[] number){
int[] result = new int[2];
int largest = Integer.MIN_VALUE;
 int lowest = Integer.MAX_VALUE;

 for(int counter = 0; counter < number.length; counter++){
    if(largest < number[counter]){
    largest = number[counter];}
}
  result[0] = largest;

for(int counter = 0; counter < number.length; counter++){
    if(lowest > number[counter]){
    lowest = number[counter];}
}

 result[1] = lowest;

return result;

}



public static boolean checkIndex(String number){
    char[] wordArray = new char[number.length()];
     wordArray = number.toCharArray();

  ArrayList<Integer> checkStore = new ArrayList<>();

  for(char num : wordArray){
         int check = Integer.parseInt((num+""));
         checkStore.add(check);

}
  int counter = 0;
  for(int outer = 0; outer < checkStore.size(); outer++){
    int count = 0;

 for(int inner = 0; inner < checkStore.size(); inner++){

    if(outer == checkStore.get(inner))count++;
      
    

}
 if(!(count == checkStore.get(outer)))return false;

}

return true;

}


public static int sumUniqueNumber(int[] number){
 int total = 0;
  
 for(int outer = 0; outer < number.length; outer++){
 int count = 0;
  for(int inner = outer + 1; inner < number.length; inner++){
    if(number[outer] != number[inner]){
     count = outer;
}    	
}

total = number[count];
}


return total;

}












}