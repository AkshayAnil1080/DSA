# Duplicate subtree in Binary Tree
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a binary tree, find out whether it&nbsp;contains a duplicate sub-tree of size two&nbsp;or more, or not.</span></p>
<p><span style="font-size: 18px;"><strong>Note:</strong> Two same leaf nodes are not considered as subtree as size of a leaf node is one.&nbsp;</span><br><br><span style="font-size: 18px;"><strong>Example 1 :</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input : </strong>
               1
             /   \ 
           2       3
         /   \       \    
        4     5       2     
                     /  \    
                    4    5
<strong>Output :</strong> 1
<strong>Explanation : </strong>
    2     
  /   \    
 4     5
is the duplicate sub-tree.</span></pre>
<p><strong><span style="font-size: 18px;">Example 2 :</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input : </strong>
               1
             /   \ 
           2       3
<strong>Output: </strong>0
<strong>Explanation:</strong> There is no duplicate sub-tree 
in the given binary tree.</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task:&nbsp;&nbsp;</strong><br>You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>dupSub()</strong>&nbsp;which takes root of the tree as the only argument and returns 1 if the binary tree contains a duplicate sub-tree of size two&nbsp;or more, else 0.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> </span><span style="font-size: 18px;">O(N)<br></span><span style="font-size: 18px;"><strong>Expected Space Complexity:</strong> O(N)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>0 ≤ Number of nodes ≤ 9</span><br>&nbsp;</p></div>