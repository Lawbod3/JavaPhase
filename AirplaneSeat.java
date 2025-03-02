import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

public class AirplaneSeat{

      public static void main(String[] args){

      Scanner input = new Scanner(System.in);

boolean[] seat = new boolean[10];
boolean booked = true;
boolean empty = false;

int seatFirstClass = 0;
int seatEconomyClass = 5;
int counter = 1;

  while(seatFirstClass != 5 || seatEconomyClass != 10){ 
printMenu();
try{
System.out.print("Please select your class choice: ");
int choice = input.nextInt();
validateSelection(choice);

switch(choice){
         case 1:  
                  if(seatFirstClass < 5){
                  seat[seatFirstClass] = booked;
                   printFlightHeader();
                 System.out.printf("Ticket sucessfully booked >>>>>>> Ticket number %dcfzv, Seat-A%d\n", counter, seatFirstClass + 1); 
                 printFlightSeat(seat);

                  seatFirstClass += 1;
                   break;}

                  else{ printFlightFullOption(); 
System.out.print("Please select your class choice: ");
int flyChoice = input.nextInt();
validateSelection(flyChoice);


if(flyChoice == 1){
 if(seatEconomyClass < 10 ){
 seat[seatEconomyClass] = booked;
 printFlightHeader();
 System.out.printf("Ticket sucessfully booked >>>>>>> Ticket number %dcfzv, Seat-A%d\n", counter, seatEconomyClass + 1);
 printFlightSeat(seat); 
 seatEconomyClass += 1;
 break;}
                      

 }

else if(flyChoice == 2){
System.out.println("\nNext flight leaves in 3 hours.");
break;}

}

         case 2: if(seatEconomyClass < 10 ){
                 seat[seatEconomyClass] = booked;
                   printFlightHeader();
           System.out.printf("Ticket sucessfully booked >>>>>>> Ticket number %dcfzv, Seat-A%d\n", counter, seatEconomyClass + 1); 
             printFlightSeat(seat);
                  seatEconomyClass += 1;
                   break;}

                  else{ printFlightOption(); 
System.out.print("Please select your class choice: ");
int flyFirstChoice = input.nextInt();
validateSelection(flyFirstChoice);

if(flyFirstChoice == 1){
if(seatFirstClass < 5){
seat[seatFirstClass] = booked;
 printFlightHeader();
System.out.printf("\nTicket sucessfully booked >>>>>>> Ticket number %dcfzv, Seat-A%d\n", counter, seatFirstClass + 1); 
 printFlightSeat(seat);
 seatFirstClass += 1;
   break;}
}

else if(flyFirstChoice == 2){
System.out.println("\nNext flight leaves in 3 hours.");
break;}

}

}

if(seatFirstClass == 5 && seatEconomyClass == 10)System.out.println("Flight is Fully Booked. Thanks for flying Tycoon AirLine.");

counter++;



}

catch(InputMismatchException e){

input.nextLine();
 System.out.println("Please only input digit");
 
}





}




}


public static void printMenu(){

System.out.print("""

Welcom to Tycoon AirLine
1. Fly First Class
2. Fly Economy Class
""");

}

public static void validateSelection(int choice){

Scanner input = new Scanner(System.in);
while(choice < 1 || choice > 2){
System.out.print("\nPlease choose between (1 or 2)....select(1 or 2) to go back to menu: ");
choice = input.nextInt();}

}

public static void printFlightFullOption(){
System.out.println("""

First Class is full, would you like to go for economy ?
1. Yes
2. No
""");

}


public static void printFlightOption(){
System.out.println("""

Economy Class is full, would you like to go for First Class ?
1. Yes
2. No
""");

}

public static void printFlightSeat(boolean[] seat){
for(int count = 0; count < seat.length; count++){
String seatStatus = String.format("Seat-A%d  %s", (count + 1), seat[count] ? "Booked" : "Empty");
System.out.println(seatStatus);
}

}


public static void printFlightHeader(){

System.out.println("""

============================================================
SEAT STATUS AND TICKET ISSUED
============================================================""");
}







}