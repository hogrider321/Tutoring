public int countEvens(int[] nums) {
  // create counter for number of even ints
  int evenNum = 0;
  // create for loop to check if each number is even
  for(int i = 0; i < nums.length; i++) {
   // point to the i index of num and use modulus to check if even
    if(nums[i] % 2 == 0) {
      // increase the count if even
      evenNum++;
    }
  }
  return evenNum;
}
