///creating clsass for object 
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}
   public class Oops{
    public static void main(String[] args){
        //creating object for the class pen
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "Gel";

        pen1.write();
        pen1.printColor();
   }
}
// access modifiers are four types publis privste protected default
// public : accessible from anywhere
// private : accessible within the class only
// protected : accessible within the package and subclass
// default : accessible within the package only
// this keyword : refers to the current object



//getter and setter methods
   public class Oops{
    public static void main(String[] args){
        //creating object for the class pen
        Pen pen1 = new Pen();
        pen1.setColor("Blue");
        pen1.type = "Gel";
System.out.println(pen1.getColor());
        pen1.write();
        pen1.printColor();
   }
}
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
    void setColor(String color){
        this.color=color;
    }
    String getColor(){
        return this.color;
    }
}
// constructors :   
// special method used to initialize objects
// same name as the class
// no return type
  public class Oops{
    public static void main(String[] args){
        //creating object for the class pen
        Student s1 = new Student("blue",23);
        System.out.println(s1.getName());
        System.out.println(s1.getRollNo());

    }
  }
class Student{
     private String name;
    private int rollNo;
    Student(String name,int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
   public String getName(){
        return this.name;
    }
    public int getRollNo(){
        return this.rollNo;
    }
}



        