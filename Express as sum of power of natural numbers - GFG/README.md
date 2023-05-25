# Express as sum of power of natural numbers
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given two numbers<strong>&nbsp;n</strong>&nbsp;and <strong>x</strong>, find out the total number of ways <strong>n</strong> can be expressed as the sum of<strong> the Xth</strong>&nbsp;power of <strong>unique natural numbers</strong>. As the total number of ways can be very large, so return the number of ways modulo 10<sup>9 </sup>+ 7.&nbsp;</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: <br>n = 10, x = 2
<strong>Output:</strong>&nbsp;<br>1&nbsp;
<strong>Explanation</strong>: <br></span><span style="font-size: 18px;">10 = 1<sup>2</sup> + 3<sup>2</sup>, Hence total 1 possibility.</span> 
</pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: <br></strong>n = 100, x = 2
<strong>Output:&nbsp;<br></strong>3
<strong>Explanation</strong>: <br>100 = 10<sup>2</sup> 
6<sup>2</sup> + 8<sup>2</sup> and 1<sup>2</sup> + 3<sup>2</sup> + 4<sup>2</sup> + 5<sup>2</sup> + 7<sup>2</sup> 
Hence total 3 possibilities.</span> 
</pre>
<p><span style="font-size: 18px;"><strong>Your Task:&nbsp;&nbsp;</strong><br>You don't need to read input or print anything. Complete the function <strong>numOfWays()&nbsp;</strong>which takes n and x as input parameters and returns the total number of ways n can be expressed as the sum of xth power of unique natural numbers.<br></span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(n<sup>2</sup>logn)<br><strong>Expected Auxiliary Space:</strong> O(n)<br></span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= n&nbsp;&lt;= 10<sup>3</sup><br>1 &lt;= x&nbsp;&lt;= 5</span></p></div>