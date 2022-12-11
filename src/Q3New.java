interface Operation {
    int getResult(int n1, int n2);
}
public class Q3New {
    public static void main(String[] args) {
        Operation add = (int n1, int n2) -> n1 + n2;
        Operation sub = (int n1, int n2) -> n1 - n2;
        Operation multiply = (int n1, int n2) -> n1 * n2;
        Operation divide = (int n1, int n2) -> n1 / n2;
        Operation mod = (int n1, int n2) -> n1 % n2;
        int num1 = 10;
        int num2 = 5;
        System.out.println("Addition of "+num1+" and "+num2+": " + add.getResult(num1, num2));
        System.out.println("Subtraction of "+num1+" and "+num2+": " + sub.getResult(num1, num2));
        System.out.println("Multiplication of "+num1+" and "+num2+": " + multiply.getResult(num1, num2));
        System.out.println("Division of "+num1+" and "+num2+":  " + divide.getResult(num1, num2));
        System.out.println("Modulo of "+num1+" and "+num2+": " + mod.getResult(num1, num2));
    }
}