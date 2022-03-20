
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
			System.out.println("This is a test java program written by Timothy Hutchins\n");
			System.out.println("Usage:\n");
			System.out.println("	add");
			System.out.println("	  This will add the next two numbers you input\n");
			System.out.println("	subtract");
			System.out.println("	  This will subtract the next two numbers you input\n");
			System.out.println("	multiply");
			System.out.println("	  This will multiply the next two numbers you input\n");
			System.out.println("	divide");
			System.out.println("	  This will divide the next two numbers you input\n");
		}
		else if ("add".equals(args[0])) {
			if (args.length < 3) {
				System.out.println("Error: Not enough input arguments.");
			}
			else {
				System.out.printf("%d\n", add(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
			}
		}
		else if ("subtract".equals(args[0])) {
			if (args.length < 3) {
				System.out.println("Error: Not enough input arguments.");
			}
			else {
				System.out.printf("%d\n", subtract(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
			}
		}
		else if ("multiply".equals(args[0])) {
			if (args.length < 3) {
				System.out.println("Error: Not enough input arguments.");
			}
			else {
				System.out.printf("%d\n", multiply(Integer.parseInt(args[1]), Integer.parseInt(args[2])));
			}
		}
		else if ("divide".equals(args[0])) {
			if (args.length < 3) {
				System.out.println("Error: Not enough input arguments.");
			}
			else {
				System.out.printf("%f\n", divide(Float.parseFloat(args[1]), Integer.parseInt(args[2])));
			}
		}
		else {
			System.out.println("Error: Not a valid argument.");
		}
	}
	private static int add(int a, int b) {
		return a + b;
	}
	private static int subtract(int a, int b) {
		return a - b;
	}
	private static int multiply(int a, int b) {
		return a * b;
	}
	private static float divide(float a, float b) {
		return a / b;
	}
}
