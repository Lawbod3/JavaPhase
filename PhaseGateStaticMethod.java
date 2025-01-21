import java.util.ArrayList;
import java.util.Arrays;




public class phaseGateStaticMethod {

public static void main(String[] args){
	int[] num = {0, 1, 2, 3, 4};
	int[] num2 = {10, 6, 22, 8, 9, 0};
        
        int[] num3 = {5, 2, 6, 7, 4};

	String letter = "racEcar";


        System.out.println(Arrays.toString(median(num, num2)));

	System.out.println(Arrays.toString(sort(num2)));

	System.out.println(largest(num));
	System.out.println(primeNumber(8));
	System.out.println(Arrays.toString(factor(8)));
	System.out.println(largest(num));
	System.out.println(indexOfArray(num));
	System.out.println(Arrays.toString(combine(num, num2)));
	System.out.println(Arrays.toString(removeLargest(num2)));
	System.out.println(Arrays.toString(twoSum(num3, 13)));
	System.out.println(stringPalindrome(letter));

}

public static  boolean  primeNumber(int number){
	int passed = 0;
	for(int i = 1; i <= number; i++){
	if( number % i == 0 )passed++;   
}
 if (passed <= 2) return true;
 else return false;

}


public static  int[] factor(int number){
int count = 0;
for (int i = 1; i <= number; i++){
 if (number % i == 0)count++;
}

int[] result = new int[count];
int k = 0;
for (int i = 1; i <= number; i++){
if (number % i != 0)continue;
result[k] = i;  
k++;
}

return result;

}

public static int largest(int[] number){
 int largest = Integer.MIN_VALUE;
 for(int i = 0; i < number.length; i++){
 if( number[i ] > largest){
 largest = number[i];	
}
}
 return largest;
}

public static int indexOfArray(int[] number){
 int largest = Integer.MIN_VALUE;
 int count = 0;
 for(int i = 0; i < number.length; i++){
 if( number[i ] > largest){
 largest = number[i];
	
}
}
 for(int index = 0; index < number.length; index++){
 if(number[index] == largest){
  count = index;
 break;
}
}

return count;

}

public static int[] combine(int[] number, int[] number2){
int largest = Integer.MIN_VALUE;
int count = 0; 
int combineLength = number.length + number2.length; 
int[] combine = new int[combineLength];

for(int i = 0; i < number.length; i++){
 combine[i] = number[i];
count++;
}
 
for(int i = 0; i < number2.length; i++){
 combine[count + i] = number2[i];

}
  
return combine;

}  

public static int[] removeLargest(int[] number){

int[] remove = new int[number.length-1];
int largest = Integer.MIN_VALUE;
int count = 0;

for(int j = 0; j < number.length; j++){
  if(number[j] > largest) largest = number[j];
}

for(int index = 0; index < number.length; index++){
  if(number[index] == largest){
   count = index;
  break;
}
}
 int j = 0;
for(int i = 0;  i < number.length; i++){
 if (count != i){
   remove[j] = number[i];
j++;
}

}

return remove;
}


public static int[] twoSum(int[] number , int target){
  int[] result = new int[2];
  
   for(int i = 0, count = 0; i < number.length; i++){

 for(int j = 0 , count1 = 0; j < number.length; j++){
   if(number[i] + number[j] == target){
	 
	result[0] = i;
        result[1] = j;
}
}
}

return result;
}

//public static int[] ascending(int[] number){

//int result
//int smallest = Integer.MAX_VALUE; 


//}



public static boolean stringPalindrome(String letter){

	letter = letter.toUpperCase();
	char[] alphabet = letter.toCharArray();

	int rightside = alphabet.length - 1;
	int leftside = 0;

	while(leftside < rightside){
 	if (alphabet[leftside] != alphabet[rightside]){

	return false;
}

	leftside++;
	rightside--;

}
 return true;

}

public static int[] remove(int [] number , int identify){
int count = 0;
for(int j = 0; j < number.length; j++){
if(number[j] == identify)count++;
} 
int[] result = new int[number.length - count];
if(count < 1) return number;
else{
int k = 0; 
for(int i = 0; i < number.length; i++){
if(number[i] == identify)continue;
 result[k] = number[i];
k++;
}
}

return result;

}

public static int[] sort(int[] number){

for(int i = 0; i < number.length; i++){
for(int j = 0; j < number.length; j++){
 int temp = 0;

if(number[i] < number[j]){

temp = number[i];
number[i] = number[j];
 number[j] = temp;
}
}

}
return number;

}

public static int[] median(int[] number, int[] number2){

int combineLength = number.length + number2.length;
int[] combine = new int[combineLength];
int count = 0;

for(int i = 0; i < number.length; i++){
 combine[i] = number[i];

count++;
}

for(int i = 0; i < number2.length; i++){
 if(count != i){
 combine[count] = number2[i];

count++;
}
}

for(int i = 0; i < combineLength; i++){
for(int j = 0; j < combineLength; j++){
int temp = 0;
if(combine[i] < combine[j]){
 temp = combine[i];
 combine[i] = combine[j];
 combine[j] = temp;

}
}
} 

return combine;

} 














}




