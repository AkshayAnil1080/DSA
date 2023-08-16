# Next Smallest Palindrome
## Hard
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a number, in the form of an array <strong>Num[]</strong>&nbsp;of size <strong>N</strong> containing digits from <strong>1 to 9</strong>(inclusive). The task is to find the <strong>next smallest palindrome strictly larger than the given&nbsp;number.</strong></span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>N = 11
Num[] = {9, 4, 1, 8, 7, 9, 7, 8, 3, 2, 2}
<strong>Output:</strong> 9 4 1 8 8 0 8 8 1 4 9
<strong>Explanation:</strong> Next smallest palindrome is
94188088149.
</span></pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>N = 5
Num[] = {2, 3, 5, 4, 5}
<strong>Output:</strong> 2 3 6 3 2
<strong>Explanation:</strong>&nbsp;Next smallest palindrome is
23632.
</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>Complete the function <strong>generateNextPalindrome()</strong>&nbsp;which takes an array <strong>num, </strong>and an single&nbsp;integer&nbsp;<strong>n</strong>,&nbsp;as input parameters&nbsp;and returns an array of integers denoting the answer.&nbsp;You don't to print answer or take inputs.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br><strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= N &lt;= 10<sup>5</sup><br>1 &lt;= Num[i] &lt;= 9</span></p></div>