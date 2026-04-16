public class Sumofonetonreturn {
    
    static int fact(int n)
    {
        if(n == 0)
        return 0;
        return(n + fact(n-1));
    }
    public static void main(String[] args)
    {
        int n=5, res=0;
        res=fact(n);
        System.out.println(res);
    
    }
}
