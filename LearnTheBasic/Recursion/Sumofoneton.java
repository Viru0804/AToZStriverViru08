public class Sumofoneton {
    
    static void print(int n,int sum)
    {
        if(n<1)
        {
            System.out.println(sum);
            return;
        }
        
        print(n-1,sum+n);
    
    }
    public static void main(String[] args)
    {
        int n=5;
        print(n,0);
    
    }
}
