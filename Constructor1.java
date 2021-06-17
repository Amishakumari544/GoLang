package JAVA;
public class Constructor1 {
    int x1,x2;  // Create a class attribute
  
    // Create a class constructor for the Main class
    public Constructor1() { //default constructor
      x1 = 5;  // Set the initial value for the class attribute x
    }
    public Constructor1(int n) {
      x1 = n;  // 
    }
    // local variable x1 and x2
    public Constructor1(int x1, int x2) {
      this.x1 = x1; // this.x1 is now consider as instance variable because of thi skkeyword - represent current object
      this.x2 = x2;  
    }
  
    public static void main(String[] args) {
      Constructor1 myObj = new Constructor1(6,62); // Create an object of class Main (This will call the constructor)
      System.out.println(myObj.x1); // Print the value of x
      System.out.println(myObj.x2); // Print the value of x
    }
  }