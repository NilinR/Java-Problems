import java.util.*;

public class Reversed_array{
    public static void main(String[] args){
        // int[] arr ={10,20,30,40,50};
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n;i++){
            System.out.println("Enter "+(i+1)+" Element: ");
            arr[i]=sc.nextInt();
        }
        
        
        int start = 0;
        int end = arr.length-1;
        
        while(start<end){
            int temp = arr[start];
            arr[start]= arr[end];
            arr[end]= temp;
            
         start++;
         end--;
            
        }
        
        System.out.println("Reversed array :" + Arrays.toString(arr));
    }
}