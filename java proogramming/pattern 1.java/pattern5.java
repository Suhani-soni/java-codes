public class pattern5 {
    public static void main(String args[])
    //print character pattern
    {
        char ch = 'A';
         for(int i=1;i<=5;i++){
            
            for(int chars=1;chars<=i;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    
}
