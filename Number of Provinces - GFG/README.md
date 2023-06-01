# Number of Provinces
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an <strong>undirected</strong></span><span style="font-size: 18px;">&nbsp;graph with <strong>V</strong> vertices. We say two vertices u and v belong to a single province if there is a path from u to v or v to u. Your task is to find the number of provinces.</span><br><br><span style="font-size: 18px;"><strong>Note: </strong></span> <span style="font-size: 18px;">A province is a group of <strong>directly </strong>or <strong>indirectly connected</strong> cities and no other cities outside of the group. </span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
[
 [1, 0, 1],
 [0, 1, 0],
&nbsp;[1, 0, 1]
]
</strong></span><img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/706298/Web/Other/763b704c-74af-4d7c-8457-a1b8fe00a077_1685087210.png" alt=""><span style="font-size: 18px;">
<strong>Output:
</strong>2
<strong>Explanation:</strong>
The graph clearly has 2 Provinces [1,3] and [2]. As city 1 and city 3 has a path between them they belong to a single province. City 2 has no path to city 1 or city 3 hence it belongs to another province.</span>
</pre>
<div><span style="font-size: 18px;"><strong>Example 2:</strong></span></div>
<pre><span style="font-size: 18px;"><strong>Input:
[
&nbsp;[1, 1],
&nbsp;[1, 1]
]
</strong></span><img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/706298/Web/Other/f1fc32d4-70bb-429d-be95-a1485e4ae057_1685087210.png" alt=""><span style="font-size: 18px;">
<strong>Output :</strong>
1</span>
</pre>
<p><br><span style="font-size: 18px;"><strong>Your Task:&nbsp;&nbsp;</strong><br>You don't need to read input or print anything. Your task is to complete the function <strong>numProvinces()</strong>&nbsp;which takes an integer V and an adjacency matrix adj as input and returns the number of provinces. adj[i][j] = 1, if nodes i and j are connected and adj[i][j] = 0, if not connected.</span></p>
<p><br><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(V<sup>2</sup>)<br><strong>Expected Auxiliary Space:</strong> O(V)</span></p>
<p><br><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ V ≤ 500</span></p></div>