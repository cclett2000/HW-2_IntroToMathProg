/*
2/8/2022 - check if even or odd using proofs

1) Write a program that takes in users' input (two integers) and uses proofs to determine if the values are even or odd.
An integer x is even if there is an integer k such that x = 2k.
An integer x is odd if there is an integer k such that x = 2k+1.
For each value deter whether is even or odd
Determine if the values have the same parity or opposite parity.
 */

public class EvenOddCheck {
    public void evenFormula(int val){
        int curr_val = 0;                 // will be incremented; multiplier

        // tests values starting from 0; has a check that prevents infinite loop and allows room for higher numbers
        while (curr_val < val * 5){
            int even_calc = 2 * curr_val; // even proof calculation

            // even check
            if (even_calc == val){
                System.out.println("[EvenForm]\t" + val + " is an even number.");
                break;
            }

            // odd check
            else if (even_calc > val){
                System.out.println("[EvenForm]\t" + val + " is an odd number.");
                break;
            }

            curr_val++;
        }
    }

    public void oddFormula(int val){
        int curr_val = 0;

        while (curr_val <= val * 5){
            int odd_calc = 2 * curr_val + 1;

            if (odd_calc == val){
                System.out.println("[OddForm]\t" + val + " is an odd number.");
                break;
            }

            if (odd_calc > val){
                System.out.println("[OddForm]\t" + val + " is an even number.");
                break;
            }

            curr_val++;
        }
    }

    public void demo(int demo_size){
        for (int i = 0; i < demo_size; i++) {
            System.out.println("*** Even/Odd Check ***");
            evenFormula(i);
            oddFormula(i);
            System.out.println();
        }
    }
}
