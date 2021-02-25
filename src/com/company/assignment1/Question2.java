package com.company.assignment1;
import java.util.Scanner;
public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE AMOUNT, RATE AND TIME:");
        int amount = sc.nextInt();
        int rate = sc.nextInt();
        int time = sc.nextInt();
        double si= (amount*rate*time)/100.0;
        System.out.println("SIMPLE INTEREST : "+si);
    }
}
