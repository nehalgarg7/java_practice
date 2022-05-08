// WAP which would contain 6 objects, of a class
// Student. Student [Name, Age, section, percentage]. They all belong to
// Section-A. Your program would be able to find the average percentage of
// students in this section. Use constructors to create these 6 objects and
// input from Scanner class.

import java.util.*;

class Student{
  String name;
  int age;
  char sec;
  Float percentage;

  Student( String name, int age, char sec, Float percentage){
    this.name=name;
    this.age=age;
    this.sec=sec;
    this.percentage=percentage;
  }
}

class Q1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    Student obj[] = new Student[6];
    for(int i=0;i<6;i++){
      String name;
      System.out.println("Enter the name of Student " + (i+1));
      name=sc.nextLine();
      int age;
      System.out.println("Enter the age of Student " + (i+1));
      age=sc.nextInt();
      char sec;
      System.out.println("Enter the sec of Student " + (i+1));
      sec=sc.next().charAt(0);
      Float percentage;
      System.out.println("Enter the percentage of Student " + (i+1));
      percentage=sc.nextFloat();
      obj[i]=new Student(name,age,sec,percentage);
    }
     int average=0;
     for(int i=0;i<6;i++){
       average+=obj[i].percentage;
     }
     average=average/6;
     System.out.println("Average marks of this section is "+average);
  }
}
