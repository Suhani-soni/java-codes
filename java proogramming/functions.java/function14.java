public class function14 {
    public static void dectobin(int n){
        int pow = 0;
        int mynumber = n;
        int binnum = 0;
        while(n>0){
            int rem = n%2;
            binnum = binnum + (rem *(int)Math.pow(10,pow));
            pow++;
            n = n/2;
        }
        System.out.println("binary form of" + mynumber + "=" + binnum);

    }
    public static void main(String args[]){
        dectobin(7);
    }
 }
