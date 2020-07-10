// Given an array of ints, return true if the array contains no 1's and no 3's.


// lucky13([0, 2, 4]) → true
// lucky13([1, 2, 3]) → false
// lucky13([1, 2, 4]) → false

public class Lucky13{	
	public boolean Lucky13(int[] nums) {
		// for every # in array, check if 1 or 3, if so return false

		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1 || nums[i] == 3) {
				return false;
			}
		}

		return true;
	}
}