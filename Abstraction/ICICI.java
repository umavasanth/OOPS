package Abstraction;

public class ICICI extends Bank{

    @Override
    public void denomination() {
        int arr[]={200, 500, 1000, 2500,5000};
        for(int i=0;i<arr.length;i++){
            System.out.println("ICICI Bank denomination:"+ arr[i]);
        }
    }
}

