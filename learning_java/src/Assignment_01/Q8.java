// WAP in java, to delete index=3, element from the given array
// mentioned below.
// Int[] arr = {1,2,3,4,5,6,7,8,9}
// Note: Non relevance places would be filled with zeros.
import java.util.*;

class Q8{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[9];
    System.out.println("Enter elements of array");
    for(int i=0;i<9;i++){
      int num;
      num=sc.nextInt();
      arr[i]=num;
    }
    for(int i=3;i<8;i++){
      arr[i]=arr[i+1];
    }
    arr[8]=0;
    System.out.println("Elements after deletion");
    for(int i=0;i<9;i++){
      System.out.println(arr[i]);
    }
  }
}
