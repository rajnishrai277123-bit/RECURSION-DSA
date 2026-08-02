public class Print1toN{
    static void print(int n,int count){
        if(count>n){
            return;
        }
        System.out.println(count);
        print(n,count+1);

    }
    public static void main(String[] args){
      print(10,1);
    }
}