package JAVA;
public class AdvanceArr {
    public static void main(String[] args)
    {
        int arr[][] = {{6,84,5,4},{4,5,32,4}};
        //forEach
        for(int k[]:arr)
        {
            for(int h : k){  //h will fetch the value from  k here

                System.out.println(h);
            }
        }
    }
}
