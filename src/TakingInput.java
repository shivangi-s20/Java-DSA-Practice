import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args){
//        int a = 5;
//        int b = 8;
//        System.out.println(a+b);

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the firstNum:");
        int firstNum = sc.nextInt();
        System.out.println("Enter the secondNum:");
        int secondNum = sc.nextInt();
        int ans = firstNum + secondNum;
        System.out.println("Answer is:"+ans);

        sc.close();
    }
}
