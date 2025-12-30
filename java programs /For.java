// // class For{
// //     public static void main(String[] args) {
// //         // for(int i=19;i<25;i++){
// //         //     System.out.print(i+" ");
// //         // }
// //         // print in one line

// //         // System.out.println("hello");
// //         // System.out.println("world");
// //     }
// // }
// import java.util.*;
// class For{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter a number");
//         int n=sc.nextInt();
//         int sum =0;
//         for(int i=1;i<=n;i++){
//             sum=sum+i;
//         }
//                     System.out.println(sum);

//     }
// }


//table of a number
import java.util.*;

class For{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the table number");
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){

            System.out.println( n + " x " + i + " = "+ (n*i) );
        }

            
        }
    }
