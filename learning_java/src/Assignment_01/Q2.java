
//WAP to count the total number of calls for a member function from more than one objects.

class Function_Call{
  static int count=0;
  Function_Call(){
    
  };

  void display(){
    count++;
  }
}

class Q2{
  public static void main(String args[]){
    Function_Call obj1 = new Function_Call();
    obj1.display();
    Function_Call obj2 = new Function_Call();
    obj2.display();
    Function_Call obj3 = new Function_Call();
    obj3.display();
    System.out.println("Total number of call are " + Function_Call.count );
  }
}
