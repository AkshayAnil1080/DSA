# Find the closest pair from two arrays
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given two <strong>sorted </strong>arrays <strong>arr</strong> and <strong>brr</strong> and a number<strong> x</strong>, find the pair whose <strong>sum</strong> is closest to <strong>x</strong> and the pair has an element from<strong> each</strong> array. In the case of multiple closest pairs return any one of them.<br>Note: Can return the two numbers in any manner.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input :</strong> N = 4, M = 4<br>arr[ ] = {1, 4, 5, 7}
brr[ ] = {10, 20, 30, 40} 
X = 32
<strong>Output :</strong> <br>1, 30
<strong>Explanation:</strong>
The closest pair whose sum is closest
to 32 is {1, 30} = 31.
</span></pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input :</strong> N = 4, M = 4<br>arr[ ] = {1, 4, 5, 7}
brr[ ] = {10, 20, 30, 40}
X = 50 <strong>
Output :</strong> <br>7, 40 
<strong>Explanation:</strong> 
The closest pair whose sum is closest
to 50 is {7, 40} = 47.</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>You only need to complete the function <strong>printClosest()</strong> that takes an array <strong>(arr)</strong>, another array <strong>(brr)</strong>, size of array arr <strong>(N),&nbsp;</strong>size of array brr <strong>(M),</strong>&nbsp;and return the array of two integers whose sum is closest to <strong>X</strong>. The driver code takes care of the printing of the closest difference.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(N+M).<br><strong>Expected Auxiliary Space:</strong> O(1).</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ N, M ≤ 10<sup>5</sup><br>1 ≤ A[i], B[i] ≤ 10<sup>9</sup></span></p></div>