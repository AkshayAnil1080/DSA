# Count Cyclic Paths
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a&nbsp;<strong>triangular pyramid</strong>&nbsp;with its vertices marked as&nbsp;<strong>O, A, B and C</strong>&nbsp;and a number&nbsp;<strong>N</strong>, the task is to find the number of ways such that a person starting from the origin&nbsp;<strong>O</strong>&nbsp;initially, reaches back to the origin in <strong>N</strong> steps. In a single step, a person can go to any of its adjacent vertices.</span></p>

<p><img alt="Lightbox" src="https://media.geeksforgeeks.org/wp-content/uploads/20200520133822/pyramid1.jpg"></p>

<p><br>
<span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input</strong>:
N = 1
<strong>Output:</strong>&nbsp;0
<strong>Explanation</strong>: The minimum length of
a cyclic path is 2.
</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 2
<strong>Output:&nbsp;</strong>3
<strong>Explanation</strong>: The three paths are :
O-A-O, O-B-O, O-C-O</span></pre>

<p><br>
<span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>countPaths()</strong>&nbsp;which takes&nbsp;an integer N<strong>&nbsp;</strong>as input parameter&nbsp;and returns the number of possible paths. Since the answer may be big, return it&nbsp;modulo&nbsp;<strong>(10^9+7)</strong>.&nbsp;</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤&nbsp;N ≤ 10<sup>6</sup></span></p>
</div>