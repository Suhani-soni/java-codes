public class BACKTRACING2 {
     public static void printsubsets(String str, String ans, int i){
        //base
        if(i == str.length()){
            if(ans.length() == 0){
                System.out.println("null");
            }
            else{
            System.out.println(ans);
        }
        return;
    }
        //recursion
        //kaam
        printsubsets(str, ans+str.charAt(i), i+1); //yes
        printsubsets(str, ans,i+1);
     }
    public static void main(String args[]){
        String str = "abc";
        printsubsets(str,"",0);
   }
    
}
