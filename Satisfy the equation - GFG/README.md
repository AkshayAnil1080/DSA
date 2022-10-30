# Satisfy the equation
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array <strong>A[ ]</strong> of <strong>N</strong> of&nbsp; integers, find the index of values that satisfy<strong> A + B = C + D</strong> where <strong>A,B,C</strong> &amp; <strong>D</strong> are integers values in the array.<br>
<strong>Note: </strong>As there may be multiple pairs satisfying the equation return lexicographically smallest order of&nbsp;&nbsp;A, B, C and D and return&nbsp;all as -1 if there are no pairs satisfying the equation.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>N = </strong>7</span>
<span style="font-size:18px"><strong>A[] = </strong>{3, 4, 7, 1, 2, 9, 8}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">0 2 3 5</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">A[0] + A[2] = 3+7 = 10
A[3] + A[5] = 1+9 = 10</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>N = </strong>4</span>
<span style="font-size:18px"><strong>A[] = </strong>{424, 12, 31, 7}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">-1 -1 -1 -1</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">There are no pairs satisfying the equation.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>satisfyEqn()</strong> which takes an Integer N and an array A[] of size N as input and returns a vector of 4 integers denoting A, B, C, and D respectively.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N<sup>2</sup>*logN<sup>2</sup>)<br>
<strong>Expected Auxiliary Space:</strong> O(N<sup>2</sup>)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 &lt;= N &lt;= 500<br>
1 &lt;= A[i] &lt;= 10<sup>5</sup></span></p>
</div>