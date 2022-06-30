package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER FIRST NAME:");
        String firstName = scanner.next();
        System.out.println(Pattern.matches("[A-Za-z]{4}",firstName));
        System.out.println("ENTER LAST NAME");
        String LastName = scanner.next();
        System.out.println(Pattern.matches("[A-Za-z]{4,}",LastName));
        System.out.println("ENTER Email");
        String Email = scanner.next();
        System.out.println(Pattern.matches("[a-z][A-Za-z0-9]+[@][a-z]+[.]+[a-z]{2,5}",Email));
        System.out.println("Ph Num");
        String PhNum = scanner.next();
        System.out.println(Pattern.matches("[0-9]{2}\s[0-9]{10}",PhNum));
        System.out.println("ENTER PINCODE");
        String PINCODE = scanner.next();
        System.out.println(Pattern.matches("[0-9]{6}",PINCODE));
        System.out.println("PASSWORD");
        String PASSWORD = scanner.next();
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]{4}+[@]+[0-9]{2,5}",PASSWORD));

    }
}
