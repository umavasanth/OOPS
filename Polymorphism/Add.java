package Polymorphism;
/*Add 2 integers and concat 2 strings with same method name(Apply method Overriding)*/

public class Add {
    public void mtdOverride(String input1, String input2) {
        int number1 = Integer.parseInt(input1);
        int number2 = Integer.parseInt(input2);
        System.out.println("The output is :" + (number1 + number2));
    }

}
