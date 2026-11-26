public class Stats {

    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: java Stats <numbers>");
            return;
        }

        // Variables decided before the loop
        int count = args.length;
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (String arg : args) {
            int value = Integer.parseInt(arg);
            sum += value;
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }

        double average = (double) sum / count;

        System.out.println("Count: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.printf("Average: %.2f%n", average);
    }
}