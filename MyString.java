public class MyString implements CharSequence,Comparable<CharSequence>{
  private char[] data;
  public MyString(CharSequence s){
    data = new char[s.length()];
    for (int i = 0; i < s.length(); i++){
      data[i] = s.charAt(i);
    }
  }

  //must watch for exception!!!
  public char charAt(int index){
    if (index < 0 || index >= data.length){
      throw new IndexOutOfBoundsException("Invalid index: " + index);
    }
    else{
      return data[index];
    }
  }


  public int length(){
    int count = 0;
    for (int i = 0; i < data.length; i++){
      count+= 1;
    }
    return count;
  }

  public String subSequence(int start, int end){
    if (start < 0 || end < 0 || start >= data.length || end > data.length || start >= end){
      throw new IndexOutOfBoundsException("Invalid start and/or end value: "+ start + " " + end);
    }
    String copy = "";
    for (int i = start; i < end; i++){
      copy += data[i];
    }
    return copy;
  }

  public String toString(){
    String ans = "";
    for (int i = 0; i < data.length; i++){
      ans += data[i];
    }
    return ans;
  }

  public int compareTo(CharSequence x){
    if ((x.toString()).equals(null)){
      throw new NullPointerException("You can't compare with null!");
    }
    for (int i = 0; i < data.length && i < x.length(); i++){
      String charac1 = "";
      charac1 += data[i];
      String charac2 = "";
      charac2 += x.charAt(i);
      if (charac1.compareTo(charac2) != 0){ //see if all char are same throughout before seeing their length
        return charac1.compareTo(charac2); //if spotted the first difference, end the method
      }
    }
    if (data.length > x.length()){
      return 1;
    }
    if (data.length < x.length()){
      return -1;
    }
    return 0; //at this point, there should be no difference b/w data and x. Both length and chars
  }


}
