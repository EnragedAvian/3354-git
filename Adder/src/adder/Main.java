package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
            System.err.println("Invalid input: please provide a series of integers to add or prefix with - to subtract a series of integers");
        }
    }

    private static int addArguments(String[] args) {
	int myResult = 0;
	int multiplier = 1;
	int startingIndex = 0;
	int minArgs = 2;

	if (args[0].equals("-")) {
		multiplier = -1;
		startingIndex = 1;
		minArgs = 3;
	}

	if (args.length < minArgs) {
		throw new ArrayIndexOutOfBoundsException();
	}

	for (int i = startingIndex; i < args.length; i++) {
		myResult += Integer.valueOf(args[i]);
	}

	myResult = myResult * multiplier;
        return myResult;
    }
}
