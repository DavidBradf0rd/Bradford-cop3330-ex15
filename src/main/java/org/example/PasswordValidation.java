package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */
import java.util.Scanner;
public class PasswordValidation
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String valid = "abc$123";
        System.out.print( "What is the password? " );
        String pw = input.nextLine();

        if(valid.equals(pw))
        {
            System.out.println("Welcome!");
        }
        else
        {
            System.out.println("I don't know you.");
        }



    }
}
