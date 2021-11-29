package Abstraction;

public class HDFC extends Bank {

    @Override
    public  void denomination() {

        int arr[]={100, 200, 500, 1000, 2000};
        for(int i=0;i<arr.length;i++){
            System.out.println("HDFC Bank denominations:" + arr[i]);
        }


    }

}



