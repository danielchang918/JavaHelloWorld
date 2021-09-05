package com.example.lab1;
import java.util.Scanner;

public class Main {
	
	/**
	 * This is the main method of lab1
	 * @author Chang Hyun Woo
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); //declares scanner
		System.out.println("Hello World!!!\n"); 
		System.out.print("이름 입력 : "); //Input name
		String name = s.next();
		System.out.println("[" + name + "]님 환영합니다~!"); //greeting message with the input name
	}

}
