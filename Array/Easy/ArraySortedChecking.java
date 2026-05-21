import java.util.*;
public class ArraySortedChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        
        int[] arr = new int[n];
        
        System.out.println("Enter the elements of the array");
        for(int i=0; i<n ; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        boolean isSorted = Sorted(arr,n);
        System.out.println("Array is sorted = "+isSorted);
    }
    
    public static boolean Sorted(int[] arr,int n){
        
        for(int i=1; i<n; i++)
        {
            if(arr[i]>arr[i-1])
            {
            }
            else{
            return false;
            }
        }
    return true;
    }
}
