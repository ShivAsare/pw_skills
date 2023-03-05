//Answer:-1///////////////////
import java.util.Scanner;
// public class j11_numbersystem{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int binarynum=0;
//         int pw=1;
//         while (n!=0) {
//             int rem=n%2;
//             binarynum+=rem*pw;
//             pw *=10;
//             n/=2;
//         }
//         System.out.println(binarynum);
//     }
//}
//Answer:-2//////////////////
// public class j11_numbersystem{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int binarynum=0;
//         int pw=1;
//         while(n>0){
//             int unit_digit=n%10;
//             binarynum+=pw*unit_digit;
//             n/=10;
//             pw*=2;
//         }
//         System.out.println(binarynum);
//     }
// }
//Answer:-3///////////////////
// public class j11_numbersystem{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the Binary No: ");
//         int n=sc.nextInt();
//         System.out.println("Enter the decimal no: ");
//         int m=sc.nextInt();
//         int binarynum=0;
//         int pw=1;//power of 2;
//         while (n>0) {
//             int unit_digit=n%10;
//             binarynum+=pw*unit_digit;
//             n/=10;
//             pw*=2;
//         }
//         System.out.println("Total decimal no: ");
//         System.out.println(binarynum+m);
//     }
// }

//Answer:-4/////////////////// 
//  import java.util.Scanner;
// public class j11_numbersystem {
//     public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Decimal number: ");
//        int a=sc.nextInt();
//        System.out.println("binary number: ");
//        int b=sc.nextInt();
//        int ans=0;
//        int pw=1;
//        while (a>0) {
//             int unit_digit=a%10;
//             ans+=pw*unit_digit;
//             a/=10;
//             pw*=2;
//        }
//        System.out.println("Answer: ");
//         System.out.println(ans*b);
//     }
// }
//Answer:-5;
// public class j11_numbersystem{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the decimal double no: ");
//         double n=sc.nextDouble();
//         System.out.println("Enter the number of precision digits: ");
//         int m=sc.nextInt();
//         int decimal_n=(int)n;
//         double fractional_n = n-decimal_n;
//         int decimal_binary=0;
//         int pw=1;
//         while(decimal_n!=0){
//             int unit_digit=decimal_n%2;
//             decimal_binary+=unit_digit*pw;
//             decimal_n/=2;
//             pw*=10;

//         }
//         String s=Integer.toString(decimal_binary)+".";
//         while(m>0 && fractional_n!=0){
//             fractional_n*=2;
//             int digits=(int)fractional_n;
//             s+=digits;
//             fractional_n=fractional_n-digits;
//             m--;
//         }
//         System.out.println(s);
//     }
// }