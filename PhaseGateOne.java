import java.util.ArrayList;
import java.util.Arrays;

public class PhaseGateOne{

public static void main(String[] args){
	int[] num = {1,2,3,4,5};


	System.out.println(primeNumber(8));
	System.out.println(factor(8));
	System.out.println(index(num));
}

public static  boolean  primeNumber(int number){
	int passed = 0;
	for(int i = 1; i <= number; i++){
	if( number % i == 0 )passed++;   
}
 if (passed <= 2) return true;
 else return false;

}


public static  ArrayList<Integer> factor(int number){
ArrayList<Integer> taker = new ArrayList<>();
for (int i = 1; i <= number; i++){
 if (number % i == 0){
taker.add(i);}
}
return taker;
}

public static int index(int[] number){
 int largest = Integer.MIN_VALUE;
 for(int i = 0; i < number.length; i++){
 if( number[i ] > largest){
 largest = number[i];	
}
}
return largest;
}






}




