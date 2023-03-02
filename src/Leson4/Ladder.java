package Leson4;

import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        int x;

//        for(x=0; x<6; x++){
//            if (x==1)
//                System.out.println("x is equal to 1");
//            else if (x==2)
//                System.out.println("x is equal to 2");
//            else if (x==3)
//                System.out.println("x is equal to 3");
//            else if (x==4)
//                System.out.println("x is equal to 4");
//            else System.out.println("x is " + x + " and out of range 1-4");
//        }
        Scanner input = new Scanner(System.in);

        System.out.println("Enter chapter: ");
        char ch1 = input.next().charAt(0);
        char ch2 ;

        switch (ch1){
            case'1':
                System.out.println("This is \"A\" section of our OUTER switch");
                System.out.println("This chapter has more than 1 section. Pleas nte the necessary section");
                ch2 = input.next().charAt(0);
                switch (ch2){
                    case'2':
                        System.out.println("This is \"I\" section of ou Inner switch");
                }
                break;
            case 'B':
                System.out.println("This is \"A\" section of our OUTER switch");

        }
    }
}

