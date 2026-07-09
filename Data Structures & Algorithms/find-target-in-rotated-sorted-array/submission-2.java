class Solution {
    public int search(int[] nums, int target) {
        if(nums==null) return -1;
        int count=0;
        for(int i=0;i<nums.length-1;i++){
           if(nums[i+1]>nums[i]){
           count++;
           }else{
            break;
           }
        }
        
        int []arr1=new int[count+1];
        int []arr2=new int[nums.length-1-count];
        for(int i=0;i<=count;i++){
            arr1[i]=nums[i];
        } int ind=0;
        for(int i=count+1;i<nums.length;i++){
            arr2[ind++]=nums[i];
        }
        if(binarySearch(arr1,target)!=-1)return binarySearch(arr1,target);
        if(binarySearch(arr2,target)!=-1)return count +1+ binarySearch(arr2,target);
        return -1;
    }
     public int binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;
 
        while (low <= high) {
            int mid = low + (high - low) / 2; // Calculate mid to prevent overflow
            if (array[mid] == key) {
                return mid; // Key found, return index
            } else if (array[mid] < key) {
                low = mid + 1; // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }
        return -1; // Key not found
    }
}
