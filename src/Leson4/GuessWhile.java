package Leson4;

import java.util.Locale;
import java.util.Scanner;

public class GuessWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ch;
        int endOfRange=65;
        int startOfRange=90;
        char answer =(char) (Math.random() * (endOfRange - startOfRange)+startOfRange);

        do{
            System.out.println("The letter that you should guess. Press '!' to quite the game " );
            System.out.println("Try to guess it:");
            ch = input.next().toUpperCase().charAt(0);

            if(ch<answer & ch!='!') System.out.println("Sorry, the necessary letter is closer to the end");
            else if (ch>answer & ch!='!')
                System.out.println("Sorry, the necessary letter is closer to th start");
            else if (ch==answer)System.out.println("Right");
        }while (ch!=answer && ch!='!');
        System.out.println("The right letter was "+ answer +".\nGood Bye");

        System.out.println(Math.random());

    }
}
