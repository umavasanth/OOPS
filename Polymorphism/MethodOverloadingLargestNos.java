package Polymorphism;
/*Find the largest of 2 numbers and largest of 3 numbers(Apply method overloading concept)*/

public class MethodOverloadingLargestNos {
    public static void main(String[] args) {
     MethodOverloadingLargestNos poly=new MethodOverloadingLargestNos();
     poly.largestNum(1,3,4);
     poly.largestNum(5,7);
    }

  public void largestNum(int a,int b){
    if(a>b) {
        System.out.println(a + "is largest");
    }else {

        System.out.println(b + "is largest");
    }
  }
  public void largestNum(int a,int b,int c){
      if( a>b && a> c) {
          System.out.println(a + "is largest");
      }
      else if(b>a && b>c) {
          System.out.println(b + "is largest");
      }
      else {
          System.out.println(c + "is largest");
      }
  }
}