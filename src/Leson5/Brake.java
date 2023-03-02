package Leson5;

public class Brake {
    public static void main(String[] args) {
        int num = 100;

        for (int i=0; i<num; i++){
            if ((i*i)>=num) break;
            System.out.print(i+" ");
        }
        System.out.println("The loop is stopped.");
    }
}
