import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr={13,46,24,52,20,9};
        System.out.println(Arrays.toString(arr));
        
        selectionSort(arr,arr.length);
         System.out.println(Arrays.toString(arr));
    }
    
    static void selectionSort(int[] arr,int length){
        for(int i=0;i<length-1;i++){
            int minIndex=i;
            for (int j=i+1;j<length;j++){
                if(arr[minIndex]>arr[j]){
                    minIndex=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[minIndex];
            arr[minIndex]=temp;
        }
    }
}