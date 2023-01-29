import java.util.Scanner;

import javax.swing.text.StyleContext.SmallAttributeSet;

//Answer:-1/////////////////////

// public class j10_method {
//     static int Average(int a,int b,int c){
//         int d=a+b+c;
//         int add=d/3;
//         return add;
//     }
//     public static void main(String[] args) {
//         int a=25;
//         int b=45;
//         int c=65;
//         j10_method obj=new j10_method();
//         int answer=obj.Average(a, b, c);
//         System.out.println(answer);
//     }
// }
///Answer:-2///////////////////////////////
// public class j10_method{
//      static int count_all_vowels(String[] args){
//        // String s=sc.length;
//        Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the String: ");
//         String s=sc.nextLine();
//        int count=0;
//        for (int i = 0; i <s.length(); i++) {
//         char ch=s.charAt(i);
//         if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
//             count++;
//         }
        
//        }
//        return count;
//     }
//     public static void main(String[] args) {
        
//         // j10_method obj=new j10_method();
//         // String ans=count(args);
//         System.out.println(count_all_vowels(args));
//     }
// }
//Answer:-3///////////////////////////////////////
// class j10_method{
//     public static String middle(){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the string: ");
//         String s=sc.nextLine();
//         if(s.length()%2==0){
//             return s.substring(s.length()/2,s.length()/2+1);

//         }else{
//             return s.substring(s.length()/2,s.length()/2+1);
//         }
//     }
//     public static void main(String[] args) {
//         System.out.println(middle());
//     }
// }
//Answer:-4/////////////////////////////////////////
// class j10_method{
//     static boolean LeapYear(){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the year: ");
//         int year=sc.nextInt();
//         int y=year;
//         boolean a=(y%4)==0;
//         boolean b=(y%100)!=0;
//         boolean c=((y%100==0)&&(y%400==0));
//         return a&&(b||c);

//     }
//     public static void main(String[] args) {
//         System.out.println(LeapYear());
//     }
// }
//Answer:-5///////////////////////////////////////////////
public class j10_method{
    static int smallest(){
        int[] arr={4,2,3,4,5,6,7};
        int smallest_no=Integer.MAX_VALUE;
        for (int i = 0; i <arr.length; i++) {
            if(smallest_no>arr[i]){
                smallest_no=arr[i];
            }
        }
        return smallest_no;
    }
    public static void main(String[] args) {
        System.out.println(smallest());
        // smallest();
    }
}