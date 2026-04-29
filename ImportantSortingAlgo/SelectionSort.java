package ImportantSortingAlgo;

import java.util.*;

class SelectionSort{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter The Size of the Array");
        n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter the array element no: "+(i+1));
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<=n-2; i++)
        {
            int mini = i;
            for(int j=i; j<=n-1; j++)
            {
                if(arr[j]<arr[mini])
                mini = j;
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
        }
        
        for(int i=0; i<n; i++)
        {
            System.out.print("  "+arr[i]);
        }
       sc.close(); 
    }
}