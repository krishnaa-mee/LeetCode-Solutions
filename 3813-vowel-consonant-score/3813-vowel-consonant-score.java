class Solution {
    public int vowelConsonantScore(String s) {
        int vow=0;
        int cons=0;

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vow++;
            }
            else if(ch>='a'&&ch<='z'){
                cons++;
            }
        }
        if(cons==0){
            return 0;
        }
        else{
            return vow/cons;
        }
    }
}