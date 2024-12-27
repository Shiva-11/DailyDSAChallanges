class SortColors {
    public void sortColors_(int[] nums) {
        int minidx;
        for(int i = 0; i < nums.length-1; i++){
            minidx = i;
            for(int j = i+1; j < nums.length; j++ ){
                if(nums[j] < nums[minidx])
                    minidx = j;
            }
            int temp = nums[minidx];
            nums[minidx] = nums[i];
            nums[i] = temp;

        }
    }
}