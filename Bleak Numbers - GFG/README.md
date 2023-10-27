# Bleak Numbers
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an integer, check whether it is <strong>Bleak or not</strong>. </span></p>
<p><span style="font-size: 18px;">A number n is called Bleak if it <strong>cannot </strong>be represented as sum of a positive number x and set bit count in x, i.e., x + <a href="http://www.geeksforgeeks.org/count-set-bits-in-an-integer/">countSetBits(x)</a> is not equal to n for any non-negative number x.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: <br></strong>4
<strong>Output: <br></strong>1
<strong>Explanation: <br></strong>There is no x such that x + countSetbit(x) = 4</span>
</pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong>&nbsp;<br>3
<strong>Output: <br></strong>0
<strong>Explanation:</strong>&nbsp;<br>3 is a Bleak number as 2 + countSetBit(2) = 3.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>You don't need to read or print anything. Your task is to complete the function&nbsp;<strong>is_bleak()</strong>&nbsp;which takes n as input parameter and returns 1 if&nbsp;n is <strong>not </strong>a Bleak number otherwise returns 0.</span><br><span style="font-size: 18px;"><strong><br>Expected Time Complexity: </strong>O(log(n) * log(n))<br><strong>Expected Space Complexity: </strong>O(1)</span><br>&nbsp;<br><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= n &lt;= 10<sup>9</sup></span></p></div>