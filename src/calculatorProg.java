import java.util.Scanner;
public class calculatorProg {
    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static int sub(int a, int b) {
        int sub = a - b;
        return sub;
    }

    public static int mul(int a, int b) {
        int mul = a * b;
        return mul;
    }

    public static int div(int a, int b) {
        int div = a / b;
        return div;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int output=0;
        String opr = "";

        while (opr != "clear")
        {
            System.out.print("Enter the operation want to perform  (add = a / sub = s / multiply = m / divide = d (e to exit) :");
            opr = s.next();

            System.out.print("Input Number:");
            int inputNum = s.nextInt();

            switch (opr) {
                case "a":
                    output = sum(output, inputNum);
                    break;
                case "s":
                    output = sub(output, inputNum);
                    break;
                case "m":
                    output = mul(output, inputNum);
                    break;
                case "d":
                    output = div(output, inputNum);
                    break;
                case "e":
                    System.exit(0);
                default:
                    System.out.println("In-appropriate operation, Please try again");
                    System.exit(1);
            }

            System.out.println("Output is :" + output);
        }
/*
        System.out.println("Addition of two numbers= " + sum(10, 2));
        System.out.println("substractions of two numbers= " + sub(30, 20));
        System.out.println("Multiplication of two numbers= " + mul(4, 3));
        System.out.println("Division of two numbers= " + div(40, 8));

 */
    }
}

