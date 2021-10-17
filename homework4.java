import java.util.Scanner;

public class homework {
    public static void main(String[] args){
        System.out.printf("두 수를 입력하세요: ");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        Number GCD=new Number();
        System.out.printf("두 수의 최대 공약수는 %d입니다.",GCD.gcd(num1,num2));

    }
}

class Number{
    int gcd(int m,int n) {
        if(m==0){
            return m;
        }
        else if(m%n==0){
            return n;
        }
        else{
            int a;
            a=m%n;
            m=a;
            m=n;
            n=a;
            return gcd(m,n);
        }
    }
}