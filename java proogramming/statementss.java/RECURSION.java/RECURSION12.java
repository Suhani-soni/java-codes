public class RECURSION12 { 
     public static int friendspairing( int n) {
        //basecase
        if(n==1 || n==2){
            return n;
        }
        //kaam single,paifriendspairing(int n)ring 
        //single
      //  int fnm1 = friendspairing( n-1);
        //pair
      //  int fnm2 = friendspairing(n-2);
      //  int pairways = (n-1) *(n-2);
      //  int totalways = fnm1 + pairways;
      //  return totalways;
return friendspairing( n-1) + ( n-1)* (n-2);


     }
    public static void main(String args[]){
        System.out.println(friendspairing(4));

    }
    
}
