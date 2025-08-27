//Solution Solved on GFG which is why main method is missing.
class Solution {
    public void quickSort(int[] arr, int low, int high) {
        // code here
        if(low<high){
            int partitionIndex=partition(arr,low,high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr,partitionIndex+1,high);
        }
    }

    private int partition(int[] arr, int low, int high) {
        
        // code here
        int pivot=arr[low];
        int i=low;
        int j=high;
        while(i<j){
            
            while(i<high && arr[i]<=pivot){
            i++;
        }
        while(j>low && arr[j]>pivot ){
            j--;
        }
        
        if(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        }
        int temp=arr[j];
        arr[j]=arr[low];
        arr[low]=temp;
        return j;
    }
}