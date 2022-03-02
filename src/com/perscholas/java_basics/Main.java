package com.perscholas.java_basics;
import java.util.Scanner;
public class Main {
     static void IntX(){
         int x = 7;
         if (x < 10){
             System.out.println("less than 10 ");
             System.out.println("===============>");
         }
     }
     static void LessThan10(){
         int x = 15;
         if (x < 10){
             System.out.println("x is less than 10 ");
         }else {
             System.out.println("x is greater than 10 ");
         }

     }
     static void GreaterThan10() {
         System.out.println("==================>");
         int x = 15;
         if (x < 10) {
             System.out.println("Less than 10");
         } else if (x > 10 || x < 20) {
             System.out.println("between 10 and 20");
         } else if (x >= 20){
             System.out.println("");
         }
     }
      static void IfElse(){
         int x = 5;
         if (x < 10 || x > 20){
             System.out.println("Out of range");
         }else if(x >= 10 && x <= 20){
             System.out.println("in range ====>");
         }
      }
      static void ScannnerClass(){
          Scanner myInt = new Scanner(System.in);
          // Enter your Score
          System.out.println("Enter your Score");
           int Score = myInt.nextInt();

          System.out.println(" IF your score is " + Score + " your Grade is ");

          if (Score >= 90 || Score <= 100 ){
              System.out.println('A');
          }else if(Score >= 80 || Score <= 89){
              System.out.println("B");
          }else if(Score >= 70 || Score <= 79){
              System.out.println("C");
          }else if(Score >= 80 || Score <= 89){
              System.out.println("D");
          }else if(Score < 60){
              System.out.println("F");
          }else if(Score < 0 || Score > 100){
              System.out.println("Score out of range");
          }
      }

    public static void main(String[] args) {
	// call out the method from the main
        IntX();
        LessThan10();
        GreaterThan10();
        IfElse();
        ScannnerClass();
    }
}
