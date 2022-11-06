# Floyd Warshall
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">The problem is to find the shortest distances between every pair of vertices in a given <strong>edge-weighted directed</strong>&nbsp;graph. The graph is represented as an adjacency matrix of size&nbsp;<strong>n*n</strong>. <strong>Matrix[i][j]</strong> denotes&nbsp;the weight of the edge from <strong>i to j.&nbsp;</strong>If&nbsp;<strong>Matrix[i][j]=-1,&nbsp;</strong>it means there is no&nbsp;edge from <strong>i to j.</strong><br>
<strong>Do it in-place.</strong></span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>matrix = {{0,25},{-1,0}}
<img alt="" src="https://media.geeksforgeeks.org/wp-content/uploads/20221106202714/WhatsAppImage20221106at82359PM.jpeg" style="height:125px; width:135px">
<strong>Output: </strong>{{0,25},{-1,0}}
<img alt="" src="https://media.geeksforgeeks.org/wp-content/uploads/20221106202714/WhatsAppImage20221106at82359PM.jpeg" style="height:125px; width:135px">
<strong>Explanation: </strong>The shortest distance between
every pair is already given(if it exists).</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>matrix = {{0,1,43},{1,0,6},{-1,-1,0}}
<img alt="" src="https://media.geeksforgeeks.org/wp-content/uploads/20221106203741/WhatsAppImage20221106at83711PM.jpeg" style="height:164px; width:176px">
<strong>Output: </strong>{{0,1,7},{1,0,6},{-1,-1,0}}
<img alt="" src="https://media.geeksforgeeks.org/wp-content/uploads/20221106204057/WhatsAppImage20221106at84031PM.jpeg" style="height:167px; width:177px">
<strong>Explanation: </strong>We can reach 2 from 0 as 0-&gt;1-&gt;2
and the cost will be 1+6=7 which is less than 
43.</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read, return or print anything. Your task is to complete the function&nbsp;<strong>shortest_distance()&nbsp;</strong>which takes the <strong>matrix</strong> as input parameter and <strong>modifies</strong> the distances <strong>for every pair in-place.</strong></span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(n<sup>3</sup>)<br>
<strong>Expected Space Complexity:&nbsp;</strong>O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= n &lt;= 100<br>
-1 &lt;= matrix[ i ][ j ] &lt;= 1000</span></p>
</div>