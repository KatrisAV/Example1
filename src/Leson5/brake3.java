package Leson5;

public class brake3 {
    public static void main(String[] args) {
        for (int i=0;i<3;i++){
            System.out.println(" Outer loop couter: "+i);
            System.out.print(" Inner loop couter: ");

            int t=0;
            while(t<100){
                if (t == 10)break;
                System.out.print(t+" ");
                t++;
            }
            System.out.println();
        }
    }
}
