package com.perscholas.java_basics;
public class JavaBasicsClass {
        public static void main(String[] args) {
            // Initial values
            int x = 5;
            int y = 8;

            // Pre-increment and assign
            int sum1 = ++x + y;
            System.out.println("Increment before addition: sum1 = " + sum1);

            // Post-increment and assign
            int sum2 = x++ + y;
            System.out.println("Increment after addition: sum2 = " + sum2);

            // Explanation
            System.out.println("Explanation:");
            System.out.println("Pre-increment: x becomes 6 before adding to y.");
            System.out.println("Post-increment: x remains 5 during addition and is incremented afterward.");
        }
    }