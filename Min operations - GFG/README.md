# Min operations
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two numbers <strong>a</strong>&nbsp;and <strong>b</strong>. In one operation you can pick any non negative integer<strong> x </strong>and&nbsp;either of <strong>a</strong> or <strong>b</strong>. Now if you picked <strong>a</strong> then replace <strong>a</strong> with <strong>a&amp;x</strong> else if you picked <strong>b</strong> then replace <strong>b</strong> with <strong>b&amp;x</strong>.</span></p>

<p><span style="font-size:18px">Return the minimum number of operation required to make <strong>a</strong> and<strong> b</strong> equal.<br>
<br>
Note: Here <strong>&amp; </strong>represents bitwise <strong>AND</strong> operation.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>a = 5, b = 12
<strong>Output:</strong>
2
<strong>Explanantion:</strong>
In first operation replace 
a = a&amp;4 = 4
after that replace 
b = b&amp;6 = 4
Hence both are same after applying two
operations.
</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> 
a = 100, b = 100
<strong>Output:</strong> 
0
<strong>Explanation</strong>: 
Already same.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read, input, or print anything. Your task is to complete the function <strong><em>solve( )</em>,&nbsp;</strong>which takes two integers <strong>a</strong> and <strong>b&nbsp;</strong>as input parameters and returns the answer.</span></p>

<h2>Expected Time Complexity:&nbsp;O(1)<br>
Expected Auxiliary Space:&nbsp;O(1)</h2>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
0 ≤ a, b ≤ 10<sup>9</sup></span></p>
</div>