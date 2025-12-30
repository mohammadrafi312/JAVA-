import java.util.*;
class Spiral {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     
     System.out.print("enter the n :");
     int n=sc.nextInt();
     System.out.print("enter the m :");
     int m=sc.nextInt();
     int array[][]=new int[n][m];
     for(int i=0;i<n;i++){
         for (int j=0;j<m;j++){
             array[i][j]=sc.nextInt();
         }
     }
     int startCol=0;
     int startRow=0;
     int endingRow=n-1;
     int endingCol=m-1;
while(startCol<=endingCol && startRow<=endingRow){
    for(int col=startCol;col<=endingCol;col++)
    {
        System.out.print(array[startRow][col]+" ");
    }
    startRow++;
    for(int row=startRow;row<=endingRow;row++){
        System.out.print(array[row][endingCol]+" ");
    }
    endingCol--;
    for(int col=endingCol;col>=startCol;col--){
        System.out.print(array[endingRow][col]+" ");
    }
    endingRow--;
    for( int row=endingRow;row>=startRow;row--){
        System.out.print(array[row][startCol]+" ");
    }
    startCol++;
   
}
System.out.print("the spiral order :");
    }
}