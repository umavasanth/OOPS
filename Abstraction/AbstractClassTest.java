package Abstraction;

public class AbstractClassTest{

    public static void main(String[] args) {
        ICICI icici=new ICICI();

        System.out.println("ICICI Denomination:"+icici.getDenominations());

        HDFC hdfc=new HDFC();
        System.out.println("HDFC Denomination"+hdfc.getDenominations());

        TNMB tnmb=new TNMB();
        System.out.println("TNMB Denomination:"+ tnmb.getDenominations());

    }


}
