//Q3. Perform addition, subtraction, multiplication as well as division using Lambda Expression
interface Calculation<T extends Number> {
    T getResult();
}

public class Q3 {
    public static void printOperation(String op, Calculation c){
        System.out.println("The Operation of "+op+" gives us " + c.getResult());
    }
    public static void main(String[] args) {
        Integer op1 = 13;
        Integer op2 = 12;
        printOperation("Add", ()-> op1+op2);
        printOperation("Subtract",()->op1-op2);
        printOperation("Multiply",()->op1*op2);
        printOperation("Divide",()->op1/op2);

    }
}
