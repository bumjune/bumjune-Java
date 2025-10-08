import java.util.Scanner;
public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        num = sc.nextInt();
        int[] arr = new int[num];
        System.out.print("수를 입력하세요: ");
        for(int i = 0; i<num;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[0];
        for(int i = 0; i<num;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("최대값: " + max);

        for(int i = 0; i<num;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("최소값: " + min);
    }
}