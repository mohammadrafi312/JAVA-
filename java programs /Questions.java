// // Questions

// // Enter 3 numbers from the user & make a function to print their average.
// // Write a function to print the sum of all odd numbers from 1 to n.
// // Write a function which takes in 2 numbers and returns the greater of those two.
// // Write a function that takes in the radius as input and returns the circumference of a circle.
// // Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.
// // Write an infinite loop using do while condition.
// // Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 
// // Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.
// // Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)
// // Write a program to print Fibonacci series of n terms where n is input by user :
// // 0 1 1 2 3 5 8 13 21 ..... 
// // In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it.
// // (BONUS)





// // Enter 3 numbers from the user & make a function to print their average.
// import java.util.*;
// class Questions{
//     public static int Average(int a,int b, int c) {
//         int average = (a + b + c ) / 3 ;
//         return average;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("a:");
//         int a=sc.nextInt();
//          System.out.println("b:");
//          int b=sc.nextInt();
//           System.out.println("c:");
//           int c=sc.nextInt();
//           int sum=Average( a , b , c );
//           System.out.println("sum :- "+sum);
//     }
// }

// //Write a function to print the sum of all odd numbers from 1 to n.


// // Enter 3 numbers from the user & make a function to print their average.
// import java.util.*;
// class Main{
//     public static int oddNumber(int n){
//     int sum=0;
//    for(int i=1;i<=n;i+=2){
//     sum =sum + i;
//     }
//      System.out.println("sum of odd integer="+sum);
//      return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("n:");
//         int n=sc.nextInt();
//         oddNumber(n);
//     }
    
// }
// //Write a function which takes in 2 numbers and returns the greater of those two.

// // Enter 3 numbers from the user & make a function to print their average.
// import java.util.*;
// class Main{
//     public static void addGreater(int a,int b)
//     {
      
//         if( a >  b){
//             System.out.println("a is greater than b");
//         }
//         else{
//             System.out.println("b is greater than a");
//         }
 
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter a:");
//         int a=sc.nextInt();
//         System.out.println("enter b:");
//         int b=sc.nextInt();

//         addGreater(a,b);
//     }
    
// }
// //Write a function that takes in the radius as input and returns the circumference of a circle.

// import java.util.*;
// class Main{
//     public static double circumference(double r)
//     {
//         double result= 2*Math.PI*r;
//         return result;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter radius r:");
//         double r=sc.nextDouble();
//          double sum=circumference(r);
// System.out.println("circumference of r:"+sum);
//     }
    
// }

// //Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.


// // Enter 3 numbers from the user & make a function to print their average.
// import java.util.*;
// class Main{
//     public static void Eligiblity(int n){
//         if (n > 18){
//             System.out.println("allowed to vote");
//         }else{
//             System.out.println("not allowed");
            
//         }return ;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.println("enter age:");
//         int n=sc.nextInt();
//         Eligiblity(n);
//     }
    
// }
// //Write an infinite loop using do while condition.


// class Main {
//     public static void main(String[] args) {

//         int i = 1;

//         do {
//             System.out.println("Infinite loop running... " + i);
//             i++;
//         } while (i>0);   // condition always true
//     }
// }

// //Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

// import java.util.*;
// class Main{
//     public static void main(String []args){
//         Scanner sc = new Scanner(System.in);
//         int positive =0;
//         int negative =0;
//         int zero =0;
//         char choice;
//         do{
//             System.out.println("enter a number :");
//             int num=sc.nextInt();
            
//             if( num >0){
//                 positive++;
//             }
//             else if( num < 0){
//                 negative++;
//             }else{
//                 zero++;
//             }
//             System.out.println("do you want to continue?(y or n" );
//              choice=sc.next().charAt(0);
//         } while(choice=='y'||choice=='Y');
//            System.out.println("number of positive:"+positive);
//            System.out.println("number of negartives:"+negative);
//            System.out.println("number of zeros:"+zero);
//     }
// }
// //Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. xn.

// import java.util.*;
// class Main{
//   public static int findPower(int x,int n) {
//       int power=1;
//       for(int i=1;i<=n;i++){
//           power=power*x;
//       }
//       return power;
//       }
//       public static void main(String[]args){
//           Scanner sc= new Scanner (System.in);
//           System.out.println("entet x");
//           int x=sc.nextInt();
//           System.out.println("enter n:");
//           int n=sc.nextInt();
//           int result=findPower(x,n);
//           System.out.println(result);
          
//       }
//   }
//   //Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)A