import java.util.Scanner;

public class Homework4 {

    public static int gcd(int m, int n) {
        if (n == 0) {
            return m;
        }

        int min = (m < n) ? m : n;
        int max = (m > n) ? m : n;

        return gcd(min, max % min);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("두 수를 입력하세요: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = gcd(a, b);

        System.out.println("두 수의 최대공약수는 " + result + "입니다.");

        scanner.close();
    }
}