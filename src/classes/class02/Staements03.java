package classes.class02;

import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Arrays;
import java.util.Scanner;

public class Staements03 {
    static Scanner in = new Scanner(System.in);  // Create a Scanner object

    public static void main(String[] args) {
        // Exercise01();
        // Exercise02();
        // Exercise03();
        // Exercise04();
        // Exercise05();
        // Exercise06(new int[]{1, 23, 43, 56, 4});
        // Exercise07(new String[]{"o", "l", "l", "e", "H"});
    }

    public static void Exercise01() {
        System.out.println("Exercise 01");
        System.out.println("\nPart A:"); // part a
        String[] arry = {"Austria", "Germany", "Canada", "Peru", "Israel"};
        for (String str : arry) {
            System.out.println(str);
        }
        System.out.println("\n\nPart B:"); // part b
        for (String str : arry) {
            if (str.equals("Israel")) {
                System.out.println(str);
            }
        }
        System.out.println("\n\nPart C:"); // part c

        System.out.println(arry[2].equals("China") ? "Yes, it is there" : "NO, sorry...");

        System.out.println("\n\nPart D:"); // part d
        System.out.println(arry[0].length());
    }

    public static void Exercise02() {
        System.out.println("Exercise 02");
        int[] numbers = {15, 2, 36, 20, 7};

        System.out.println("Part A:");
        if (numbers[0] > numbers[1]) {
            System.out.println("First One Is Bigger");
        } else {
            System.out.println("Second One Is Bigger");
        }

        System.out.println("\nPart B:");
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);

        System.out.println("\nPart C:");
        int biggest = 0;
        for (int number : numbers) {
            if (number > biggest)
                biggest = number;
        }
        System.out.println(biggest);
    }

    public static void Exercise03() {
        System.out.print("Exercise 03\nEnter yor age: ");
        int age = in.nextInt();  // Read user input
        if (age <= 6 && age >= 0) {
            System.out.println("Go to Kindergarten");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Go to School");
        } else if (age >= 19 && age <= 67) {
            System.out.println("Go to Work");
        } else if (age >= 68 && age <= 120) {
            System.out.println("Collecting Pension");
        } else {
            System.out.println("You are dead :( ");
        }
    }

    public static void Exercise04() {
        System.out.println("Exercise 04\nEnter your job: ");
        String jobName = in.nextLine();  // Read user job input

        switch (jobName) {
            case "Teacher":
                System.out.println("Teacher = 5,000");
                break;
            case "QA":
                System.out.println("QA = 1,5000");
                break;
            case "Bank Teller":
                System.out.println("Bank Teller = 10,000");
                break;
            case "Average Salary":
                System.out.println("Salary = 9,100");
                break;
            default:
                System.out.println("Error");

        }
    }

    public static void Exercise05() {
        String array[][] = {{"Moshe", "Joseph"}, {"22", "Jerusalem", "45", "London"}};
        for (String[] str : array) {
            System.out.println(Arrays.deepToString(str));
        }
    }

    public static void Exercise06(int[] numbers) {
        for (int number : numbers) {
            if (number % 4 == 0) {
                System.out.println(number);
            }
        }
    }

    public static void Exercise07(String[] word) {
//        for (int i = word.length-1; i >=0 ; i--){
//            System.out.print(word[i]);
//        }
//        for (int i = 1; i <= word.length; i++) {
//            System.out.print(word[word.length - i]);
//        }
//        for (int i = 0; i < word.length; i++) {
//            System.out.print(word[word.length - 1 - i]);
//        }
        int i = 0;
        do {
            System.out.print(word[word.length-i-1]);
            i ++;
        }
        while (i != word.length);
    }
}