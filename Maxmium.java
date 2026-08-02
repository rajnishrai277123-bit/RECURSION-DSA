public class Maxmium{
    static void print(int arr[],int i,int maxi){
        if(i>=arr.length){
             System.out.println(maxi);
            return;
        }
       if(arr[i]>maxi){
        maxi=arr[i];
       }
       print(arr,i+1,maxi);

    }
    public static void main(String[] args){
        int arr[]={10,6,787,9};
        int i=0;
        int maxi=Integer.MIN_VALUE;
      print(arr,i,maxi);
     
    }
}