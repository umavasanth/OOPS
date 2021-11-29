package Polymorphism;

public class OverrideMethod extends Add{
    @Override
    public void mtdOverride(String input1, String input2) {
        System.out.println( "The output is :" + input1 + input2);
    }

    public static void main(String[] args) {

        OverrideMethod concat = new OverrideMethod();
        concat.mtdOverride("Java","Programming");

        Add add = new Add();
        add.mtdOverride("20","70");

    }


}
