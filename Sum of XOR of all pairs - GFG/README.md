# Sum of XOR of all pairs
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 20px;">Given an array of <strong>N</strong> integers, find the <strong>sum of xor </strong>of all pairs of numbers in the array <strong>arr</strong>. In other words, select all possible pairs of <strong>i</strong> and <strong>j</strong> from <strong>0</strong> to <strong>N-1 (i&lt;j)</strong> and determine <strong>sum </strong>of all <strong>(arr<sub>i</sub> xor arr<sub>j</sub>)</strong>.</span></p>
<p><span style="font-size: 20px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 20px;"><strong>Input :</strong> arr[ ] = {7, 3, 5}
<strong>Output :</strong> 12
<strong>Explanation:</strong>
All possible pairs and there Xor
Value: ( 3 ^ 5 = 6 ) + (7 ^ 3 = 4)
 + ( 7 ^ 5 = 2 ) =  6 + 4 + 2 = 12
</span></pre>
<p><span style="font-size: 20px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 20px;"><strong>Input :</strong> arr[ ] = {5, 9, 7, 6} <strong>
Output :</strong>  47<br><strong>Explanation:<br></strong>All possible pairs and there Xor<br>Value: (5 ^ 9 = 12) + (5 ^ 7 = 2)<br> + (5 ^ 6 = 3) + (9 ^ 7 = 14)<br> + (9 ^ 6 = 15) + (7 ^ 6 = 1)<br> = 12 + 2 + 3 + 14 + 15 + 1 = 47</span></pre>
<p><span style="font-size: 20px;"><strong>Your Task:</strong><br>You do not have to take input or print output. You only need to complete the function <strong>sumXOR()</strong> that takes an array <strong>(arr)</strong>, sizeOfArray <strong>(n)</strong>, and <strong>return</strong>&nbsp;the <strong>sum of xor of all pairs </strong>of numbers in the array.</span></p>
<p><span style="font-size: 20px;"><strong>Expected Time Complexity:</strong> O(n).<br><strong>Expected Auxiliary Space:</strong>&nbsp;O(1).</span></p>
<p><span style="font-size: 20px;"><strong>Constraints</strong><br>2 ≤ n ≤ 10<sup>5</sup><br>1 ≤ arr[i] ≤ 10<sup>5 </sup></span></p></div>