//13 46 24 52 20 9
import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        int[] arr={13,46,24,52,20,9};
        System.out.println(Arrays.toString(arr));
        
        bubbleSort(arr,arr.length);
         System.out.println(Arrays.toString(arr));
    }
    
    static void bubbleSort(int[] arr,int length){
            for(int i=0;i<length-1;i++){
                int count=0;
                for(int j=0;j<length-i-1;j++){
                      if(arr[j]>arr[j+1]){
                        count++;
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                    }
                 }
                 if (count<1){
                       return; 
                    }
            }
    }
}