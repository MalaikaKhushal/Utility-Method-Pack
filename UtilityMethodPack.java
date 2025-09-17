import java.util.Scanner;

public class UtilityMethodPack {

   
    public static int add(int a, int b) {
        return a + b;
    }

   
    public static int subtract(int a, int b) {
        return a - b;
    }

    
    public static long multiply(int a, int b) {
        return (long) a * b;
    }

  
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN;
        }
        return (double) a / b;
    }

    
    public static int maxofThree(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

   
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers to add: ");
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        System.out.println("Sum: " + add(a1, b1));

      
        System.out.print("Enter two numbers to subtract: ");
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        System.out.println("Difference: " + subtract(a2, b2));

        
        System.out.print("Enter two numbers to multiply: ");
        int a3 = scanner.nextInt();
        int b3 = scanner.nextInt();
        System.out.println("Product: " + multiply(a3, b3));

        
        System.out.print("Enter two numbers to divide: ");
        int a4 = scanner.nextInt();
        int b4 = scanner.nextInt();
        double result = divide(a4, b4);
        if (!Double.isNaN(result)) {
            System.out.println("Quotient: " + result);
        }

        System.out.print("Enter three numbers to find the maximum: ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println("Maximum: " + maxofThree(x, y, z));

       
        System.out.print("Enter a number to check if it's prime: ");
        int primeCandidate = scanner.nextInt();
        if (isPrime(primeCandidate)) {
            System.out.println(primeCandidate + " is a prime number.");
        } else {
            System.out.println(primeCandidate + " is not a prime number.");
        }
    }
}
