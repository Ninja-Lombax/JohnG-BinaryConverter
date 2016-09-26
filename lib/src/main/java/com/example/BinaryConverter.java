package com.example;
import java.util.*;
//import java.util.Stack;

public class BinaryConverter
{
    public static void main(String[] args)
    {

       // System.out.println("Please enter an integer: ");
       // Scanner reader = new Scanner(System.in);
       // int decNumber = reader.nextInt();

        // System.out.println("Your integer converted into binary is: 0b" + Integer.toBinaryString(decNumber));

        // Allows a number input from the user
        System.out.println("Please enter an integer: ");
        Scanner myNumber = new Scanner(System.in);

        // LIFO method used to store binary representation of a number.
        Stack<Integer> stack = new Stack<Integer>();

        // Allows the user to input a decimal number that is then stored in another variable for output later on.
        int decNumber = myNumber.nextInt();
        int originalNumber = decNumber;

        /* Converts number to decimal*/
        while(decNumber != 0)
        {

            int d = decNumber % 2; // This determines if the current number has a remainder or not. Taking a value from modulus 2 either outputs a 1 or a 0
           // stack.push(isRemainder);
            stack.push(d); // either pushes the 1 or 0 into the stack from the above calculation
            decNumber /= 2; // This divides the number in half. This will continue until decNumber = 0

        }

        // Outputs original decimal number and binary number to console.
        System.out.println("\nYour decimal number is " + originalNumber + " and it converts to ");

        while(!(stack.isEmpty()))
        {

            System.out.print(stack.pop());
        }

        System.out.println(" in binary.");





  }
}
