package Leson4;

import java.io.IOException;

public class input {
    public static void main(String[] args) throws IOException {
        char ch;
        System.out.println("enter a symbol and press [Enter]");
        ch = (char)System.in.read();
        System.out.println("You entered symbol" + ch);
    }
}
