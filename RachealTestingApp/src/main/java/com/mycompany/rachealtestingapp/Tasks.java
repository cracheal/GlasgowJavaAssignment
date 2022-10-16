/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rachealtestingapp;

/**
 *
 * @author RACHEAL OMODANISI
 */
import java.util.Scanner; 
import java.io.*;
import java.util.*;
public class Tasks {
        public void printPrimes() 
        { 
        System.out.println("Emter the Parameter: ");
        Scanner scanner = new Scanner( System.in );
        int maxParameter = scanner.nextInt();
        System.out.println("List of the prime number between 1 - " + maxParameter);
 
        for (int num = 2; num <= maxParameter; num++)
        {
            boolean isPrime = true;
            for (int i=2; i <= num/2; i++)
            {
                if ( num % i == 0)
                {
                    isPrime = false;
                    break;
                }
            }
 
            if ( isPrime == true )
                System.out.println(num);
        }
    } 
        
        public void computeFabonicci()
        {
            System.out.println("Emter the Nth number: ");
            Scanner scanner = new Scanner( System.in );
            int NthNumber = scanner.nextInt();
            System.out.println("List of the fibonacci for the " + NthNumber);
            int firstTerm = 0, secondTerm = 1;
            System.out.println("Fibonacci Series till " + NthNumber + " terms:");

            for (int i = 1; i <= NthNumber; ++i) {
              System.out.print(firstTerm + ", ");
              // compute the next term
              int nextTerm = firstTerm + secondTerm;
              firstTerm = secondTerm;
              secondTerm = nextTerm;
            }

      }
        
       public void computeScore()
       {
            System.out.println("Enter the end word ");
            Scanner scanner1 = new Scanner( System.in );
            String endWord = scanner1.next();
           int totalScore = 0;
           System.out.println("End  Word is "+ endWord);
            while(endWord !=  "end" | endWord != "END")
            {
                //Process the scrable game
                
                System.out.println("Enter the word ");
                Scanner scanner = new Scanner( System.in );
                String word = scanner.next();
                //char [] wordArray = word.toCharArray();
                int scrableNum = 0;
                 for (int i = 0; i < word.length(); i++) {
                     System.out.println("total score "+ totalScore);
                     System.out.println("Word "+ word.charAt(i));
                     System.out.println("ScrableNum "+ scrableNum);
                     System.out.println("----------------------------");
                     scrableNum = scrableDecision(word.charAt(i));
                    totalScore = totalScore + scrableNum;
                }
                System.out.println("Total is "+ totalScore);
            }
            
          
       }
       
       //Check the Character
       private boolean checkCharacter(char character, char[] array)
       {
            for (char x : array) {
                if (x == character) {
                    return true;
                }
            }
            return false;
        }
        
        private int scrableDecision(char param)
        {
            //char[] arrScrable = new char[] { 'A','B', 'g', 'e', 'e', 'k', 's' }; 
            int returnItem = -1;
            switch(param) {
                    case 'A':  case 'a':
                       returnItem = 1;
                      break;
                    case 'B': case 'b': case 'C': case 'c':
                        returnItem = 3;
                        break;
                    case 'D': case 'd':
                        returnItem = 3;
                        break;
                    case 'E': case 'e':
                        returnItem = 1;
                        break;
                    case 'F': case 'f':
                        returnItem = 4;
                        break;
                    default:
                      // code block
            }
            /*
            if (!(new String(arrScrable).contains(Character.toString(param)))) {
                // do something
                System.out.println("This is not a valid scrable character ");
                
            }
            else if (new String(arrScrable).contains(Character.toString(param)))
            { 
                
                
            }
*/
           return returnItem;     
        }
        
}
 
 
