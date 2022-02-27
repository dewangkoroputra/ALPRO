import java.util.Random;


public class ComputeMethods5026211167 {
    public double fToC (double F) {
        return 5 / 9.0 * (F - 32);
    }

    public double hypotenuse (double a, double b) {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }

    public int roll () {

        Random random = new Random();

        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;

        return dice1 + dice2;
    }
    
}