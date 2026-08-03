public class Minimum{
    static void print(int arr[],int i,int mini){
        if(i>=arr.length){
             System.out.println(mini);
            return;
        }
       if(arr[i]<mini){
        mini=arr[i];
       }
       print(arr,i+1,mini);

    }
    public static void main(String[] args){
        int arr[]={10,6,787,9};
        int i=0;
        int mini=Integer.MAX_VALUE;
      print(arr,i,mini);
     
    }
}