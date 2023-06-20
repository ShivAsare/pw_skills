//Answer:-1/////////////////////////////
import java.util.Scanner;
import java.util.Arrays;
// public class j17_Array_2{
//     static void unsorted(int[] arr,int n){
//         int[] ans=new int[n];
//         int idx=0;
//         for (int i = 0; i < n; i++) {
//             if(arr[i]>=0){
//                 ans[idx]=arr[i];
//                 idx++;
//             }
//         }
//         for (int i = 0; i < n; i++) {
//             if(arr[i]<0){
//                 ans[idx]=arr[i];
//                 idx++;
//             }

//         }
//         System.out.println("Answer: ");
//         for (int i = 0; i < n; i++) {
//            System.out.print(ans[i]+" ");
//         }

//     }
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the Array no: ");
//         int n=sc.nextInt();
//         int[] arr =new int[n];
//         System.out.println("Enter the Array Element no: ");
//         for (int i = 0; i < n; i++) {
//             arr[i]=sc.nextInt();

//         }
//         unsorted(arr,n);
//     }
// }
//Answer:-2//////////////////////
// public class j17_Array_2{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the length of arrays: ");
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         int [] a=new int[n];
//         int [] b=new int[m];
//         for (int i = 0; i < n; i++) {
//             a[i]=sc.nextInt();
//         }
//         for (int i = 0; i < m; i++) {
//             b[i]=sc.nextInt();
//             boolean check =false;
//             for (int j = 0; j <n; j++) {
//                 if (b[i])==a[i]{
//                     check=true;
//                     break;
//                 }
//             }
//             if (!check){
//                 System.out.println(b[i]);
//             }
//         }
//     }
// }
////Answer:-3########################################/
// public class j17_Array_2{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the length of array: ");
//         int n=sc.nextInt();
//         int[] arr =new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i]=sc.nextInt();
//         }
//         int k =sc.nextInt();
//         Arrays.sort(arr);
//         System.out.println(arr[k-1]);
//     }
// }
////Answer:-4%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
// public class j17_Array_2{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the length of array: ");
//         int n=sc.nextInt();
//         int s=sc.nextInt();
//         int[] arr=new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i]=sc.nextInt();
//         }
//         int i=0;
//         int j=0;
//         int sum=0;
//         while(j<n){
//             sum+=arr[j];
//             if(sum>s){
//                 while (sum>s&& i<j) {
//                     sum-=arr[i];
//                     i++;
//                 }
//             }
//             if(sum==s){
//                 System.out.print(i+ " ");
//                 System.out.print(j);
//                 break;
//             }
//             j++;
//         }

        
//     }
// }
///////////Answer:-5########################################//#endregion
public class j17_Array_2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Arrray length : ");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        int[] arr2=new int[n];

        for (int i = 0; i <n; i++) {
            arr1[i]=sc.nextInt();
        }
        boolean ans=true;
        for (int i = 0; i < n; i++) {
            arr2[i]=sc.nextInt();
            while (arr2[i]!=arr1[i]) {
                ans=false;
                break;
            }
        }
       
        System.out.println(ans);
    } 
}