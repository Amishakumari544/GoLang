package JAVA;
public class ConstructorOverloading {
    
    int a,b,c;
    public ConstructorOverloading(int x,int y)  // constructor
    {

       a=x;
       b=y;
    }
    public ConstructorOverloading(int x,int y,int z)  // constructor
    {

       a=x;
       b=y;
       c=z;
    }
    public  static void main(String[] args)
    {
        ConstructorOverloading obj = new ConstructorOverloading(6,8,1);
        
        System.out.println(obj.a+obj.b+obj.c);
    }
}
