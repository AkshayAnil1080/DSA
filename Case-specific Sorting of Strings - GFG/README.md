# Case-specific Sorting of Strings
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a string <strong>S </strong>consisting of <strong>only</strong>&nbsp;<strong>uppercase </strong>and <strong>lowercase </strong>characters. The task is to <strong>sort </strong>uppercase and lowercase letters <strong>separately </strong>such that if the i<sub>th</sub> place in the original string had an Uppercase character then it should not have a lowercase character after being sorted and vice versa.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><strong><span style="font-size:18px">Input:
</span></strong><span style="font-size:18px">N = 12
S = defRTSersUXI
<strong>Output: </strong>deeIRSfrsTUX<strong>
Explanation: </strong>Sorted form of given string
with the same case of character as that
in original string is deeIRSfrsTUX</span>
</pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><strong><span style="font-size:18px">Input:
</span></strong><span style="font-size:18px">N = 6
S = srbDKi
<strong>Output: </strong>birDKs<strong>
Explanation: </strong>Sorted form of given string
with the same case of character will
result in output as birDKs.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You only need to complete the function <strong>caseSort </strong>that takes&nbsp;a string str and length of the string n and&nbsp;<strong>returns </strong>sorted <strong>string</strong>.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(Nlog(N)).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(N).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong> </span><br>
<span style="font-size:18px">1 ≤ N ≤ 10<sup>5</sup></span></p>
</div>