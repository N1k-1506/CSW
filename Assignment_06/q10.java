import java.util.Scanner;
public class q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the expression: ");
        String exp = scanner.nextLine();
        scanner.close();
        char operator=' ';
        int operand1=0,operand2=0;
        int i=0;
        while (i<exp.length()) {
            if (exp.charAt(i) >= '0' && exp.charAt(i) <= '9') {
                if (operator == ' ') {
                    operand1 =operand1*10+Character.getNumericValue(exp.charAt(i));
                } else {
                    operand2 =operand2*10+Character.getNumericValue(exp.charAt(i));
                }
            }
            else{
                operator=exp.charAt(i);
            }
            i++;
        }
        int result=0;
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Error: Division by zero");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                return;
        }
        System.out.println("Result: " + result);
       
    }
    
}
