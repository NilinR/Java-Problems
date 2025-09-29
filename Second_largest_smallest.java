import java.util.Scanner;
public class Second_largest_smallest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        System.out.println("Enter the elements of an array");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int largest = arr[0];
        int large2 = arr[0];
        int smallest = arr[0];
        int small2 = arr[0];
        
        for(int i=1; i<n; i++){
            if(arr[i]<smallest){
                small2=smallest;
                smallest=arr[i];
            }
            if(arr[i]>largest){
                large2=largest;
                largest = arr[i];
            }
        }
        
        System.out.println("Second smallest of an array :" + small2);
        System.out.println("Smallest of an array :" + smallest);
        System.out.println("Second lagest of an array :" + large2);
        System.out.println("Largest of an array :" + largest);
    }
}