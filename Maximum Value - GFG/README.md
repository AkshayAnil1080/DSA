# Maximum Value
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a binary tree, find the largest value in each level.</span></p>

<p><br>
<strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px">        1
       / \
      2   3 
<strong>Output:</strong></span>
<span style="font-size:18px">1 3</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">At 0 level, values of nodes are {1}
                 Maximum value is 1</span>
<span style="font-size:18px">At 1 level, values of nodes are {2,3}
                Maximum value is 3</span>
</pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px">        4
       / \
      9   2
     / \   \
    3   5   7 </span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">4 9 7</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">At 0 level, values of nodes are {4}
                 Maximum value is 4</span>
<span style="font-size:18px">At 1 level, values of nodes are {9,2}
                 Maximum value is 9</span>
<span style="font-size:18px">At 2 level, values of nodes are {3,5,7}
                 Maximum value is 7</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong></span></p>

<p><span style="font-size:18px">You don't need to read input or print anything.Your task is to complete the function&nbsp;<strong>maximumValue</strong>() that&nbsp;takes root node&nbsp;as input parameter and returns a list of integers containing the&nbsp;maximum value at each level. The size of the resultant list should be equal to the height of the binary tree and result[i] should store the maximum value at level i.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N), where N is the number of nodes.<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(H), where H is the height of binary tree.</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ Number of nodes ≤ 10^4<br>
1 ≤ Data of a node ≤ 10^5</span></p>
</div>