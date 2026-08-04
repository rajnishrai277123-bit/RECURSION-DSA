public class PrintDigit{
    static void print(int num){
        if(num==0){
            System.out.println("wapas jao");
            return;
        }
        int digit=num%10;
       
        num=num/10;
        print(num);
         System.out.println(digit);
    }
   
    public static void main(String[] args){
       print(137);
    }
}