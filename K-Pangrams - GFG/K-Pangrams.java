class Solution {
    boolean kPangram(String str, int k) {
        // code here
        int ch_cnt=0;
        int freq[] = new int[26];
        for( char ch : str.toCharArray()){
            if(ch==' ')
            continue;
            else{
                freq[ch-'a']++;
                ch_cnt++;
            }
        }
         int cnt=0; // ch not present
        for(int i=0; i<26; i++){
            if(freq[i]==0)
            cnt++;
        }
        return( ch_cnt>=26 && cnt<=k );
    }
}
