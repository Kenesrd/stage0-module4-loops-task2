package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        int result = 0;
        if (multiplyByAndToInclusive == 0){
            System.out.print("");
        } else {
            if (multiplyByAndToInclusive > 0){
                while (counter <= multiplyByAndToInclusive){
                    result = counter * multiplyByAndToInclusive;
                    System.out.println(result);
                    counter++;
                }
            } else {
                while (counter >= multiplyByAndToInclusive){
                    result = counter * multiplyByAndToInclusive;
                    if (result == 0){
                        System.out.println(result);
                    } else{
                        System.out.println("-"+result);
                    }

                    counter--;
                }
            }
        }


    }
}
