class Solution {
    public int maxArea(int[] height) {
        int l=0;
        int r=height.length-1;
        int cap=0;
        int max=0;

        while(l<r){
            cap=(r-l)*Math.min(height[l],height[r]);
            max = Math.max(cap,max);
            if(height[l] < height[r]){
                l++;
            } else{
                r--;
            }
        }

        return max;
    }
}