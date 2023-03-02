package Leson4;

public class DecrementFor {
    public static void main(String[] args) {
        int x;

        for(x=100;x>-100;x-=5){
            System.out.println(x);
        }
        System.out.println("last x is "+x);

        for (int count = 1;count<5;count++){
            System.out.println("This should be printed");
        }
        int i,j;
        for(i=0, j=10; i<j; i++, j--) System.out.println("smth");
    }
}
