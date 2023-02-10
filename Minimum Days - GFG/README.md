# Minimum Days
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a string S of length N containing only lowercase alphabets. You are also given a permutation P of length N containing integers from 0 to N-1. In (i+1)'th day you can take the P[i] value of the permutation array and replace S[P[i]] with a '?'.</span></p>

<p><span style="font-size:18px">For example in day 1, we can choose index of permutation array is i=0 and replace S[P[0]] with '?'.<br>
Similarly in day 2, we can choose index of permutation array is i=1. You can replace S[P[1]] with '?'.<br>
Similarly in day 3,we can choose index of permutation array is i=2. You can replace S[P[2]] with '?'.</span></p>

<p><span style="font-size:18px">You have to tell the minimum number of days required, such that after it for all index&nbsp;i (0&lt;=i&lt;N-1), if S[i]!='?', then S[i]!=S[i+1].</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 4
S = "aabb"
P[] = {2, 1, 3, 0}
<strong>Output:</strong> 2
<strong>Explanation:</strong> In day 1, we replace S[P[0]] with '?'. 
After that String S = "aa?b". As we can see S 
still has character 'a' at index 0 and 1.
In day 2, we replace S[P[1]] with '?'. After 
that String S = "a??b". As we can see the String 
has for all index i (0&lt;=i&lt;N-1), if S[i]!='?', then S[i]!=S[i+1].</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 4
S = "abca"
P[] = {3, 0, 2, 1}
<strong>Output:</strong> 0
<strong>Explanation:</strong> We can see that the initial string 
S = "abca" has for all index i (0&lt;=i&lt;N-1), if S[i]!='?', then S[i]!=S[i+1].</span></pre>

<p><strong><span style="font-size:18px">Your Task:&nbsp;</span></strong><br>
<span style="font-size:18px">You don't need to read input or print anything. Your task is to complete the function getMinimumDays() which takes the string S, array P[] and its size N as input parameters and returns the minimum number of days required such that string satisfies with the condition given earlier.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(n).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1).</span></p>

<p><strong><span style="font-size:18px">Constraints:</span></strong></p>

<p><span style="font-size:18px">1 &lt;= N &lt;= 10<sup>5</sup><br>
0 &lt;= P[i] &lt;= N-1<br>
S contains only lowercase alphabets.</span></p>
</div>