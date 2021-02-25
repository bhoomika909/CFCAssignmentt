package com.company.assignment1;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter greater number");
        int a= sc.nextInt();
        System.out.println("Enter smaller number");
        int b = sc.nextInt();
        int i;
        int hcf=1;
        for(i=1;i<=a;i++){
        if(a%i==0 && b%i==0){
            hcf= i;
        }

        }
        System.out.println("GCD of two numbers is:"+hcf);
    }
}
