import java.util.Scanner;

////Answer:-1/////////////////
// import java.util.Scanner;

// public class j5_TakingInput {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String name=sc.next();
//         String last_name=sc.next();
//         int roll_no=sc.nextInt();
//         String field_of_interest=sc.next();

//         System.out.println("Name:" +name+" "+last_name);
//         System.out.println("Roll Number:"+roll_no);
//         System.out.println("Field of interest:"+field_of_interest);

//     }
// }
///Answer:-2///////////////
// public class j5_TakingInput{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         String first_name=sc.next();
//         String last_name=sc.next();

//         System.out.println(first_name+last_name);
//     }
// }
//Answer:-3//////////////////////
// public class j5_TakingInput{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//         int b=sc.nextInt();
//         int c=sc.nextInt();

//         int Total_no=a+b+c;
//         int percentage=Total_no/3;

//         System.out.println("Total marks: "+Total_no);
//         System.out.println("Percentage marks: "+percentage+"%");
//     }
// }
///Answer:-4//////////////////////////
// public class j5_TakingInput{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int t=sc.nextInt();
//         for(int i=1;i<=t;i++){
//             int a=sc.nextInt();
//             int b=sc.nextInt();
//             System.out.println(a+b);
//         }
//     }
// }
//Answer:-5////////////////////
// public class j5_TakingInput{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         while(sc.hasNextLine()){
//             String a=sc.next();
//             String b=sc.next();
//             System.out.println(a+b);
//         }
//     }
// }
public class j5_TakingInput{
    public static void main(String[] args) {
        int n=6;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*" );
            }
            System.out.println();
        }
       
    }
}