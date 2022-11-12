# Fill up buckets
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given <strong>n</strong>&nbsp;buckets and infinite number of balls. The maximum capacity of each bucket is given in an array <strong>capacity[]</strong>. Find the number of ways to fill the buckets with balls such that each bucket has <strong>atleast 1</strong> ball and all the buckets have <strong>distinct</strong> number of balls in them.<br>
<strong>Note:&nbsp;</strong>Since the answer may be very large, calculate the answer&nbsp;modulo <strong>10^9+7.</strong></span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: 
</strong>n = 1
capacity = [6]
<strong>Output: </strong>6
<strong>Explanation: </strong>Since there is only one 
bucket. It may hold any number of balls 
ranging from 1 to 6.
</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: 
</strong>n = 2 
capacity = [5, 8]
<strong>Output: </strong>35
<strong>Explanation: </strong>If the first bucket has 1
ball in it then the second bucket cant have 1 
ball, so the second bucket has 8-1 = 7 choices.
So the first bucket has 5 choices and for each
choice second bucket has 7 choices.
So total there are 35 ways.
</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anything. Your task is to complete the function&nbsp;<strong>totalWays()</strong>&nbsp;which takes <strong>n</strong> and <strong>capacity[]</strong>&nbsp;as input parameters and returns the <strong>number of&nbsp;possible ways</strong> to&nbsp;fill&nbsp;the&nbsp;buckets. Since the answer may be very large, calculate the answer&nbsp;modulo <strong>10^9+7.</strong></span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(n*log(n))&nbsp;<br>
<strong>Expected Space Complexity:&nbsp;</strong>O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= n&nbsp;&lt;= 100000<br>
1 &lt;= capacity[i] &lt;= 100000</span></p>
</div>