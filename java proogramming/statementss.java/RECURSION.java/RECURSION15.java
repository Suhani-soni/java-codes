public class RECURSION15 {  
    static String digit[] = {"zero","one ", "two", "three","four", "five","six","seven","eight","nine"};
     
    public static void printdigit(int number){
        if(number == 0){
            return;
        }
        int lastdigit = number%10 ;
        printdigit(number/10);

       System.out.print(digit[lastdigit] + " ");
        
        return;
       
    }
    public static void main(String args[]){
      
     printdigit(1947);
    }    
    }
    

