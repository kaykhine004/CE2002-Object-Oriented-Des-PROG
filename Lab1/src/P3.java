import java.util.Scanner;

public class P3{
    public static final double USD2SGD = 1.82; //to call at private methods
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter starting value: $");
        int start = sc.nextInt();
        System.out.print("Enter ending value: $");
        int end = sc.nextInt();
        System.out.print("Enter increment value: $");
        int increment = sc.nextInt();

        //base case
        if(start>end || increment <=0 ){
            System.out.println("Error input!!");
        }
        else {

            //for loop, while loop, do while loop
            System.out.println("1. Using a for loop:");
            usingForLoop(start, end, increment);
            System.out.println("2. Using a while loop:");
            usingWhileLoop(start, end, increment);
            System.out.println("3. Using a doWhile loop:");
            usingDoWhileLoop(start, end, increment);
        }
    }
    private static void usingForLoop(int start,int end,int increment){
        System.out.println("US$       S$\n ---------------");
        for (int i= start; i<= end; i+=increment){
            double USD = i* USD2SGD;
            double roundedUSD = Math.round(USD * 100.0) / 100.0;
            System.out.println(i +"       "+ roundedUSD);
        }
    }
    private static void usingWhileLoop(int start, int end, int increment){
        System.out.println("US$       S$\n ---------------");
        int i= start;
        while( i<=  end){
            double USD = i* USD2SGD;
            double roundedUSD = Math.round(USD * 100.0) / 100.0;
            System.out.println(i +"       "+ roundedUSD);
            i+=increment;
        }
    }
    private static void usingDoWhileLoop(int start, int end, int increment){
        System.out.println("US$       S$\n ---------------");
        int i = start;
        do{
            double USD = i* USD2SGD;
            double roundedUSD = Math.round(USD * 100.0) / 100.0;
            System.out.println(i +"       "+ roundedUSD);
            i+=increment;
        }while(i<= end);
    }
}
