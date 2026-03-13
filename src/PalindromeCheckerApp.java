import java.util.*;

public class PalindromeChecker {

    static boolean reverseMethod(String str){

        String rev = new StringBuilder(str).reverse().toString();

        return str.equals(rev);
    }

    static boolean twoPointerMethod(String str){

        int start = 0;
        int end = str.length()-1;

        while(start < end){

            if(str.charAt(start) != str.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("===================================================");
            System.out.println("|| Welcome to the PALINDROME CHECKER APPLICATION ||");
            System.out.println("===================================================");
            System.out.println("Version : 1.0");
            System.out.println("Author : Harshal");
            System.out.println();

            System.out.println("Press 'E' to Exit");
            System.out.println("Or Press Any Key To Continue");

            String input = sc.nextLine();

            if(input.equalsIgnoreCase("E"))
                break;

            System.out.println("Enter the string to test performance");

            String str = sc.nextLine();

            long start = System.nanoTime();
            reverseMethod(str);
            long end = System.nanoTime();

            System.out.println("Reverse Method Time : " + (end-start) + " ns");

            start = System.nanoTime();
            twoPointerMethod(str);
            end = System.nanoTime();

            System.out.println("Two Pointer Method Time : " + (end-start) + " ns");

            System.out.println();
        }

        System.out.println("Thanks For Using The App");
        System.out.println("Exiting...");
    }
}