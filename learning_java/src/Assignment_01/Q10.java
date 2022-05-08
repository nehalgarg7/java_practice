// WAP in Java Program To Survey Four Different Car Models For Four
// Different Cities:
// Your job is to find out the total number of cars sold of each model in all
// the cities. Use Array of objects or multiple objects of class name City.

import java.util.*;

class City{
  int Maruti_k10;
  int Zen_Astelo;
  int Wagnor;
  int Maruti_SX4;

  City(int Maruti_k10,int Zen_Astelo,int Wagnor,int Maruti_SX4){
  this.Maruti_k10=Maruti_k10;
  this.Zen_Astelo= Zen_Astelo;
  this.Wagnor=Wagnor;
  this.Maruti_SX4=Maruti_SX4;
  } 
}

class Q10{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    City obj [] = new City[4];
    for(int i=0;i<4;i++){
      int a,b,c,d;
      a=sc.nextInt();
      b=sc.nextInt();
      c=sc.nextInt();
      d=sc.nextInt();
      obj[i]=new City(a,b,c,d);
    }
    int a=0;
    for(int i=0;i<4;i++){
      a+=obj[i].Maruti_k10;
    }
    int b=0;
    for(int i=0;i<4;i++){
      b+=obj[i].Zen_Astelo;
    }
    int c=0;
    for(int i=0;i<4;i++){
      c+=obj[i].Wagnor;
    }
    int d=0;
    for(int i=0;i<4;i++){
      d+=obj[i].Maruti_SX4;
    }

    System.out.println("Total number car sold of model : Maruti_k10 in every city is " + a);
    System.out.println("Total number car sold of model : Zen_Astelo in every city is " + b);
    System.out.println("Total number car sold of model : Wagnor in every city is " + c);
    System.out.println("Total number car sold of model : Maruti_SX4 in every city is " + d);
  }
}
