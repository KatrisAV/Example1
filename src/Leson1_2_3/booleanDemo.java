package Leson1_2_3;

public class booleanDemo {
    public static void main(String[] args){
        boolean b;

        b=false;
        System.out.println("Value ofb:" +b);
        b=true;
        System.out.println("now b is: "+b);

        if (b){
            System.out.println("This instruction is executed");
        }
        b=false;
        System.out.println("This instruction is not executed");
    }
}
