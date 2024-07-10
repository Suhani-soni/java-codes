public class function12 {
    public static void bintodec(int binnum ){
        int pow = 0;
        int decnum = 0;
        int mynumber = binnum;
        while(binnum>0){
        int lastdigit = binnum%10;
        decnum = decnum +(lastdigit*(int)Math.pow(2,pow));
        pow++;
        binnum = mynumber/10;
    }
    System.out.println("decimal of "+ mynumber +"=" + decnum);
    
}
public static void main(String args[]){
    bintodec(101);
}
}
