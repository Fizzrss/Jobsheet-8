import java.util.Scanner;

public class Tugas09nomer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = 4;

        for (int i = 1; i <=  N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i  == 1 || i == N || j == 1 || j == N) {
                    System.out.print(" 4 ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
