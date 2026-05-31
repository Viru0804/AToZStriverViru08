import java.util.*;
public class ArrayLeftRotateByDIndexes {   

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n;
        int d=3;
        System.out.println("Enter the size of the array ");
        n = sc.nextInt();
        
        int[] arr = new int[n];
        System.out.println("Enter the array elements ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        leftrotatearraybyd(arr,n,d);
        sc.close();
    }
    public static void leftrotatearraybyd(int[] arr, int n, int d){
        int a=0;
        reverse(arr,a,d-1);
        reverse(arr,d,n-1);
        reverse(arr,a,n-1);
        for(int i=0; i<n; i++){
            System.out.print(" "+arr[i]);
        }
    }
    
    public static void reverse(int[] arr, int start, int end){
        
        while(start<=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

}