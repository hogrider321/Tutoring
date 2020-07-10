public int sum13(int[] nums) {
  int sum = 0;
  // if empty array
  if(nums.length == 0) {
    return sum;
  }
  // if not empty... for every number in array...
  for(int i = 0; i < nums.length; i++) {
    // if not 13, add to sum
    if (nums[i] != 13) {
       sum = sum + nums[i]; 
      }
    // need else statement: if 13, don't add to sum and skip the next #.
    // note: initially thought that the problem wanted you to remove ALL numbers after... I guess not.
    else {
      i++;
    }
  }
  return sum;
}
