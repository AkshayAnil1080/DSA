# Shreyansh and his bits
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Shreyansh has an integer N. He is really curious about the binary representation of integers. He sees that any given integer has a number of set bits. Now he wants to find out that how many positive integers, strictly less than N, have the <strong>same number of set bits as N</strong>.<br>
He is a little weak in maths. Help him find the number of integers.<br>
<strong>Note</strong> : Since N takes large values, brute force won't work.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
N = 8
<strong>Output:</strong>&nbsp;3
<strong>Explanation</strong>:
Binary representation of 8 : 1000
So the integers less than 8 with 
same number of set bits are : 4, 2, 1
</span><span style="font-size:18px">Hence, the result is 3.  
</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 4
<strong>Output:&nbsp;</strong>2
Explanation:
Binary representation of 4 : 100
So the integers less than 4 with 
same number of set bits are : 2, 1
So, The result is 2.
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>count()</strong>&nbsp;which takes the integer&nbsp;N<strong>&nbsp;</strong>as input parameters and returns the required answer.<br>
<br>
<strong>Expected Time Complexity:</strong> O(log(n))<br>
<strong>Expected Auxiliary Space:</strong> O(log(n)*log(n))</span><br>
&nbsp;</p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints :</strong>&nbsp;<br>
1 &lt;= N &lt;= 10^12</span></p>

<p>&nbsp;</p>
</div>