package practice;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        System.out.println("Enter your Grade: ");
        Scanner gradeInput = new Scanner(System.in);
        int grade = gradeInput.nextInt();

        if(grade <= 100 && grade >= 93){
            System.out.println("A");
        } else if(grade <= 92 && grade >= 90){
            System.out.println("A-");
        } else if(grade <= 89 && grade >= 87){
            System.out.println("B+");
        } else if(grade <= 86 && grade >= 81){
            System.out.println("B");
        } else if(grade <= 80 && grade >= 77){
            System.out.println("C+");
        } else if(grade <= 76 && grade >= 73){
            System.out.println("C");
        } else if(grade <= 72 && grade >= 70){
            System.out.println("C-");
        } else if(grade <= 69 && grade >= 65){
            System.out.println("A");
        } else{
            System.out.println("F");
        }
    }
}
