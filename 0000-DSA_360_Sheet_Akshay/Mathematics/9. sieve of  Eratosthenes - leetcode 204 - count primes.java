full video explanation by me - watch here - https://youtu.be/I5aFenPv3oQ


class Solution {
    public int countPrimes(int N) {
        boolean v[]=new boolean[N];
        Arrays.fill(v,true);
        for(int i=2;i*i<N;i++){
            if(v[i]){
                for(int j=i*i;j<N;j+=i){
                    v[j]=false;
                }
            }
        }
        int ans=0;
        for(int i=2;i<N;i++){
            if(v[i]){
                ans++;
            }
        }
        return ans;
    }
}
