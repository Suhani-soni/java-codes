public class RECURSION17 { 
    public static int printlength(String str){
        if(str.length() == 0){
            return 0;
        }
        return printlength(str.substring(1)) +1 ;
    }
    public static void main(String args[]){
         String str ="Suhani soni";
        System.out.print(printlength( str));
    }

    }