// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 if(nums[i] == nums[j]){
//                    if(Math.abs(i - j) <= k)
//                    return true;

//                 }
//             }
//         }
//         return false;
//     }
// }//it take O(n2) time complexity to optimal solution use hashset
import java.util.*;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {

            // if number already seen
            if(map.containsKey(nums[i])) {

                int prevIndex = map.get(nums[i]);

                if(i - prevIndex <= k)
                    return true;
            }

            // update latest index
            map.put(nums[i], i);
        }

        return false;
    }
}
