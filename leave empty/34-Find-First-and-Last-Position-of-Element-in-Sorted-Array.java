class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
       int start = search( nums, target, true);
       int end = search( nums, target, false);
        ans[0]= start;
        ans[1] = end;
        return ans;      
    }

     int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            // find the middle element
//            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                //it checks the condition if it is true then it will check left side possiblities if no possibilietoies on left side then middle value is the start indexx 
                if (findStartIndex) {
                    end = mid - 1;
                } 
                //after checking left side for startindex then  assign the false for end and checks the right side for the last index
                else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
