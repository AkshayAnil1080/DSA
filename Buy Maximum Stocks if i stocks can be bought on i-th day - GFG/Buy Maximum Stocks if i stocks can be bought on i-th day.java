//cpp
class Pair {
public:
    int cost, quan;

    Pair(int cost, int quan) : cost(cost), quan(quan) {}

    bool operator<(const Pair& a) const {
        return cost < a.cost;
    }
};

class Solution {
public:
    int buyMaximumProducts(int n, int k, int price[]){
        vector<Pair> arr;

    for (int i = 0; i < n; i++)
        arr.push_back(Pair(price[i], i + 1));

    sort(arr.begin(), arr.end());

    int ans = 0;
    for (int i = 0; i < n; i++) {
        int units = min(arr[i].quan, k / arr[i].cost);
        ans += units;
        k -= arr[i].cost * units;
    }
    return ans;
    }
};

//java

class Pair implements Comparable<Pair>
{ 
    int cost, quan;
    
    Pair(int cost, int quan)
    {
        this.cost = cost;
        this.quan = quan;
    }
    
    public int compareTo(Pair a)  
    { return this.cost - a.cost; }
};

class Solution {
    public static int buyMaximumProducts(int n, int k, int[] price) {
        // code here
      ArrayList<Pair> arr = new ArrayList<>();
        
        for( int i =0; i<n; i++)
            arr.add(new Pair(price[i], i+1));
    
       Collections.sort(arr);
        
        int ans=0;
        for(int i =0; i<n ; i++){
             int units = Math.min(arr.get(i).quan, k / arr.get(i).cost);
            ans += units;
            k -= arr.get(i).cost * units;
        }
        return ans;
    }
}  
