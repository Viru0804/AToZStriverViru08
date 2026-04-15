public class PrintNameNTimes {

    static void printname(int num,int target){

        if(num == target)
            return;
            System.out.println("Viru");
            num++;
            printname(num, target);
    }

    public static void main(String[] args) {
        printname(0, 5);
    }
    
}
