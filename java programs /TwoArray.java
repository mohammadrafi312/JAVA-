//     import java.util.*;
// public class TwoArray {
//     public static void main(String[] args) {
//      Scanner sc=new Scanner(System.in);
     
//      System.out.println("enter the rows :");
//      int rows=sc.nextInt();
//      System.out.println("enter the columns :");
//      int columns=sc.nextInt();
//      int array[][]=new int[rows][columns];
//      for(int i=0;i<rows;i++){
//          for (int j=0;j<columns;j++){
//                System.out.println("enter the element at "+i+" row and "+j+" column:");
//              array[i][j]=sc.nextInt();
//          }
//      }
//     for(int i=0;i<rows;i++){
//          for(int j=0;j<columns;j++){
//              System.out.print(array[i][j]+" ");
//          }
         
//          System.out.println();
//     }
// }
// }
    



// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class TwoArray {
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
     }System.out.println("enter the x to be searched:");
     int x=sc.nextInt();
    for(int i=0;i<rows;i++){
         for(int j=0;j<columns;j++){
             if (array[i][j]==x){
                System.out.println("x found on "+i+","+j ); 
             }
             
            }
        
        }
}
}