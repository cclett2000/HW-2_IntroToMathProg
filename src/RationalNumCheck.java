/*
2/8/2022 - check if rational number using proofs

2) Write a program that takes in users' input (two values) and uses proofs to determine r is a rational number.
A number r is rational if there exist integers x and y such that y ≠ 0 and r = x/y
Determine if the r is a rational number.
Suppose that r = -.05 and y = 100. Show that r is rational by giving

***https://byjus.com/maths/rational-numbers/***
In Maths, a rational number is a type of real numbers, which is in the form of p/q where q is not equal to zero.
Any fraction with non-zero denominators is a rational number. Some examples of rational number are 1/2,
1/5, 3/4, and so on. The number “0” is also a rational number, as we can represent it in many forms such as 0/1,
0/2, 0/3, etc. But, 1/0, 2/0, 3/0, etc. are not rational, since they give us infinite values

y > 0
r is rational if x/y = r
*/

import java.util.Scanner;

public class RationalNumCheck {
    Scanner input = new Scanner(System.in);
    boolean enableDebug = false;

    public void run(){
        System.out.println("***Number Rationality Check***");
        check();
        System.out.println("Done.");
    }

    // collect number to check (r)
    private double numberToCheck(){
        System.out.println("Enter the number you would like to check rationality for.");
        double num2chk = input.nextDouble();

        return num2chk;
    }

    // collects divisor (y)
    private double divisor() {
        System.out.println("Enter the number you would like to use as the divisor.");
        double divisor = input.nextDouble();

        return divisor;
    }

    // main check method
    private void check(){
        double r = numberToCheck();     // number to check
        double x = 0;                   // value to increment
        double y = divisor();           // divisor
        double calc;                    // calculation init

        // check - y > 0
        if (y < 1){
            System.out.println("ERROR: 'y' must be a postive number greater than 0");
            System.exit(-1);
        }

        else{
            while (true){
                calc = x / y;
                x += 1;

                if (enableDebug){
                    System.out.println("-> Calc: " + x + "/" + y + " = " + calc);
                }

                if (calc == r) {
                    System.out.println("\n>>> '" + r + "' is a rational number.");
                    System.out.println("\tCalculations made: " + x);

                    break;
                }

                if (calc > r){
                    System.out.println("\n>>> '" + r + "' is not a rational number.");
                    System.out.println("\tCalculations made: " + x);

                    break;
                }
            }

        }
    }
}
