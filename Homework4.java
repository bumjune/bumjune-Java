import java.util.Scanner;

public class Homework4 {
    int gcd(int m, int n){
        if(n==0){
            return m;
        }else if(m>n){
            return gcd(n, m%n);
        }else{
            return gcd(m, n%m);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Homework4 gcd = new Homework4();
        System.out.print("두 수를 입력해주세요: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = gcd.gcd(a, b);
        System.out.println("두 수의 최대공약수는 " + result + "입니다.");
    }
}