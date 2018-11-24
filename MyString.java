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
    return data[index];
  }


  public int length(){
    int count = 0;
    for (int i = 0; i < data.length; i++){
      count+= 1;
    }
    return count;
  }

  public CharSequence subSequence(int start, int end){
    String copy = "";
    for (int i = start; i < end; i++){
      copy += data[i];
    }
    return CharSequence(copy);
  }

  public Strng toString(){
    String ans = "";
    for (int i = 0; i < data.length; i++){
      ans+= data[i];
    }
    return ans;
  }


}
