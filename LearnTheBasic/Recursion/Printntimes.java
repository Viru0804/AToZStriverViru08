class printntimes{

    static void print(int num, int target){
        if(num == target)
        {
            return;
        }
        else{
            System.out.println("  "+num);
            num++;
            print(num,target);
        }
    }

    public static void main(String[] args) {
        print(1,5);
    }

}