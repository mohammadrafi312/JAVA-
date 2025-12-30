// import java.util.*;

// class Half {
//     public static void main (String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int n= scanner.nextInt(); 

//      for(int i=n;i>=1;i--){

//     for(int j=1;j<=i;j++){
//         System.out.print("*");

// }  System.out.println();
//     }
// } 
// }
// inverted half pyramid pattern
import java.util.*;
class Half {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n= scanner.nextInt(); 
// int number= 1;

     for(int i=1;i<=n;i++){

    for(int j=1;j<=i;j++){
 if((i+j) % 2 == 0){
    System.out.print(1+" ");
}else{
    System.out.print(0+" ");
}     
//     System.out.print(number+" ");
//     number++;
// } 
// for(int j=1;j<=n-i;j++){
//     System.out.print("*");
// }
 } System.out.println();
}  
    }}


