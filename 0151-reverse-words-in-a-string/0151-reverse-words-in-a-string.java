class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        StringBuilder ans=new StringBuilder();
        s=new StringBuilder(s).reverse().toString();
        for(int i=0;i<n;i++){
            StringBuilder word=new StringBuilder();
            while(i<n && s.charAt(i)!=' '){
                word.append(s.charAt(i));
                i++;
            }
            word.reverse();
            if(word.length()>0){
                ans.append(" ").append(word);
            }
        }
        return ans.substring(1);
    }
}