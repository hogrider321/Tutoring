public class CountYZ{
  public int CountYZ(String str) {
    int count = 0;
    str = str.toLowerCase();
    for(int i = 0; i < str.length(); i++) {
      if(i == str.length()-1) {
        if(str.charAt(i) == 'y' || str.charAt(i) == 'z') { 
        count++;
        }
      }
      else {
        if(!Character.isLetter(str.charAt(i+1)) && (str.charAt(i) == 'y' || str.charAt(i) == 'z')) {
          count++;
        }
      }
    }
    return count;
  }
}
