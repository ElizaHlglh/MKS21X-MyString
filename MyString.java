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
      return ' ';
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
    if (data.length > x.length()){
      return 1;
    }
    if (data.length < x.length()){
      return -1;
    }
    for (int i = 0; i < data.length && i < x.length(); i++){
      String charac1 = "";
      charac1 += data[i];
      String charac2 = "";
      charac2 += x.charAt(i);
      if (charac1.compareTo(charac2) > 0){
        return 1;
      }
      if (charac1.compareTo(charac2) < 0){
        return -1;
      }
    }
    return 0;
  }


}
