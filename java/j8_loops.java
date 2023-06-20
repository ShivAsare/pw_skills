import java.util.Scanner;
//Answer:-1//////////////////////////
// public class j8_loops {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int a=1;
//         int b=1;
//         for (int i = 0; i < n; i++) {
//             System.out.print(a+" ");
//             int sum=a+b;
//             a=b;
//             b=sum;
//         }
//     }
// }
//Answer:-2////////////////////////////////
// public class j8_loops{


//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int sum=0;
//         while(sc.hasNextInt()){
//             int n=sc.nextInt();
//             if(n>=0){
//                 sum +=n;

//             }else{
//                 sum=-1;
//                 break;
//             }
//         }
//         System.out.print(sum);
//     }
// }
//Answer:-3
// public class j8_loops{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the factorial No: ");
//         int n=sc.nextInt();
//         int ans=1;
//         for (int i = 1; i <= n; i++) {
//             ans*=i;
//         }
//         System.out.println("Answer: ");
//         System.out.println(ans);
//     }
// }
//Answer:-4//////////////////////////////
// public class j8_loops{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int num=1;
//         while(num<=n){
//             int count=0;
//             int i=num;
//             while(i>0){
//                 count++;
//                 i/=10;

//             }
//             int val=num;
//             int sum=0;
//             while(val>0){
//                 int digit=val%10;
//                 sum+=Math.pow(digit, count);
//                 val/=10;
//                 if (sum>val) {
//                     continue;
//                 }
//             }
//             if (sum==num) {
//                 System.out.println(num);
//             }
//             num++;
//         }
//     }
// }
//Answer:-5;;;;;;;;;;;;;;;;;;;;;;;;;
// public class j8_loops{
//     public static void main(String[] args) {
//         int size=5;
//         for(int i=0;i<size;i++){
//            for(int j = 0; j < size; j++) {
//                 if(i==j||i+j==size-1) {
//                     System.out.print(" ");
//                 }else{
//                     System.out.print(" ");
//                 }
//            }
//            System.out.println();
//         }
//     }
// }
//Answer:-6////////////////
public class j8_loops{
    public static void main(String[] args) {
        int size=8;
        int alpha=65;
        int num=0;
        for (int i = 1; i <= size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print(" ");
            }
            for (int k= 0; k<i*2-1; k++) {
                System.out.print((char)(alpha+num++));
            }
            num=0;
            System.out.println();
        }
        for (int i = 1; i <= size-1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = (size-i)*2-1;k>0; k--) {
                System.out.print((char)(alpha+num++));
            }
            num=0;
            System.out.println();
        }
    }
}