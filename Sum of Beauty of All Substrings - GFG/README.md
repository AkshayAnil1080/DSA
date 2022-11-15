# Sum of Beauty of All Substrings
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a&nbsp;string<strong> S</strong>, return the sum of <strong>beauty</strong> of all its substrings.<br>
The <strong>beauty</strong> of a string is defined as the difference in frequencies between the most frequent and least frequent characters.</span></p>

<ul>
	<li><span style="font-size:18px">For example, the beauty of string "aaac" is 3 - 1 = 2.</span></li>
</ul>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<div style="background: rgb(238, 238, 238); border: 1px solid rgb(204, 204, 204); padding: 5px 10px; --darkreader-inline-bgimage: initial; --darkreader-inline-bgcolor:#222426; --darkreader-inline-border-top:#3e4446; --darkreader-inline-border-right:#3e4446; --darkreader-inline-border-bottom:#3e4446; --darkreader-inline-border-left:#3e4446;"><span style="font-size:18px"><strong>Input:</strong><br>
S = "aaac"<br>
<strong>Output: </strong><br>
3<br>
<strong>Explanation:&nbsp;</strong>The substrings with non - zero&nbsp;beauty are ["aaac","aac"] where beauty of "aaac" is 2 and beauty of "aac" is 1.</span></div>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<div style="background: rgb(238, 238, 238); border: 1px solid rgb(204, 204, 204); padding: 5px 10px; --darkreader-inline-bgimage: initial; --darkreader-inline-bgcolor:#222426; --darkreader-inline-border-top:#3e4446; --darkreader-inline-border-right:#3e4446; --darkreader-inline-border-bottom:#3e4446; --darkreader-inline-border-left:#3e4446;"><span style="font-size:18px"><strong>Input:</strong><br>
S = "geeksforgeeks"<br>
<strong>Output: </strong><br>
62</span></div>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>beautySum()</strong> which takes&nbsp;string <strong>S</strong> as input paramters&nbsp;and returns the sum of <strong>beauty</strong> of all its substrings.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(|S|<sup>2</sup>)<br>
<strong>Expected Auxiliary Space: </strong>O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:&nbsp;</strong><br>
1 ≤ |S|&nbsp;≤ 500<br>
S only contains lower case alphabets.</span></p>
</div>