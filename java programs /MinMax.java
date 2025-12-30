// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class MinMax {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the size of array:");
     int size=sc.nextInt();
     int array[]=new int[size];
     for(int i=0;i<size;i++){
         System.out.println("enter the valuye of "+i+":");
         array[i]=sc.nextInt();
     }
     int min=Integer.MAX_VALUE;
     int max=Integer.MIN_VALUE;
     for(int i=0;i<size;i++){
         if(array[i]<min){
             min=array[i];
         }
         if(array[i]>max){
             max=array[i];
         }
         }
         
     
        System.out.println("Minimum value is: "+min);   
        System.out.println("Maximum value is: "+max);
        }
    }
