public class phaseGateMethod {

public  boolean  primeNumber(int number){
	int passed = 0;
	for(int i = 1; i <= number; i++){
	if( number % i == 0 )passed++;   
}
 if (passed <= 2) return true;
 else return false;

}


public  int factor(int number){
for (int i = 1; i <= number; i++){
 if (number % i == 0){
 return i;}

}


public int[] index(int[] number){
 int largest = Integer.MAX_VALUE;
 for(int i = 0; i <= number.length; i++){
 if( number[i] > largest){
 largest = number[i];	
}
}
return largest;
}











}