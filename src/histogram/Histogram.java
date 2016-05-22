/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package histogram;

import java.util.Scanner;

/**
 *
 * @author shotarohariu
 */
public class Histogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mark = 0;
        int count = 0;
        int countMarks = 0;
        int lowestMark = 101;
        int highestMark = 0;
        double average = 0;
        double TotalMarks = 0;
        final int passmark = 40;
        int PassedStudents = 0;
        int cat1 = 0, cat2 = 0, cat3 = 0, cat4 = 0;

        do {

            System.out.println("Enter a mark");
            if (input.hasNextInt()) {
                mark = input.nextInt();

                if (mark >= 101) {
                    System.out.println("Error: Invalid Mark");
                    break;
                }

                if (mark < 0) {
                    System.out.println("Error: Invalid Mark");
                    break;

                } else {

                    countMarks++;

                    TotalMarks = TotalMarks + mark;
                    if (mark < lowestMark) {
                        lowestMark = mark;
                    }

                    if (mark > highestMark) {
                        highestMark = mark;
                    }
                    if (mark >= passmark) {
                        PassedStudents++;
                    }

                    if (mark >= 0 && mark <= 29) {
                        cat1++;
                    }
                    if (mark >= 30 && mark <= 39) {
                        cat2++;
                    }
                    if (mark >= 40 && mark <= 69) {
                        cat3++;
                    }
                    if (mark >= 70 && mark <= 100) {
                        cat4++;
                    }
                }
            } else {
                System.out.println("Invalid Input");
                break;
            }
        } while (mark != 101);

        if (countMarks > 0) {
            average = TotalMarks / countMarks;

            System.out.print("0 - 29   ");

            for (int star1 = 0; star1 < cat1; star1++) {
                System.out.print("*");
            }

            System.out.println("");

            System.out.print("30 - 39  ");
            for (int star2 = 0; star2 < cat2; star2++) {
                System.out.print("*");
            }

            System.out.println("");

            System.out.print("40 - 69  ");
            for (int star3 = 0; star3 < cat3; star3++) {
                System.out.print("*");
            }

            System.out.println("");

            System.out.print("70 - 100 ");
            for (int star4 = 0; star4 < cat4; star4++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("Number of students are " + countMarks);
        System.out.println("Number of students who passed are " + PassedStudents);
        System.out.println("Average mark is " + average);
        System.out.println("The Lowest Mark is " + lowestMark);
        System.out.println("The Highest Mark is " + highestMark);

        System.out.print("0  -  29   ");
        System.out.print("30  -  39   ");
        System.out.print("40  -  69   ");
        System.out.print("70  -  100  ");
       
        for (int star1 = 0; star1 < cat1; star1++) {
            if (mark >= 0 || mark <= 29){
            System.out.println();
            System.out.println("   *"); // if mark is between 0 - 29 show the star
            }
            
            else {
            System.out.print(""); // else skip to the next category 
            
            
            }
            
        }
        
        for (int star2 = 0; star2 < cat2; star2++){
            if (mark >= 30 || mark <= 39){
            System.out.println();
            System.out.println("               *"); //if mark is between 30 - 39 show the star
            }
            
            else{
            System.out.print(""); //else skip 30 - 39 to the next category 
            }   
            
           
            }
        
        for (int star3 = 0; star3 < cat3; star3++) {
            if (mark >= 40 || mark <= 69){
                System.out.println();
                System.out.println("                           *");
            }
            else {System.out.print("");
            }
            
        }
        
        for (int star4 = 0; star4 < cat4; star4++) {
            if (mark >= 70 || mark <= 100){
                System.out.println();
                System.out.println("                                       *");
            }
            else {   System.out.print("");
            
            }
            }
        
        System.out.println("");
}
}