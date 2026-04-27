import java.util.*;
class ArrayFrequencyUsingHashmap{

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n;
        System.out.println("Enter Number of elements");
        n = sc.nextInt();
        
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++)
        {
            System.out.println("Enter Numbers in array");
            arr[i] = sc.nextInt();
        }
        
        //precomputation
        
        HashMap<Integer,Integer>  mp = new HashMap<>();
        
        for(int i=0; i<n; i++)
        {
            int key= arr[i];
            int freq = 0;
            
            if(mp.containsKey(key))
            freq = mp.get(key);
            
            freq++;
            mp.put(key,freq);
        }
        
        int q;
        
        System.out.println("Enter Number Of keys");
        q = sc.nextInt();
        
        while(q-- > 0)
        {
            int number;
            System.out.println("Eneter the key");
            number = sc.nextInt();
            
            if(mp.containsKey(number))
            System.out.println("Frequency = "+mp.get(number));
            else
            System.out.println("Frequency is 0");
        }
    }
}
