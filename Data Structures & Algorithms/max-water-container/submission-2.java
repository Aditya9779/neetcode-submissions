class Solution {
    public int maxArea(int[] heights) {
        if(heights==null) return 0;
        int left=0;
        int right =heights.length-1;
        int maxHeight=0;
        int maxWidth=0;
        int maxArea=0;
        while(left<right){
        maxHeight=Math.min(heights[left],heights[right]);
        maxWidth=right-left;
        maxArea=Math.max(maxArea,maxHeight*maxWidth);
        if(heights[left]<heights[right]){
            left++;
        }
        else{
            right--;
        }
        }
        return maxArea;
    }
}
