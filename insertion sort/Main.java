import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr={13,46,24,52,20,9};
        System.out.println(Arrays.toString(arr));
        
        insertionSort(arr,arr.length);
         System.out.println(Arrays.toString(arr));
    }
    //when sorted only traverse throught i loop and never goes inside while so 0(n) and average and worst is 0(n2) 
    static void insertionSort(int[] arr,int length){
            for(int i=1;i<length;i++){
                int j=i;
                while(j>0 && arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
    }
}