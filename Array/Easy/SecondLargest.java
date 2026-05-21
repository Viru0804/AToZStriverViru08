import java.util.*;
public class SecondLargest {
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
        
        int sl = SLargest(arr,n);
        System.out.println("Second Largest="+sl);
    }
    public static int SLargest(int arr[], int n)
        {
            int largest = arr[0];
            int slargest = -1;
            
            for(int i=0 ; i<n ; i++){
                
                if(arr[i]> largest){
                    slargest = largest;
                    largest = arr[i];
                }
                else if(arr[i]> slargest && arr[i] != largest){
                    slargest = arr[i];
                }
            }
        return slargest;
        }
}
