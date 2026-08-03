public class CountTarget{
    static void print(int arr[],int i,int target,int count){
        if(i>=arr.length){
            System.out.println(count);
             
            return;
        }
      if(arr[i]==target){
        count++;
      }
     print(arr,i+1,target,count);
      
    }
    public static void main(String[] args){
        int arr[]={10,6,787,6,7,9,8,6,6,9};
        int i=0;
        int maxi=Integer.MIN_VALUE;
        int target=6;
        int count=0;

       print(arr,i+1,target,count);
    }
}