package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
        } catch (Exception e) {
	    System.out.println(e);
            System.err.println("Invalid input: please provide a series of integers to add");
        }
    }

    private static int addArguments(String[] args) {
	int myResult = 0;

	if (args.length < 2) {
		throw new IllegalArgumentException();
	}

	for (int i = 0; i < args.length; i++) {
		myResult += Integer.valueOf(args[i]);
	}
        return myResult;
    }
}
