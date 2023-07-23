package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner readme= new Scanner(System.in);
        System.out.println("Enter the character");
        char ch;
        ch=readme.next().charAt(0);
        if(ch>='A'&&ch<='Z') {
            System.out.println(ch);
        }
        System.out.println(ch+"32");
    }
}
