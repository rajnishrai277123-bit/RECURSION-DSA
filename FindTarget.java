public class FindTarget{
    static int print(int arr[],int i,int target){
        if(i>=arr.length){
             
            return -1;
        }
      if(arr[i]==target){
        return i;
      }
   int ans=   print(arr,i+1,target);
      return ans;
    }
    public static void main(String[] args){
        int arr[]={10,6,787,9};
        int i=0;
        int maxi=Integer.MIN_VALUE;
        int target=9;

        int ans=print(arr,i,target);
         System.out.println(" target found at index:"+ " "+ans);
         System.out.println(" target found at index:"+ " "+ans);
    }
}