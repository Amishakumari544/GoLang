package JAVA;

public class DArray {
    public static void main(String[] args) {
        // 2D Array
        int d[][] = {{3,5,4,2,2}, {2,3,4,5,4},{9,1,42,25,4}};
        // If different size of array then it is called JAGGED ARRAY
        // int d[][] = new int[][];
        for(int i=0;i<d.length;i++)
        // for(int i=0;i<4;i++) //rows
        {
            // for(int j=0;j<d5;j++) //columns
            for(int j=0;j<d[i].length;j++) //gives the length of the array
            {
                System.out.print(" " + d[i][j]);
            }
            System.out.println(" ");
        }
    }
}
