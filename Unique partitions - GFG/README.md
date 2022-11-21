# Unique partitions
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a positive integer <strong>n</strong>, generate all possible unique ways to represent <strong>n</strong> as sum of positive integers.</span></p>

<p><span style="font-size:18px"><strong>Note:&nbsp;</strong>The generated output is&nbsp;printed without partitions.&nbsp;Each partition must be&nbsp;in decreasing order. Printing of all the partitions is done in reverse sorted order.&nbsp;</span><br>
<br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>n = 3
<strong>Output: </strong>3 2 1 1 1 1
<strong>Explanation: </strong>For n = 3, 
{3}, {2, 1} and {1, 1, 1}.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>n = 4 
<strong>Output: </strong>4 3 1 2 2 2 1 1 1 1 1 1
<strong>Explanation: </strong>For n = 4, 
{4}, {3, 1}, {2, 2}, {2, 1, 1}, {1, 1, 1, 1}.</span>
</pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anything. Your task is to complete the function&nbsp;<strong>UniquePartitions()&nbsp;</strong>which takes n as input parameter and returns a list of all possible combinations in lexicographically decreasing order.&nbsp;</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(2^n)<br>
<strong>Expected Space Complexity:&nbsp;</strong>O(n)</span><br>
<br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 &lt;= n &lt;= 25</span></p>
</div>