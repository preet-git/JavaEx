import java.util.Scanner;

public class ReverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number which have more than 1 digit.");
        int n = sc.nextInt();
        System.out.println("The reverse of the number is:"+ReverseOfNumber.reverse(n));
        System.out.println("The reverse of the number using for loop is:"+ReverseOfNumber.revrseUsingFor(n));
        System.out.println("The reverse of the number using Do-While loop is:"+ReverseOfNumber.revrseUsingDo(n));
    }
    public static int reverse(int num){

        int rev = 0;
        while(num!=0){
            int digit = num%10;
            rev = (rev *10)+digit;
            num = num/10;
        }

        return rev;
    }
    public static int revrseUsingFor(int num){
        int rev = 0;
        for(int i = num; i>0;i=i/10){
            int digit = i%10;
            rev = (rev*10)+digit;
        }
        return rev;
    }

    public static int revrseUsingDo(int num) {

        int rev = 0;
        do {
            if(num!=0) {
                int digit = num % 10;
                rev = (rev * 10) + digit;
                num = num / 10;
            }
            else
                break;
        }while(num>0);
        return rev;
    }
}