# Median of BST
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a Binary Search Tree of size N, find the Median of its Node values.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>&nbsp; &nbsp; &nbsp; &nbsp;6
&nbsp; &nbsp; &nbsp;/&nbsp; &nbsp;\
&nbsp; &nbsp;3&nbsp; &nbsp; &nbsp; 8&nbsp; &nbsp;
&nbsp;/&nbsp; \&nbsp; &nbsp; /&nbsp; \
1&nbsp; &nbsp; 4&nbsp; 7&nbsp;   9<strong>
Output: </strong>6
<strong>Explanation: </strong>Inorder of Given BST will be:
1, 3, 4, 6, 7, 8, 9. So, here median will 6.</span>
</pre>
<p><br><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>&nbsp; &nbsp; &nbsp; &nbsp;6
&nbsp; &nbsp; &nbsp;/&nbsp; &nbsp;\
&nbsp; &nbsp;3&nbsp; &nbsp; &nbsp; 8&nbsp; &nbsp;
&nbsp;/&nbsp; &nbsp;\&nbsp; &nbsp; /&nbsp; &nbsp;
1&nbsp; &nbsp; 4&nbsp;  7&nbsp; &nbsp;</span><span style="font-size: 18px;"><strong>
Output: </strong>5<strong>
Explanation:</strong>Inorder of Given BST will be:
1, 3, 4, 6, 7, 8. So, here median will
(4 + 6)/2 = 10/2 = 5.</span></pre>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>findMedian()</strong>&nbsp;which takes the root of the Binary Search Tree as input&nbsp;and returns the Median of Node values in the given BST.<br>Median of the BST is:</span></p>
<ul>
<li><span style="font-size: 18px;">If number&nbsp;of nodes are even: then median = (N/2 th node + (N/2)+1 th node)/2</span></li>
<li><span style="font-size: 18px;">If number&nbsp;of nodes are odd : then median = (N+1)/2th node.</span></li>
</ul>
<p><br><span style="font-size: 18px;"><strong>Expected Time Complexity:&nbsp;</strong>O(N).<br><strong>Expected Auxiliary Space:&nbsp;</strong>O(Height of the Tree).</span></p>
<p><br><span style="font-size: 18px;"><strong>Constraints:</strong><br>1&lt;=N&lt;=10000</span></p>
<p>&nbsp;</p></div>