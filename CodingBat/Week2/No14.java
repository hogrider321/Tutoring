// Given an array of ints, return true if it contains no 1's or it contains no 4's.


// no14([1, 2, 3]) → true
// no14([1, 2, 3, 4]) → false
// no14([2, 3, 4]) → true

public class No14 {
	public boolean No14(int[] nums) {
		// for every number in nums, check if it is 1 - if so, make has1 true
		// if not, check if 4 - if so, make has4 true
		// if both variables are true, return false
		// if not, return true

		boolean has1 = false; 
		boolean has4 = false;

		for(int i = 0; i < nums.length; i++) {
			if(nums[i] == 1) {
				has1 = true;
			}
			if(nums[i] == 4) {
				has4 = true;
			}	
		}

		if(has1 == true && has4 == true) {
			return false;
		}

		return true;
	}
}
