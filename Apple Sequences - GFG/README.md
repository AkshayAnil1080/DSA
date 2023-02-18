# Apple Sequences
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">There is a string&nbsp;of size <strong>n</strong>&nbsp;containing only '<strong>A'</strong>&nbsp;and '<strong>O'</strong>. '<strong>A'</strong> stands for Apple, and '<strong>O'</strong> stands for Orange. We have&nbsp;<strong><em>m</em></strong>&nbsp;number of spells, each spell allows us to convert an orange into an apple. </span></p>

<p><span style="font-size:18px">Find the longest sequence of apples you can make, given a string and the value of <strong>m</strong>.</span></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
N = 5
M = 1
arr[] = 'AAOAO'
<strong>Output:</strong>&nbsp;4&nbsp;
<strong>Explanation</strong>: Changing the orange at 
3rd position into an apple gives 
us the maximum possible answer.
</span></pre>

<p><br>
<span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 5
M = 1
arr = 'AOOAO'
<strong>Output:&nbsp;</strong>2
<strong>Explanation</strong>: Changing any orange into 
an apple will give us a sequence 
of length 2.</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>appleSequence</strong><strong>()</strong>&nbsp;which takes the array in the form of a string, its size n,<strong>&nbsp;</strong>and an integer m<strong>&nbsp;</strong>as input parameters&nbsp;and returns the largest apple sequences after converting m oranges.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(n)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= m &lt;= n &lt;= 10<sup>6</sup></span></p>
</div>