import java.util.Scanner;
public class Lab2p1 {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: multiplication test");
            System.out.println("2: quotient using division by subtraction");
            System.out.println("3: modulus/remainder using division by subtraction");
            System.out.println("4: count the number of digits");
            System.out.println("5: position of a digit");
            System.out.println("6: extract all odd digits");
            System.out.println("7: quit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    mulTest();
                    break;
                case 2:
                    System.out.println("Enter m: ");
                    int m = sc.nextInt();
                    System.out.println("Enter n: ");
                    int n = sc.nextInt();
                    int quotient = divide(m, n);
                    System.out.println(m + " / " + n + " = " + quotient);
                    break;
                case 3: /* add modulus() call */
                    System.out.println("Enter m: ");
                    m = sc.nextInt();
                    System.out.println("Enter n: ");
                    n = sc.nextInt();
                    int mod = modulus(m, n);
                    System.out.println(m + " % " + n + " = " + mod);
                    break;
                case 4: /* add countDigits() call */
                    System.out.println("Enter n: ");
                    n = sc.nextInt();
                    int count = countDigits(n);
                    if (count <= 0) {
                        System.out.println("n : " + n + " -Error input\n");
                    } else {
                        System.out.println("n : " + n + " - count = " + count + "\n");
                    }
                    break;
                case 5: /* add position() call */
                    System.out.println("Enter n: ");
                    n = sc.nextInt();
                    System.out.println("Enter the digit to find: ");
                    int digit = sc.nextInt();
                    int pos = position(n, digit);
                    System.out.println("position = " + pos + "\n");
                    break;
                case 6: /* add extractOddDigits() call */
                    System.out.println("Enter n: ");
                    n = sc.nextInt();
                    long odd = extractOddDigits(n);
                    System.out.println("OddDigits = " + odd + "\n");
                    break;
                case 7:
                    System.out.println("Program terminating....");
            }
        } while (choice < 7);
    }

    ////////// 3.2  checking multiplication with random numbers

    public static void mulTest() {
        Scanner sc = new Scanner(System.in);
        int marks = 0;
        for (int i = 0; i < 5; i++) {
            int num1 = (int) (Math.random() * 9) + 1;// generating random num from 1-9
            int num2 = (int) (Math.random() * 9) + 1;// generating random num 1-9
            int ans = num1 * num2;
            System.out.print("How much is " + num1 + " times " + num2 + "  :  ");
            int userans = sc.nextInt();
            if (ans == userans) {
                marks++;
            }
        }
        System.out.println(marks + " answers out of 5 are correct \n");
    }

    ////// 3.3  Divide method
    public static int divide(int m, int n) {

        int quotient = 0;
        while (m >= n) {
            m -= n;  //everytime n subtract from m, increase quotient
            quotient++;// keep looping until m is not greater or equal to n
        }
        return quotient;
    }


    /////////// my theory is that remainder is 0 = dividend + (quotient x divisor)
    public static int modulus(int m, int n) {
        int mod = 1;
        if (m == n) {
            return mod;
            // but when divident and divisor are same , my equation give '0'
            // and it supposed to be 1, so i initialise mod as 1.
        } else if (m > n) { // when m>n , equation works
            int quotient = divide(m, n);
            mod = m - (n * quotient);
            return mod;
        } else return 0;
    }

    // counting number of digits for positive numbers
    // each time dividing by 10 will reduce LSB number and
    // everytime 10 divides, counted as 1
    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            n /= 10;
            count++;
        }
        return count;
    }

    public static int position(int n, int digit) {
        int count = countDigits(n);
        while (n >= 0) {
            if (digit == n % 10) // finding remainder will start finding from LSB
            {
                return count;
            }
            count--; // if not found , reduce 1 from total num
            n /= 10;
        }
        return -1; // as per qn
    }

    public static long extractOddDigits(long n) {
        if(n<=0){
            System.out.println("-Error input");
            return -1;
        }
        long decimal= 1;
        long oddnum =0;
        while(n>0){
            long digit = n%10;
            if(digit %2 ==1){
                oddnum += (digit*decimal);
                decimal *=10;
            }
            n/=10;
        }

        return oddnum;
    }
}




