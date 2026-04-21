import java.util.*;
class occurance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.println("Enter Size of the array");
        n = sc.nextInt();
        
        int arr[] = new int[n];
        
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter Number ");
            arr[i] = sc.nextInt();
        }
        
        int hash[] = new int[13];
        
        for(int i=0; i<n; i++)
        {
            hash[arr[i]] +=1;
        }
        
        int k; 
        System.out.println("Number Of Keys");
        k = sc.nextInt();
        
        while(k-- !=0)
        {
            int num;
            System.out.println("Enter the number to be searched");
            num = sc.nextInt();
            System.out.println("Number of Occurance "+hash[num]);
        }
    }
}