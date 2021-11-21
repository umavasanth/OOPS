package Abstraction;
/*Implement the denominations available in 3 banks by using the abstraction class and methods.*/
public abstract class Bank {
    abstract int getDenominations();
}

class ICICI extends Bank
{
    @Override
    int getDenominations() {
        return 10;
    }
}
class HDFC extends Bank {

    @Override
    int getDenominations() {
        return 50;
    }
}
class TNMB extends Bank {
    @Override
    int getDenominations() {
        return 100;
    }

}


