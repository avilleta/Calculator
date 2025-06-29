import java.util.Scanner;

public class Calculator{

    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        String errorMessage = "Invalid input entered. Terminating...";

        System.out.println("List of operations: add subtract multiply divide alphabetize");
        System.out.println("Enter an operation:");
        String operation = input.next();

        switch (operation.toLowerCase()){
            case "add":
            System.out.println("Enter two integers:");
            if (input.hasNextInt()){
                int int1 = input.nextInt();
                if (input.hasNextInt()){
                    int int2 = input.nextInt();
                    System.out.println("Answer: " + (int1 +int2));
                } else System.out.println(errorMessage);
            } else {
                System.out.println(errorMessage);
            }
            break;
            case "subtract":
            break;
            case "multiply":
            break;
            case "divide":
            break;
            case "alphabetize":
            break;
            default:
            System.out.println(errorMessage);
            break;
        }
    }
}