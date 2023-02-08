import java.util.Scanner;
// //Answer:-1////////////////////////////
// public class j7_Conditionals {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the length No: ");
//         int length=sc.nextInt();
//         System.out.println("Enter the Breadth NO: ");
//         int Breadth=sc.nextInt();
//         if(length==Breadth){
//             System.out.println("It is a Square: ");
//         }else{
//             System.out.println("It is a not Square: ");
//         }

//     }
// }
// //Answer:-2//////////////////////////
// public class j7_Conditionals{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         int n=sc.nextInt();
//         if(n<0){
//              n*=-1;
//         }
//         System.out.println("the absolute value is: "+n);
//     }
// }
// //Answer:-3///////////////////
// public class j7_Conditionals{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the CostPrice: ");
//         int cost=sc.nextInt();
//         System.out.println("Enter the SellingPrice: ");
//         int selling=sc.nextInt();
//         int Profit=selling-cost;
//         int Loss=cost-selling;
//         if (Profit>cost){
//             System.out.println("Profit="+Profit);
//         }else{
//             System.out.println("Loss="+Loss);
//         }
//     }
// }
// //Answer:-4/////////////////////////////
// public class j7_Conditionals{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter an integer: ");
//         int n=sc.nextInt();
//         if(n<0){
//             System.out.println("The number is negative ans skipped");
//         }else{
//             System.out.println("The number is positive and skipped");
//         }
//     }
// }
//Answer:-5////////////////////////
public class j7_Conditionals{
    /**
     * @param args
     */
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      char op;
      double a;
      double b;
      double ans;
      System.out.println("Enter the first no: ");
      a=sc.nextInt();
      System.out.println("Enter an Operator: (+,-,*,or/)"); 
      op=sc.next().charAt(0);
      System.out.println("Enter the second no: ");
       b=sc.nextInt();
        switch (op) {
            case '+':
                ans=a+b;
                System.out.println(a+" + "+b+"= "+ans);
                break;
            case '-':
            ans=a-b;
            System.out.println(a+" - "+b+"= "+ans);
            break;
            case '*':
            ans=a*b;
            System.out.println(a+" * "+b+"= "+ans);
            break;
            case '/':
            ans=a+b;
            System.out.println(a+" / "+b+"= "+ans);
            break;
        
            default:
            System.out.println("Eroor! The operator is not correct");
                break;
        }
     

    }
}
// //Answer:-6///////////////////////////////
// public class j7_Conditionals{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter your Marks: ");
//         int marks=sc.nextInt();

//         if(marks>=90){
//             System.out.println("Your Grade is A+");
//         }
//         else if (marks>=80) {
//             System.out.println("Your Grade is A");
//         }
//         else if (marks>=70) {
//             System.out.println("Your Grade is B+");
//         }
//         else if (marks>=60) {
//             System.out.println("Your Grade is B");
//         }   
//         else if (marks>=50) {
//             System.out.println("Your Grade is C");
//         }  
//         else if(marks>=40) {
//             System.out.println("Your Grade is D");
//         }
//         else if(marks>=30){
//             System.out.println("Your Grade is E");
//         }else{
//             System.out.println("Your Grade is F");
//         }
//     }
// }