package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        int exp = 0;
        int res = 1;

        if (power < 0) {
            System.out.println("too much power");
        }

        while (exp <= power){
            System.out.println(res);
            res *= 2;
            exp++;
        }
    }

    public static void main(String[] args) {
        PowerOfTwo pw = new PowerOfTwo();
        pw.printPower(0);
    }
}
