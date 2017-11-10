import java.util.Scanner;

class Factorial
{
    public static void main(String args[])
    {
        int n, c, fact = 1;

        System.out.println("Introduceți un număr întreg pentru a calcula factorialul:");
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        
        {
            for ( c = 1 ; c <= n ; c++ )
                fact = fact*c;

            System.out.println("Factorul lui "+n+" este = "+fact);
        }
    }
}