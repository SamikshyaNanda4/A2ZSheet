class Solution {
    // Please change the array in-place
    public void insertionSort(int arr[]) {
        // code here
        int i=0;
        int n=arr.length;
        recursiveIS(arr,i,n);
    }
    
    public static void recursiveIS(int arr[],int i, int n){
        if(i>=n) return;
        int j=i;
        while(j>0 && arr[j-1]>arr[j]){
            swap(arr,j,j-1);
        }
        recursiveIS(arr,i+1,n);
    }
    
    static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}