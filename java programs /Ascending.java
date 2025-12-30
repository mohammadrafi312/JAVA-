// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Ascending {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
     int size=sc.nextInt();
     int array[]=new int[size];
     for(int i=0;i<size;i++){
         System.out.println("enter the valuye of "+i+":");
         array[i]=sc.nextInt();
     }
     boolean isAscending = true ;
     for(int i=0;i<array.length-1;i++){
         if(array[i]>array[i+1]){
              isAscending = false;
         }
     }if (isAscending){
         System.out.println("in ascendiing order");
     }else{
         System.out.println("not in ascending order");
     }
     }
}