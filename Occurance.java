import java.util.Scanner;
public class Occurance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of an array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter target");
        int target=sc.nextInt();

        int count=0;
        boolean found=false;        
       
        for(int i=1; i<n; i++){
            if(arr[i]==target){
                count+=1;
                if(count==1){
                    System.out.println("First occurance "+i);
                }
                if(count==2){
                    System.out.println("Second occurance "+i);
                }
            }   
        }

        if(count==0){
            System.out.println("Not Found");
        }
        
    }
}