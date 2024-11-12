class Solution {
    public int removeElement(int[] nums, int val) {
        int ptr = 0, sz, temp;
        sz = nums.length;
        for(int i=0; i<sz; i++){
            if(!(nums[i] == val)){
                temp = nums[i];
                nums[i] = nums[ptr];
                nums[ptr] = temp;
                ptr++;
            }
        }
        return ptr;
    }
}