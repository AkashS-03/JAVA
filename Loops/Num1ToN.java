//Print numbers from 1 to N
import java.util.Scanner;
public class Num1ToN{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = scanner.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(i);
        }
    }
}