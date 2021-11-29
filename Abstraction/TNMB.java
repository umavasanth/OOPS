package Abstraction;

public class TNMB extends Bank{

    @Override
    public void denomination() {
        int arr[]={5, 10, 500, 1000, 2000};
        for(int i=0;i<arr.length;i++){
            System.out.println("TNMB Denominations:"+arr[i]);
        }
    }
}
