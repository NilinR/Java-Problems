import java.util.Scanner;
class linear_search{
    public static void main(String[] args)
    {   
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter length of array");
        int l=scan.nextInt();
        int [] arr=new int[l];
        for (int i=0;i<l;i++){
            arr[i]=scan.nextInt();
        }

       
        System.out.println("Enter target value");
        int target=scan.nextInt();
        boolean found=false;

        for (int i=0;i<l;i++) {
            if (arr[i]==target)
                System.out.println("found at "+i);
                found=true;
        }

        if(!found){
            System.out.println("Not found");
        }
    }
}