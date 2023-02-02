# Coordinates of the last cell in a Matrix on which performing given operations exits from the Matrix
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a binary matrix&nbsp;of dimensions&nbsp;<strong>N * M.&nbsp;</strong>One can perform the given operation into the matrix.</span></p>

<ul>
	<li><span style="font-size:18px">If the value of&nbsp;<strong>matrix[i][j]</strong>&nbsp;is&nbsp;<strong>0</strong>, then traverse in the same direction and check the next value.</span></li>
	<li><span style="font-size:18px">If the value of&nbsp;<strong>matrix[i][j]</strong>&nbsp;is&nbsp;<strong>1</strong>, then update&nbsp;<strong>matrix[i][j]</strong>&nbsp;to&nbsp;<strong>0</strong>&nbsp;and change the current direction from&nbsp;<strong>up</strong>,&nbsp;<strong>right</strong>,&nbsp;<strong>down</strong>, or&nbsp;<strong>left</strong>&nbsp;to the directions&nbsp;<strong>right</strong>,&nbsp;<strong>down</strong>,&nbsp;<strong>left</strong>, and&nbsp;<strong>up</strong>&nbsp;respectively.</span></li>
</ul>

<p><span style="font-size:18px">Initially you start from <strong>cell(0, 0)</strong>, moving in <strong>right</strong> direction.</span></p>

<p><span style="font-size:18px">The task is to find the indices of the matrix </span>&nbsp;<span style="font-size:18px">which&nbsp;</span><span style="font-size:18px">leads to outside the matrix from</span><span style="font-size:18px">&nbsp;the traversal of the given matrix&nbsp;from the cell&nbsp;<strong>(0, 0)</strong> by performing the operations.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
matrix[][] = {{0,1},
              {1,0}}</span>

<span style="font-size:18px"><strong>Output:</strong> (1,1)
<strong>Explanation:</strong>
<img alt="" src="https://media.geeksforgeeks.org/img-practice/endpoint1-1622886995.jpg" style="height:178px; width:300px">
<img alt="" src="https://media.geeksforgeeks.org/img-practice/endpoint2-1622887085.jpg" style="height:178px; width:500px">
<img alt="" src="https://media.geeksforgeeks.org/img-practice/endpoint3-1622887174.jpg" style="height:250px; width:500px"></span>

</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> 
matrix[][] = {{0, 1, 1, 1, 0},</span>
                   <span style="font-size:18px">{1, 0, 1, 0, 1},
              {1, 1, 1, 0, 0}}</span>

<span style="font-size:18px"><strong>Output:</strong> (2,0)
<strong>Explanation: </strong>We will leave the grid after visiting the index (2,0).</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Complete the function <strong>endPoints()</strong>&nbsp;that take the matrix as input parameter and output the last cell before the pointer gets outside of the matrix.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N)<br>
<strong>Expected Space Complexity:</strong> O(1)</span></p>

<p><span style="font-size:18px"><strong>Constrains:</strong><br>
1&lt;= N, M &lt;=1000<br>
0&lt;= matrix[i][j] &lt;=1</span></p>

<p>&nbsp;</p>

<p>&nbsp;</p>
</div>