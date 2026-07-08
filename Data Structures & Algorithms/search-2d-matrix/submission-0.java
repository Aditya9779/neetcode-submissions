class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null)
            return true;
        boolean ans;    
        for (int i = 0; i < matrix.length; i++) {
            ans = binarySearch(matrix[i],0,matrix[i].length-1,target);
            if(ans) return true;
        }
        return false;
    }
    public boolean binarySearch(int arr[], int first, int last, int key) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                return true;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        return false;
    }
}
