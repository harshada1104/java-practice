package Practice;

public class addTwoNumbers {

    // Method to add two numbers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        addTwoNumbers calculator = new addTwoNumbers();
        
        int number1 = 10;
        int number2 = 20;
        
        int result = calculator.add(number1, number2);
        System.out.println("Sum of " + number1 + " and " + number2 + " is: " + result);
    }
}
