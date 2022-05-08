// Create a multi-level inheritance hierarchy from ClassOne, ClassTwo,
// ClassThree classes.
// ClassOne contains one, single parameterized constructor
// ClassTwo contains only a default constructor
// ClassThree contains one, single parameterized constructor and a default
// constructor.
// Create an object of top child class and make sure the constructor
// execution will take place according to respective multi-level inheritance
// hierarchy.
// ClassThree obj = new ClassThree(1);
// ClassThree obj = new ClassThree();

class One{
  int p;
  One(int p){
    this.p=p;
    System.out.println("Class one constructor called");
  }
}

class Two extends One{
  Two(){
    super(1);
    System.out.println("Class Two constructor called");
  }
}

class Three extends Two{
  int a;
  Three(int a){
    this.a=a;
    System.out.println("Class Three constructor called");
    }
    Three(){
    System.out.println("Class Three constructor called");
    }
}

class Q4{
  public static void main(String args[])
  {
    System.out.println("ClassThree obj = new ClassThree() sequential call");
    Three obj= new Three();
    System.out.println("ClassThree obj = new ClassThree(1) sequential call");
    Three obj1= new Three(1);
  }
}
