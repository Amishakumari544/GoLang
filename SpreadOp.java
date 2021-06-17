package JAVA;

    class addd{

  
     int add(int...n){ //spread operator
            //sum of array elements
            int sum = 0;
            for(int k:n)  // foreach
            {
                sum = sum + k;
            }        
            return sum;
        }
    }
    class SpreadOp{
    public static void main (String[] args) 
    {
        // create  object of a class
        addd obj = new addd(); //default constructor
        System.out.print(obj.add(3,4,5 )) ;       
    }
}