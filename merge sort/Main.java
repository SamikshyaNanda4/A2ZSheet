//Solution Solved on GFG which is why main method is missing.

class Solution {

    void mergeSort(int arr[], int l, int r) {
        // code here
        if(l>=r) return;
        int mid=l+(r-l)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    
   void  merge(int arr[],int low,int mid, int high){
        int temp[]=new int[high-low+1];
        int left=low;
        int right=mid+1;
        int k=0;
        while(left<=mid&& right<=high){
            if(arr[left]<=arr[right]){
                temp[k++]=arr[left++];
            }else{
                temp[k++]=arr[right++];
            }
        }
        while(left<=mid){
            temp[k++]=arr[left++];
        }
        while(right<=high){
            temp[k++]=arr[right++];
        }
        
        for(int i=0;i<temp.length;i++){
            arr[low+i]=temp[i];
        }
    }
    