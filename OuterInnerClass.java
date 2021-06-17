package JAVA;
class Outer{
    // void show(){  //method

    //     System.out.print("Outer Display");
    // }
    //we can create class inside a class
    class Inner{
       public void display(){ //method

            System.out.print("inner Display");
        }
    }






public static void main(String[] args) 
{
    Outer obj = new Outer();
    // for creating object we have to use outer class object
    Outer.Inner obj1 = obj.new Inner();
    obj1.display();

}
}