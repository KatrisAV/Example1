package Leson5;

public class BrakeAsToGo {
    public static void main(String[] args) {
//        done:
        for (int i=1;i<12;i++){
            System.out.println(i+"mounth");
            for (int j=0;j<4;j++){
                System.out.println(j+"week");
                for (int k=1;k<8;k++){
                    System.out.println(k+"day");
//                    System.out.println(k+" ");
//                    if (k==1) break done;
                }
                System.out.println("After loop with counter k");
            }
            System.out.println("After loop with counter j");
        }
        System.out.println("After loop with counter i");
    }
}
