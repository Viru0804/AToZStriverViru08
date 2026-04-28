import java.util.*;
public class CharFreqUsingHashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String s;
        System.out.println("Enter The String");
        s = sc.next();
        //precomputation
        
        HashMap<Character,Integer> mpp = new HashMap<>();
        
        for(int i=0; i<s.length(); i++)
        {
            char key= s.charAt(i);
            int freq = 0;
            
            if(mpp.containsKey(key))
            freq = mpp.get(key);
            
            freq++;
            mpp.put(key,freq);
        }
        
        int q;
        
        System.out.println("Enter Number Of keys");
        q = sc.nextInt();
        
        while(q-- > 0)
        {
            char ch;
            System.out.println("Eneter the key");
            ch = sc.next().charAt(0);
            
            if(mpp.containsKey(ch))
            System.out.println("Frequency = "+mpp.get(ch));
            else
            System.out.println("Frequency is 0");
        }
        sc.close();
    }


}
