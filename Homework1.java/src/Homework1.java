import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.printf("정수를 입력하세요:");
        int sum=0;
        for(int n=1; n<=4;n++){
            int num=sc.nextInt();
            sum+=num;
            System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n",sum);
            System.out.printf("정수를 입력하세요:");
        }
        int num=sc.nextInt();
        sum+=num;
        System.out.printf("현재까지 입력된 정수의 합은 %d입니다.\n",sum);
    }
}
