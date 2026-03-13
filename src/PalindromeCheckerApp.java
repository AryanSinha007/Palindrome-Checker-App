import java.util.*;

public class PalindromeCheckerApp {

    static boolean checker(String str){

        LinkedList<Character> list = new LinkedList<>();

        for(char c : str.toCharArray()){
            list.add(c);
        }

        while(list.size() > 1){

            if(list.removeFirst() != list.removeLast()){
                return false;
            }
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
            System.out.println("Author : ARYAN");
            System.out.println();

            System.out.println("Press 'E' to Exit");
            System.out.println("Or Press Any Key To Continue");

            String input = sc.nextLine();

            if(input.equalsIgnoreCase("E"))
                break;

            System.out.println("Enter the string to check");

            String str = sc.nextLine();

            boolean result = checker(str);

            if(result)
                System.out.println("The String is a Palindrome");
            else
                System.out.println("The String is not a Palindrome");

            System.out.println();
        }

        System.out.println("Thanks For Using The App");
        System.out.println("Exiting...");
    }
}