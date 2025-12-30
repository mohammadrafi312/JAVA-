
// import java.util.*;

// class Patterns {
// public static void main(String args[]){
//     Scanner sc=new Scanner(System.in);
//     System.out.println("Enter number of rows");
//     int n=sc.nextInt();
//     System.out.println("Enter number of columns");
//     int m=sc.nextInt();
//     for(int i=0;i<n;i++){
//         for(int j=0;j<m;j++){
//             System.out.print("* ");
//         }
//         System.out.println();

//     }
//     }
    
// }
//hollow rectangfle
import java.util.*;
class Patterns {
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of rows");
    int n=sc.nextInt();
    System.out.println("Enter number of columns");
    int m=sc.nextInt();
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            if(i==1 || i==n || j==1 || j==m){
                System.out.print(" * ");
            }
            else{
                System.out.print("   ");
            }
        }
        System.out.println();
    }
}}