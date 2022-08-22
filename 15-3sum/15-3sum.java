// sort it
//2. itr i =0 i<n-2 , first ptr i , secont ptr i +1, third at last;
//3 consisering i at stagnant ptr, problem becomes find pair sum(0-nums[i]) in range  of sorted array(i+1 , n-1)
//4. while finding two pari sum, do not consider the same ele twice (as sol must not contain dup triplets) so skip the ele(use while loop and adj checking, as it sorted)
//finally apply find pair cases == if sum found - move from both dir, if curr_sum > target => high-- , else low++; -  u know this  -- std prob of finding pair sum in sorted array

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
         Arrays.sort(nums);
        List<List<Integer>> al = new LinkedList<>();
    
        for( int i =0; i<nums.length-2; i++)
        {
            if(i==0 || (i>0 && nums[i]!=nums[i-1])) // check if same ele not present else will add dup licate lists.
            {
                int low =i+1;
                int high = nums.length -1;
                int sum = 0-nums[i]; // sum to findfor pair
            
            
                while(low<high)
                {
                    if(nums[low] +  nums[high] == sum)
                    {
                        al.add(Arrays.asList(nums[i], nums[low], nums[high]));

                        while(low<high && nums[low]==nums[low+1] ) low++;
                        while(low<high && nums[high]== nums[high-1]) high--;
                        
                        low++; high--;

                    }

                   else if(nums[low] +  nums[high] > sum)
                       high--;

                    else low++;
                }
            }
        }
        return al;
    
    }
}

// 