public class BACKTRACKING3 {
    public static void findpermutation(String str, String ans){
        //base
        if( str.length() == 0){
            System.out.println(ans);
            return;
        }
        //recursion
        for(int i=0; i<str.length(); i++){
            //get the current character
            char curr = str.charAt(i);
            //Form the remaining string without the current character
            String  newstr = str.substring(0,i) + str.substring(i+1);
            //Recursive call with the new string and the current character appended to ans.
            findpermutation(newstr, ans+curr);
        }
    }
     public static void main(String args[]){
        String str = "abc";
        findpermutation(str, "");
     }
    
}
