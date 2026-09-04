class Solution {
    public int[] getConcatenation(int[] nums) {
        int size=nums.length+nums.length;
        int newArray[]=new int[size];
        for(int i=0;i<nums.length;i++){
            newArray[i]=nums[i];
        }
        for (int i=0;i<nums.length;i++){
            newArray[i+nums.length]=nums[i];
        }
        return newArray;
    }
}
