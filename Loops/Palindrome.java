// Check if a number is palindrome – 121 → palindrome; 123 → not 
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        int temp = n;
        int rev=0;
        while(temp!=0){
            rev=rev*10+(temp%10);
            temp/=10;
        }
        if(n==rev){
            System.out.println(n+" is a palindrome ");
        }
        else{
            System.out.println(n+" not a palindrome");
        }
    }
}
