package RemoveDuplicatesFromSortedArray;

class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int j=0;
        nums[j]=nums[0];

        for(int i=0;i<nums.length-1;i++){

                if(nums[i]==nums[i+1]){
                    continue;
                }
                j++;
                k++;
                nums[j]=nums[i+1];
                
        }
        return k;     
    }
}