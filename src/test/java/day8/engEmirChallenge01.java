package day8;

import org.jetbrains.annotations.NotNull;

import static org.apache.commons.lang3.StringUtils.reverse;
/*
public class engEmirChallenge01 {



    Hello guys! I have exciting challenges for you about Java. This is going to be an optional challenge so you do not have to attend if you do not desire. There are 5 questions which I believe are the good ones. By trying to solve those, you'll be improving yourselves with no doubt. Here are the questions:
//1. Write a Java Program that reverses a string
*/
//public class ReverseString {
/*
    public static @NotNull String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }}
*//*
    public static void main(String[] args) {
        String originalString = "Hello World!";
        String reversedString = reverse(originalString);
        System.out.println("Original string: " + originalString);
        System.out.println("Reversed string: " + reversedString);
    }}


} *//*
//2. Write a Java Program to swap two numbers

//public class SwapNumbers {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }


    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;
        System.out.println("Before swapping: a = " + firstNumber + ", b = " + secondNumber);
        swap(firstNumber, secondNumber);
    }
}
*/

/*
//3. Write a Java Program that prints fibonacci number due to given integer (11235811...)

//public class Fibonacci {

    public static void printFibonacci(int n) {
        int a = 0, b = 1, c;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.print("Fibonacci Series: ");
        printFibonacci(n);
    }
}
*/

//4. Write a Java Program that checks whether given integer is Prime or not
//public class CheckPrime {
/*


    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 13;
        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}*/
/*
//5. Write a Java Program that takes an array and returns the difference between the biggest and the smallest numbers.
*/
//public class ArrayDifference {
/*
    public static int findDifference(int[] arr) {
        if (arr.length == 0) {
            return -1; // Handle empty array case
        }
        int min = arr[0], max = arr[0];
        for (int num : arr) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 18, 1};
        int difference = findDifference(arr);
        if (difference != -1) {
            System.out.println("Difference between the biggest and smallest numbers: " + difference);
        } else {
            System.out.println("Array is empty.");
        }
    }
}
*//*

There are 20 of them. If anyone finishes the first 5, I can give the other 5. Let's see whoever reaches to level 20. I'll name him/her as "Java King/Queen" :crown:




}
        */