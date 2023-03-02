package Leson4;

import java.util.Scanner;

public class GuessUpdate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch;
        char answer = 'S';

        System.out.println("The letter that you should guess is from the range A to Z");
        System.out.println("Try to guess it:");

        ch = input.next().charAt(0);


        if (ch == answer) {
            System.out.println("This is your result: ");
            System.out.println("You won!");
        }

        else {
            System.out.println("Sorry, but necessary letter is closr to the ");
            if(ch<answer){
                System.out.println("end of alphabet");
            } else {
                System.out.println("beginning of alphabet");
            }

    }
}
}
