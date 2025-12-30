import java.util.*;
class Transpose{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     
     System.out.println("enter the rows :");
     int rows=sc.nextInt();
     System.out.println("enter the columns :");
     int columns=sc.nextInt();
     int array[][]=new int[rows][columns];
     for(int i=0;i<rows;i++){
         for (int j=0;j<columns;j++){
             array[i][j]=sc.nextInt();
         }
     }
    System.out.println("enter the transpose : ");
    

      System.out.println("The transpose is : ");
      //To print transpose
      for(int j=0; j<columns;j++) {
          for(int i=0; i<rows; i++) {
              System.out.print(array[i][j]+" ");
          }
          System.out.println();
      }
   }
}