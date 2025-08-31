class Solution {
    public void rotate(int[] arr) {
        // code here
        int[] newArr = new int[arr.length];
        int lastIndex = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[(lastIndex + i) % arr.length];
        }

        for (int j = 0; j < arr.length; j++) {
            arr[j] = newArr[j];
        }
    }

}
