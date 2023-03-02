package Leson4;

import java.util.Scanner;
public class Guess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch;
        char answer = 'S';

        System.out.println("The letter that you should guess is from the range A to Z");
        System.out.println("Try to guess it:");

        ch = input.next().charAt(0);

//        if (true/false statement){if_true_action}
//        else {if false action}

        if (ch == answer) {
            System.out.println("This is your result: ");
            System.out.println("You won!");
        }

        else {
            System.out.println("You loose Your guess is" +ch+", but answer is "+ answer);
        }

        }
    }

