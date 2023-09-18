package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        if (printToInclusive < 2){
            System.out.print("");
        }

        int number = 2;

        while (number <= printToInclusive){
            if (isPrime(number)){
                System.out.println(number);
            }
            number++;
        }
    }

    private boolean isPrime(int number){
        if (number < 1){
            return false;
        }
        int i = 2;
        while (i <= Math.sqrt(number)){
            if (number % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
