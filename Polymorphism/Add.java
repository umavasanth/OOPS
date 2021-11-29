package Polymorphism;
/*Add 2 integers and concat 2 strings with same method name(Apply method Overriding)*/

public class AddIntAndString {

    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(String s1,String s2) {
        System.out.println(s1 + s2);
    }
    public static void main(String[] args) {
        AddIntAndString mo=new AddIntAndString();
        mo.add(10,30);
        mo.add("Hello","World");
    }
}
