package day03;

public class HomeWork {

        //打印等腰三角形
        public static void main(String[] args) {
            int num = 6;
            for (int i = 0; i < num; i++) {
                for (int j = 0; j < num-i-1; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <(i*2-1) ; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
