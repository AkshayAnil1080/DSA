# Median in a row-wise sorted Matrix
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a row wise sorted matrix of size <strong>R*C</strong>&nbsp;where R&nbsp;and C&nbsp;are always <strong>odd</strong>,&nbsp;find the median of the matrix.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
R = 3, C = 3
M = [[1, 3, 5], 
&nbsp;    [2, 6, 9], 
&nbsp;    [3, 6, 9]]
<strong>Output:</strong>&nbsp;5
<strong>Explanation</strong>: Sorting matrix elements gives 
us {1,2,3,3,5,6,6,9,9}. Hence, 5 is median. 
</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
R = 3, C = 1
M = [[1], [2], [3]]
<strong>Output: </strong>2
<strong>Explanation</strong>: Sorting matrix elements gives 
us {1,2,3}. Hence, 2 is median.</span>
</pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>median()</strong>&nbsp;which takes the integers&nbsp;<strong>R</strong> and <strong>C</strong>&nbsp;along with the&nbsp;2D&nbsp;<strong>matrix</strong>&nbsp;as input parameters and returns the <strong>median</strong> of the matrix.<br>
<br>
<strong>Expected Time Complexity:</strong> O(32 * R&nbsp;* log(C))</span><br>
<span style="font-size:18px"><strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= R, C&nbsp;&lt;= 150<br>
1 &lt;= matrix[i][j] &lt;= 2000</span></p>
</div>