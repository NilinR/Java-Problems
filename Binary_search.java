import java.util.Scanner;
class Binary_search{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter length of array");
        int l=scan.nextInt();
        int [] arr=new int[l];
        for (int i=0;i<l;i++){
            arr[i]=scan.nextInt();
        }

        int lb=0;
        int ub=l-1;
        System.out.println("Enter target value");
        int target=scan.nextInt();
        boolean found=false;

        while (lb<=ub){
            int mid=lb+(ub-lb)/2;
            if(arr[mid]==target){
                System.out.println("Target found at "+mid);
                found=true;
                break;
            }
            else if(arr[mid]<target){
                lb=mid+1;
            }
            else{
                ub=mid-1;
            }
        }

        if(!found){
            System.out.println("Not found in array");
        }

    }
}