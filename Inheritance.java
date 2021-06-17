package JAVA;
class Cal{   //Parent , Super , Base in java we call Super and in C++ Base
    public int add (int a, int b ){
        return a+b;
    }
}
class CalD extends Cal{
    public int sub(int x, int y){
    return x-y;
}
}
class CalM extends CalD{
    public int mul(int x, int y){
    return x*y;
}
}

// ************Cal and CALD are single Inheritance ***************

// *************CALD , CAL and  CALM are Multilevel Inheritance ********************************

public class Inheritance{

    public static void main (String[] args)
    {
        CalM ob = new CalM();
        int res1 = ob.add(5,3);
        int res2 = ob.sub(5,3);
        int res3 = ob.mul(5,3);
        System.out.println(res1 + " " + res2+ " " + res3);
    }
}