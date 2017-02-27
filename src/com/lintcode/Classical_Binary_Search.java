package com.lintcode;

public class Classical_Binary_Search {

	public int findPosition(int[] nums, int target) {
        int left=0,right=nums.length-1;
        while(left<=right){
        	int mid=left+(right-left)/2;
        	if(nums[mid]==target)
        		return mid;
        	else if(nums[mid]>target)
        		right=mid-1;
        	else
        		left=mid+1;
        }
        return -1;
    }
	public static void main(String[] args) {
		Classical_Binary_Search test=new Classical_Binary_Search();
		int[] nums={1, 2, 2, 4, 5, 5};
		System.out.println(test.findPosition(nums, 4));

	}

}
