# Is it Fibonacci
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Geek just learned&nbsp;about Fibonacci numbers. </span></p>

<blockquote>
<p><span style="font-size:18px">The Fibonacci Sequence is the series of numbers:&nbsp;0, 1, 1, 2, 3, 5, 8, 13, ...</span><br>
<span style="font-size:18px">where the next number is found by adding up the two numbers before it.</span></p>
</blockquote>

<p><span style="font-size:18px">He defines a new series called&nbsp;Geeky numbers. Here the next number&nbsp;is the sum of the <strong>K</strong> preceding numbers.<br>
You are given an array of size K,&nbsp;<strong>GeekNum[ ],&nbsp;</strong>where the i<sup>th</sup>&nbsp;element of the array represents the i<sup>th</sup>&nbsp;Geeky&nbsp;number. Return its N<sup>th</sup>&nbsp;term.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
N = 6, K = 1
GeekNum[] = {4}
<strong>Output:</strong>&nbsp;
4
<strong>Explanation</strong>: 
Terms are 4, 4, 4, 4, 4, 4</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 5, K = 3
GeekNum[] = {0, 1, 2}
<strong>Output:&nbsp;
</strong>6
<strong>Explanation</strong>: 
Terms are 0, 1, 2, 3, 6.
So the 5th term is 6</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>solve( )</strong>&nbsp;which takes integer N, K, and an array GeekNum[] as input parameters&nbsp;and returns the Nth term of the Geeky series.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity: O(N)<br>
Expected Space Complexity: O(N)</strong></span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ K <u>&lt;</u>&nbsp;30<br>
1&nbsp;≤ N&nbsp;≤ 70<br>
K&nbsp;≤ N<br>
0&nbsp;<u>&lt;</u>&nbsp;GeekNum[ ] <u>&lt;</u>&nbsp;100</span></p>
</div>