import java.util.Scanner;
public class P2 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        while (true)
        {
            System.out.print("Enter salary:");
            int salary = scanner.nextInt();

            System.out.print("Enter Merit:");
            int merit = scanner.nextInt();

            String grade = calculateGrade(salary, merit);
            System.out.println("Grade:"+grade);

            //to continue calculation

            System.out.println("wanna continue? Y/N? ");
            String response = scanner.next().toLowerCase();
            if(response.equals("n")||response.equals("No"))
            {
            break;
            }
            //
        }
    }

    private static String calculateGrade(int salary, int merit){
        if(salary >= 500 && salary <600){
            return "C";
        }
        else if(salary >= 600 && salary <699){ //qn 799 is typo i think
            return (merit<10 )? "C": "B";
        }
        else if(salary >= 700 && salary <899){
            return (merit<20 )? "B": "A";
        }
        else {
            return "A";
        }
    }
}
