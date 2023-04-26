# Seating Arrangement
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">You are given an integer <strong>n</strong>, denoting the number of people who needs to be seated, and a list of <strong>m</strong> integers&nbsp;<strong>seats</strong>, where <strong>0</strong> represents a vacant seat and <strong>1</strong> represents an already occupied seat.</span></p>

<p><span style="font-size:18px">Find whether all <strong>n</strong> people can find a seat, provided that no two people can sit next to each other.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px">n = 2
m = 7</span>
<span style="font-size:18px">seats[] = {0, 0, 1, 0, 0, 0, 1}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">Yes</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">The two people can sit at index 0 and 4.</span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px">n = 1
m = 3</span>
<span style="font-size:18px">seats[] = {0, 1, 0}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">No</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">There is no way to get a seat for one person.</span>
</pre>

<p><strong><span style="font-size:18px">Your Task:</span></strong></p>

<p><span style="font-size:18px">You don't have to input or print anything. Complete the function&nbsp;<strong>is_possible_to_get_seats()&nbsp;</strong>which takes the input parameters and return a boolean value, indicating whether all people can find a seat.</span></p>

<p><strong><span style="font-size:18px">Expected Time Complexity: O(m)<br>
Expected Space Complexity: O(1)</span></strong></p>

<p><strong><span style="font-size:18px">Constraints:</span></strong></p>

<ul>
	<li><span style="font-size:18px">0 &lt;= n &lt;= 10<sup>5</sup></span></li>
	<li><span style="font-size:18px">1 &lt;= m&nbsp;&lt;= 10<sup>5</sup></span></li>
	<li><span style="font-size:18px">seats[i] == 0 or seats[i] == 1</span></li>
</ul>
</div>