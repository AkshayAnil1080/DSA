# Count of Subarrays
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array of <strong>N</strong> positive integers&nbsp; <strong>Arr<sub>1</sub>, Arr<sub>2</sub> ............ Arr<sub>n</sub></strong>. The value of each contiguous subarray of given array is the <strong>maximum element present in that subarray</strong>. The task is to return the number of subarrays having value strictly greater than <strong>K</strong>.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 3, K = 2
Arr[] = {3, 2, 1}
<strong>Output:</strong> 3
<strong>Explanation:</strong> The subarrays having value
strictly greater than K are: [3], [3, 2]
and [3, 2, 1]. Thus there are 3 such
subarrays.
</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>N = 4, K = 1
Arr[] = {1, 2, 3, 4}
<strong>Output:</strong> 9
<strong>Explanation:</strong>&nbsp;There are 9 subarrays having
value strictly greater than K.
</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
Complete the function <strong>countSubarray()</strong>&nbsp;which takes an array <strong>arr,</strong> two integers <strong>n, k,</strong>&nbsp;as input parameters&nbsp;and returns an integer&nbsp;denoting the answer.&nbsp;You don't to print answer or take inputs.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)<br>
<br>
<strong>Constraints:</strong><br>
1 &lt;= N &lt;= 10<sup>5</sup><br>
1 &lt;= Arr[i] &lt;= 10<sup>5</sup></span></p>
</div>