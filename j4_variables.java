import java.util.Scanner;

// //Take 2 integer values in two variables x and y and print their product.
// public class j4_variables {
//     public static void main(String[] args) {
//         int x=2;
//         int y=4;
//         System.out.println(x*y);
//     }
// }

// /*Print the ASCII value of character 'U'
//  */
// public class j4_variables{
//     public static void main(String[] args) {
//         int x='U';
//         System.out.println(x);
//     }
// }

//Answer:-3///////
// public class j4_variables{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int length=sc.nextInt();
//         int breadth=sc.nextInt();

//         System.out.println(length*breadth);
//     }
// }
//Answer:-4
// public class j4_variables{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int x=sc.nextInt();

//         int cube=x*x*x;
//         System.out.println("Number:"+x);
//         System.out.println("cube no:"+cube);

//     }
// }
//Answer:-5//////////////
public class j4_variables{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        int c=a;
        a=b;
        b=c;
        System.out.println(a);
        System.out.println(b);
    }
}