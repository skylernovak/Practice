import java.util.Random;

public class ArrayIntGenerator {

    private static final int quickGenerateNumber = 25;

    public static void main(String[] args) {
        // quick generate or custom
        quickGenerate();
        // user input array size
        // user input range of values
        // output array to console
    }

    /**
     * Outputs an int array in the format {a, b, c, ...} to be used to quickly
     * generate a list of random numbers for practice
     */
    public static void quickGenerate() {
        int[] newArr = new int[quickGenerateNumber];
        Random rand = new Random();

        System.out.print("\n\rRandom int array: {");
        for (int i = 0; i < quickGenerateNumber; i++) {
            newArr[i] = rand.nextInt(100) + 1;
            if (i != quickGenerateNumber - 1)
                System.out.print(newArr[i] + ", ");
            else
                System.out.print(newArr[i] + "}\n\r");
        }
    }
}