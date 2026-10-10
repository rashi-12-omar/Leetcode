class Solution {// O(n)
    public int trap(int[] arr) {
        int LMax=0;
        int RMax=0;
        int left=0;
        int right=arr.length-1;
        int total=0;
        while(left<right){
            if(arr[left]<=arr[right]){
                if(LMax>arr[left]){
                    total+=LMax-arr[left];
                }else{
                    LMax=arr[left];
                }
                left=left+1;
            }
            else{
                if(RMax>arr[right]){
                    total+=RMax-arr[right];
                }else RMax=arr[right];
                right=right-1;
            }
        }
        return total;
    }
}