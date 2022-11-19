# Check if all levels of two trees are anagrams or not
## Hard
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two binary trees, the task is&nbsp;to check if each of their levels are anagrams of each other or not.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
<img alt="" src="https://media.geeksforgeeks.org/img-practice/abc-1649622345.gif" style="height:173px; width:366px">
<strong>Output: </strong>1
<strong>Explanation:</strong> 
<strong>Tree 1:</strong>
Level 0 : 1
Level 1 : 3, 2
Level 2 : 5, 4

<strong>Tree 2:</strong>
Level 0 : 1
Level 1 : 2, 3
Level 2 : 4, 5

As we can clearly see all the levels of above two binary trees 
are anagrams of each other, hence return true.
</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
<img alt="" src="https://media.geeksforgeeks.org/wp-content/uploads/20221119111710/WhatsAppImage20221119at111602AM.jpeg" style="height:253px; width:573px">
Output: 0</strong>
<strong>Explanation:</strong> 
<strong>Tree 1:
</strong>Level 0 : 1
Level 1 : 2, 3 
Level 2 : 5, 4 

<strong>Tree 2:</strong> 
Level 0 : 1 
Level 1 : 2, 4 
Level 2 : 5, 3 

As we can clearly see that level 1 and leve 2 are not anagrams of each other, hence return false.</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>areAnagrams</strong><strong>()</strong>&nbsp;which takes the root of two trees as input&nbsp;and returns an 1 if all the levels are anagrams, else returns 0&nbsp;as output.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(NlogN)<br>
<strong>Expected Auxiliary Space:</strong> O(N)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N &lt;= 10<sup>4</sup><br>
1 &lt;= tree.val &lt;= 10<sup>9</sup></span></p>
</div>