// As given there are two sample methods: First one returns the sum of
// two numbers a and b and second one returns the subtraction of a and b. if
// a-b is negative then return value would be 0. Use ternary operator to call
// these two methods. If a>b then ternary should call sum(a,b) but if a<b
// then ternary operator should call sub(a,b). Eventually print the result of
// the ternary operation on variable a and b.
// Note: Ternary operator can call a method even for true and false values.

import java.util.Scanner;

class Math{
    int a,b,c;
    Math(int a, int b){
        this.a=a;
        this.b=b;
    }
    public int sum(){
       c=a+b;
       return c;
    }

    public int difference(){
    c=a-b;
    if(c<0){
       return 0;
    }
    else{
        return c;
    }
    }
}
public class Q6{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A and B");
        int a,b;
        a=sc.nextInt();
        b=sc.nextInt();
        Math m1;
        m1 = new Math(a,b);
        int result;
        /*if(a>b){
            result = m1.sum();
        }
        else{
            result = m1.difference();
        }*/
        result = (a>b) ?  m1.sum() : m1.difference();
        System.out.println("Result " + result);
    }
}
