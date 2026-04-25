import java.util.*;
    
class StringOccurance {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String s;
        System.out.println("Enter String");
        s = sc.next();
        
        int[] hash = new int[256];
        for(int i=0; i<s.length(); i++)
        {
            hash[s.charAt(i)]++;
        }
        
        int q;
        System.out.println("Enter the number of keys you want to find");
        q = sc.nextInt();
         while(q-- != 0){
             
             char c;
             System.out.println("Enter Key character");
             c = sc.next().charAt(0);
             
             System.out.println(hash[c]);
         }
    }
}
