package adder;

public class Main {

    public static void main(String[] args) {
        try {
            int result = addArguments(args);
            System.out.println(result);
	} catch (ArrayIndexOutOfBoundsException e) {
	    System.err.println("Invalid number of arguments. Please provide at least two integers");
	} catch (Exception e) {
	    System.out.println(e);
            System.err.println("Invalid character: Please only provide integers");
        }
    }

    private static int addArguments(String[] args) {
	int myResult = 0;

	if (args.length < 2) {
		throw new ArrayIndexOutOfBoundsException();
	}

	for (int i = 0; i < args.length; i++) {
		myResult += Integer.valueOf(args[i]);
	}
        return myResult;
    }
}
