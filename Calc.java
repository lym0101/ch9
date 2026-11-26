public class Calc {

    public static void main(String[] args) {
        if (args.length < 2) {
            System.err.println("Usage: java Calc <add|mult|max|min> <numbers>");
            return;
        }

        String op = args[0];
        int result;

        // Pick a starting value that won't change the answer
        if (op.equals("add")) {
            result = 0;
        } else if (op.equals("mult")) {
            result = 1;
        } else if (op.equals("max")) {
            result = Integer.MIN_VALUE;
        } else if (op.equals("min")) {
            result = Integer.MAX_VALUE;
        } else {
            System.err.println("Unknown operation: " + op);
            return;
        }

        // Numbers start at index 1 (index 0 is the command)
        for (int i = 1; i < args.length; i++) {
            int value = Integer.parseInt(args[i]);
            if (op.equals("add")) {
                result += value;
            } else if (op.equals("mult")) {
                result *= value;
            } else if (op.equals("max")) {
                if (value > result) {
                    result = value;
                }
            } else {
                if (value < result) {
                    result = value;
                }
            }
        }

        System.out.println(result);
    }
}