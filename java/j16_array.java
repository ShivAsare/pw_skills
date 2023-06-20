import javax.naming.ldap.ManageReferralControl;

//Answer:-1////////////////////
// class AssignmentofArray{
//     void positionofarray(){
//         int[] arr={2,6,-5,-1,0,4,-9};
//         for (int val:arr){
//             if (val >=0){
//                 System.out.println(val);
//             }
//         }
//     }
    
// }
// public class j16_array {
//     public static void main(String[] args) {
//         AssignmentofArray obj=new AssignmentofArray();
//         obj.positionofarray();
//     }
// }
//Answer:-2////////////////////
// public class j16_array{
//     public static void main(String[] args) {
//         String [] arr={"ab","bc","cd","de","ef","fg","gh"};
//         for(int i=0;i<arr.length;i++){
//             if (i%2!=0){
//                 System.out.println(arr[i]);
//             }
//         }
//     }
// }
//Answer:-3//////////////////////
// public class j16_array{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6,7,8};
//         for(int i=0;i<arr.length;i++){
//             if (i%2!=0){
//                 System.out.println(arr[i]);
//             }
//         }
//     }
// }
// //Answer:-4///////////////////////
public class j16_array{
    public static void main(String[] args) {
        int arr[]={2,-3,5,8,1,0,-4};
        int ans=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i-1]<arr[i]&&arr[i]>arr[i+1]){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
//Answer:-5////////////////////////
// public class j16_array{
//     public static void main(String[] args){
//         int[] arr={1,1,4,3,2,3,5,7,0};
//         for(int i=1;i<arr.length-1;i++){
//             if(arr[i-1]<arr[i]&&arr[i]>arr[i+1]){
//                 System.out.println(arr[i]);
//                 break;
//             }
//         }
//     }
// }