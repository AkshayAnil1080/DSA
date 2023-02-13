# Walls Coloring
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">There is a row of&nbsp;<strong>N</strong>&nbsp;walls in Geeksland. The king of Geeksland ordered Alexa to color all the walls on the occasion of New Year. Alexa can color each wall with either pink, black, or yellow. The cost associated with coloring each wall with a particular color is represented by a 2D array <strong>colors</strong> of size <strong>N*3</strong>&nbsp;, where&nbsp;<strong>colors[i][0]</strong>,&nbsp;<strong>colors[i][1]</strong>, and&nbsp;<strong>colors[i][2]</strong>&nbsp;is the cost of painting ith wall with colors pink, black, and yellow respectively.</span></p>

<p><span style="font-size:18px">You need to find the minimum cost to color all the walls such that no two adjacent walls have the same color.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 3
colors[][] = {{14, 2, 11},
             {11, 14, 5},
             {14, 3, 10}}
<strong>Output:</strong>
10
<strong>Explanation:</strong>
Color wall 0 with black. Cost = 2. 
Color wall 1 with yellow. Cost = 5. 
Color wall 2 with black. Cost = 3.
Total Cost = 2 + 5 + 3 = 10</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
N = 2
colors[][] = {{1, 2, 3},
             {1, 4, 6}}
<strong>Output:</strong>
3
<strong>Explanation:</strong>
Color wall 0 with black. Cost = 2
Color wall 1 with pink. Cost = 1
Total Cost = 1 + 2 = 3</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong></span></p>

<p><span style="font-size:18px">Your task is to complete the function <strong>minCost()</strong> which takes the 2D integer array <strong>colors</strong>&nbsp;and an integer <strong>N</strong> as the input parameters&nbsp;and returns an integer, representing the minimum cost to color&nbsp;all the walls.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(N).<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(N).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span></p>

<ul>
	<li><span style="font-size:18px">1 &lt;= N &lt;= 10<sup>5</sup></span></li>
	<li><span style="font-size:18px">1 &lt;= colors[i][0], colors[i][1], colors[i][2] &lt;= 10<sup>4</sup></span></li>
</ul>

<p>&nbsp;</p>
</div>