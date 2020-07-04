public boolean bobThere(String str) {
  // str.length() - 2 because bob is 3 characters - need to find the first b 
  // otherwise, if b was last part of string, if we go 2 ahead - would be out of the string
  for(int i = 0; i < str.length()-2; i++) {
    String firstB = str.substring(i, i+1);
    String secondB = str.substring(i+2, i+3);
   
    // making me use equals() instead of = 
    // why is this?
    if(firstB.equals("b") && secondB.equals("b")) {
      return true;
    }
  } 
  
  return false;
}