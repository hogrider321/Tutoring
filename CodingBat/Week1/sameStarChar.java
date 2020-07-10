public boolean sameStarChar(String str) {
  // going to find all false cases 
  // i = 1 to find * because it can't be the first char. if it is, then won't execute the false code
  // str.length() - 1 because won't run false code if empty string 
  for(int i=1; i < str.length()-1; i++) {
   // if the char is * AND the char before and after are not equal, then false
    if(str.charAt(i) == '*' && str.charAt(i-1) != str.charAt(i+1)) {
      return false;
    }
  }
  return true;
}
