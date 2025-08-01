package Channy;

import java.util.Scanner;

public class Channy{


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        int by;
        
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.print("Enter your birth year: ");
        by = sc.nextInt();
          
          int age = 2025 - by;
        System.out.println("Hello "+name+" youre birth year is "+age);
    }
    
}