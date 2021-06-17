package JAVA;
public class StaticKeyword {
    int score;
    int age;
    static String collegeName="Arka Jain"; //StaticKeyword

    public void display() //method
    {
        System.out.println(score+" "+age+" "+collegeName);
    }
    public static void main(String arg[])  //static keyword beacuse we dont need object to call main method
    {
        StaticKeyword amisha  = new StaticKeyword(); //object and class
        amisha.score =99;
        amisha.age =20;
        StaticKeyword aisha = new StaticKeyword(); //2nd
        aisha.score =99;
        aisha.age =20;
        StaticKeyword.collegeName= "Arka";  //StaticKeyword with class no need to use object 
        aisha.display();
        amisha.display();

       
}
}