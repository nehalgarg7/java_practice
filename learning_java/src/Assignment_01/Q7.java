// WAP to count the total number of calls for a member function:
// display(), from more than one objects and how many times the object is
// created of a class name Employee.
// Note: Call display() function from more than 3 objects

class Call{
  static int count1=0,count2=0;
  Call(){
    count1++;
  };

  void display(){
    count2++;
  }
}

class Q7{
  public static void main(String args[]){
    Call obj1 = new Call();
    obj1.display();
    Call obj2 = new Call();
    obj2.display();
    Call obj3 = new Call();
    obj3.display();
    Call obj4 = new Call();
    obj4.display();
    Call obj5 = new Call();
    System.out.println("Total number of constructor called are " + Call.count1 );
    System.out.println("Total number of method called are " + Call.count2 );
  }
}
