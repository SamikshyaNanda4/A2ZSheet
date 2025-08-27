class Solution {
    public void bubbleSort(int[] arr) {
        // code here
        int i=0;
        int n=arr.length;
        int count=1;
        recursiveBS(arr,i,n,count);
    }
    
    public static void recursiveBS(int arr[], int i, int n,int c){
        if (c == 0) return;
        if(n<=1) return;
        int j=0;
        int count = 0;
        while(j<n-1){
            if(arr[j]>arr[j+1]){
                swap(arr,j,j+1);
                count++;
            }
             j++;
        }
        recursiveBS(arr,i,n-1,count);
    }
    
    static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}

