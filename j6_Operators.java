import java.util.Scanner;
// //Answer:-1
// public class j6_Operators {
//     public static void main(String[] args) {
//         System.out.println("Enter the number: ");
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int sum=((((n+8)/3)%5)*5);
//         System.out.println("Final Answer: ");
//         System.out.println(sum);
//     }
// }
// //Answer:-2////////////////////////////////
// public class j6_Operators{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the first No: ");
//         int a=sc.nextInt();
//         System.out.println("Enter the Second No: ");
//         int b=sc.nextInt();

//         a=a+b;
//         b=a-b;
//         a=a-b;
//         System.out.println("a: "+a);
//         System.out.println("b: "+b);
//     }
// }
// //Answer:-3
// public class j6_Operators{
//     public static void main(String[] args) {
//         System.out.println("Enter the any No: ");
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int sum=0;
//         while(n>0){
//             sum+=n%10;
//             n/=10;
//         }
//         System.out.println(sum);
//     }
// }
// //Answer:-4
// public class j6_Operators{
//     public static void main(String[] args) {
//         int a=55;
//         int b=70;
//         System.out.println(a<50&&a<b);
//         System.out.println(a<50||a<b);
//     }
// }
//Answer:-5/////////////////////////
public class j6_Operators{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=a^b;
        int count=0;
        while(n!=0){
            n=n&(n-1);
            count++;
        }
        System.out.println(count);
    }
}