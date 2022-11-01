# Enemy
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">You live in Geek land. Geek land can be seen as a grid of shape <strong>N</strong> x&nbsp;<strong>M</strong>.Their&nbsp;are <strong>K</strong>&nbsp;enemy at <strong>K</strong>&nbsp;positions. Each enemy blocks the row and column to which it belongs. You have to find the largest continuous area that is not blocked.No two enemies share the same row or the same column.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 2
M = 2
K = 1
enemy[]={{2,2}}
<strong>Output:</strong>
1
<strong>Explanation:</strong>
Since only (1,1) cell is free from the enemy hence answer is 1.</span></pre>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 3
M = 3
K = 1
enemy[]={{3,3}}
<strong>Output:</strong>
4
<strong>Explanation:</strong>
The cells (1,1),(1,2) ,(2,1) and (2,2) are free hence answer =4.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>largestArea()</strong>&nbsp;which takes the size of geek land <strong>n,m</strong> and a 2-D matrix <strong>enemy </strong>of size <strong>k</strong> denoting the coordinates of the enemy's and need to return the largest area that is free.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(KlogK)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(K)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N,M &lt;= 10<sup>4</sup><br>
0&lt;=K&lt;=min(N,M)<br>
1&lt;=X<sub>i</sub>&lt;=N<br>
1&lt;=Y<sub>i</sub>&lt;=M</span></p>

<p>&nbsp;</p>
</div>