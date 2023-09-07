
import java.util.Scanner;

public class P4 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height: ");
        int height = sc.nextInt();
        //base case
        if(height<0){
            System.out.print("- Error Input");
            return;
        }
        String pattern[] = { "BB", "AA" };
        for (int i = 1; i <= height; i++) {
            for (int j = i; j > 0; j--) {
                System.out.format("%s", pattern[j % 2]);
            }
            System.out.print("\n");
        }
    }
}
