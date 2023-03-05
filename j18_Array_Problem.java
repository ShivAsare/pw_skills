import java.util.Scanner;

///Answer:-1////////////////////////////////////////
// public class j18_Array_Problem{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the length of the array: ");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i]=sc.nextInt();

//         }
//         int x=sc.nextInt();
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 if (arr[j]-arr[i]==x){
//                     System.out.print("Yes");
//                     return;
//                 }
//             }
//         }
//         System.out.print("No");
//     }
// }
//Answer:=2//////////////////////////////////////////
public class j18_Array_Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the element of array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

        }
        System.out.println("Enter the number ");
        int x=sc.nextInt();
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x){
                count++;
            }
        }
        System.out.println(count);
    }
}