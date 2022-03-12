import java.util.Scanner;

public class recursiveFunction {

    //System.out.println("Please enter a value");
    public static void main(String[] args) {

        System.out.println("5!: " + iterativeFactorial(5));
        System.out.println("5!:" + recursiveFactorial(5));

    }public static int iterativeFactorial(int x){
        //x = scanner1.nextInt();
        int factorial = 1;
            for(int i = 1; i<= x; i++){
                factorial = factorial * i;

            }

        return factorial;
    }public static int recursiveFactorial(int y){
        if(y==1){ return 1; }
        else{
            return y * recursiveFactorial(y-1);
            //recursive is close to human's brain. You can't use loops.
            // recursiveFactorial think like f(y)
            //f(5) = 5*f(4) -> 5*4*3*2*1  (we wrote 5 for the y value)
            //f(4) = 4*f(3) -> 4*3*2*1
            //f(3) = 3*f(2) -> 3*2*1
            //f(2) = 2*f(1) -> 2*1
            //f(1) = 1

        }


    }



}



