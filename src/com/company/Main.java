package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc= new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(a!=0){
            double solution=-b/a;
            System.out.println("the solution is "+solution);
        }
        if(a==0) {
            double answer = (c - b) / a;
            System.out.println("Equation pass with "+answer);
        }else if(b==0){
            System.out.println("The solution is all x");
        }else {
            System.out.println("No solution");
        }
    }
}
