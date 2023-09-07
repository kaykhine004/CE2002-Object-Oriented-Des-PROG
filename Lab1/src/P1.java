import java.util.Scanner;
public class P1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        switch (sc.next().charAt(0)) {   // its string and scanner each char of the string and get the 1st item
            //scanner.next() will one read 1 char at a time
            case 'a':case 'A':
                System.out.println("Action movie fan\n");
                break;
            case 'c':case 'C':
                System.out.println("Comedy Movie fan\n");
                break;
            case 'd':case 'D':
                System.out.println("Drama movie fan\n");
                break;
            case 'b': case 'B':
                System.out.println("Invalid choice\n");
                break;
        }
        System.exit(0);
    }
}

