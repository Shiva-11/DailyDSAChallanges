public class searchInsertPosition {
    public static void main(String args[]){
        int[] nums = {1,3,4,5,6,7};
        int target = 0;
        int position = search(nums, target);
        System.out.println("Position of "+target+" is "+position);
    }
    public static int search(int nums[], int target){
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if(nums[mid] == target) {
                return mid;
            }
            else if(nums[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return left;
    }
}   
