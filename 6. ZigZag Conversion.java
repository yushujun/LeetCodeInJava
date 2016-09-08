public static String convert(String s, int numRows) {
  if(s == null || s.isEmpty() || numRows <= 1) return s;
  String[] result = new String[numRows];
  Arrays.fill(result,"");
  int row = 0;
  for(int i = 0;i < s.length(); i++){
    result[row] += s.charAt(i);
    row = i/(numRows-1)%2 == 0 ? row+1 : row-1;
  }
  return String.join("",result);
}
time complexity:O(n)
space complexity:O(n)