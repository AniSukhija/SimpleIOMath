import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Conversation with the user asking for input and returning the information for the outpiut
 * @version 10.03.2022
 * @author 23sukhija
 */
public class SimpleIOMath {
    //declaring instance variables
    private String name;
    private int age;
    private int favNumber;

    /**
     * Take input from the user
     */

    public void promptUser()    {
        Scanner in = new Scanner(System.in);
        System.out.println("* Sit yourself down, take a seat *\n* All you gotta do is repeat after me *");
        System.out.print("Question 1: What is your name? ");
        name = in.nextLine();
        System.out.print("Question 2: How old are you? ");
        age = in.nextInt();
        System.out.print("Question 3: What is your favorite number? ");
        favNumber = in.nextInt();
    }



    /**
     * Reprinting the info the user supplied the program.
     */
    public void printInfo() {
        System.out.println("I'm gonna teach you how to sing it out \n" + "Come on, come on, come on \n" +
                "Let me tell you what it's all about \n" + "Reading, writing, arithmetic");
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);
        System.out.println("At your next birthday, you will turn " + (age+1));
        System.out.println("The first prime factor of " + age + " is: " + smallestPrimeFactor(age));
        System.out.println("Your favorite number is: " + favNumber );
        System.out.println("Your favorite number squared is: " +favNumber*favNumber);
        System.out.println("* end of program *");
    }

    private boolean isPrime(int num)    {
        for(int i = 2; i <= Math.sqrt(num); i++)  {
            if(num % i == 0)
                return false;
        }
        return true;
    }

    private int smallestPrimeFactor(int num)    {
        for(int i = 2; i <= num; i++) {
            if (isPrime(i)) {
                if (num % i == 0)
                    return i;
            }
        }
            return num;
    }

    /**
     * Main method for class SimpleIOMath
     * @param args command-line arguments, if needed
     */
    public static void main(String[] args)  {
        SimpleIOMath app = new SimpleIOMath();
        app.promptUser();
        app.printInfo();
        //System.out.println(app.isPrime(1013));
        //System.out.println(app.smallestPrimeFactor(20));
    }
}
