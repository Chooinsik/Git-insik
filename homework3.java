import java.util.Scanner;

class Main {
    public static void main(String[] args){
        int[] arr;
        int Max;
        int Min;
        System.out.printf("몇 개의 수를 입력할 예정인가요?");
        Scanner sc= new Scanner(System.in);
        int index=sc.nextInt();

        arr=new int[index];
        System.out.printf("수를 입력하세요: ");
        for(int i=0;i<index;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=1;i<index;i++){
            if(arr[0]<=arr[i]){
                arr[0]=arr[i];
            }
            Max=arr[0];
        }
        System.out.println("최대값: "+arr[0]);

        for(int i=1;i<index;i++){
            if(arr[0]>=arr[i]){
                arr[0]=arr[i];
            }
            Min=arr[0];
        }
        System.out.println("최소값: "+arr[0]);




    }
}

