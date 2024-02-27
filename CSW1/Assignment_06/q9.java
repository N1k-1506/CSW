import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the datatype of the desired datatype(int,float,double,boolean): ");
        String dataType = scanner.nextLine();
        System.out.print("Enter a value as a string for " + dataType + ": ");
        String inputStr = scanner.nextLine();
        Object result = convertToObject(inputStr, dataType);
        if (result != null) {
            System.out.println("Converted " + inputStr + " to " + dataType + ": " + result);
        } else {
            System.out.println("Conversion failed for " + inputStr + " to " + dataType);
        }
        scanner.close();
    }

    private static Object convertToObject(String inputStr, String dataType) {
        switch (dataType) {
            case "int":
                return Integer.valueOf(inputStr);
            case "float":
                return Float.valueOf(inputStr);
            case "double":
                return Double.valueOf(inputStr);
            case "boolean":
                return Boolean.valueOf(inputStr);
            default:
                return null;
        }
    }
}
