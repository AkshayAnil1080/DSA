# Move all zeroes to end of array
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array <strong>arr[]</strong> of <strong>n</strong> positive integers. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements. Do the mentioned change in the array in-place.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>N = 5
Arr[] = {3, 5, 0, 0, 4}
<strong>Output:</strong> 3 5 4 0 0
<strong>Explanation:</strong> The non-zero elements
preserve their order while the 0
elements are moved to the right.
</span></pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>N = 4
Arr[] = {0, 0, 0, 4}
<strong>Output:</strong> 4 0 0 0
<strong>Explanation:</strong>&nbsp;4 is the only non-zero
element and it gets moved to the left.
</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>You don't need to read input or print anything. Complete the function <strong>pushZerosToEnd()</strong>&nbsp;which takes the&nbsp;array <strong>arr[] </strong>and its size&nbsp;<strong>n</strong>&nbsp;as input parameters&nbsp;and modifies arr[] in-place such that all the zeroes are moved to the&nbsp;right.&nbsp;&nbsp;</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(n)<br><strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ N&nbsp;≤ 10<sup>5</sup><br>0 ≤ arr<sub>i</sub> ≤ 10<sup>5</sup></span></p></div>