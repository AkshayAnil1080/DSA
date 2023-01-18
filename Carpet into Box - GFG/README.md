# Carpet into Box
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">There is a carpet&nbsp;of a size a*b [length * breadth]. You are given a box of size c*d.&nbsp;The task is, one has to fit the carpet in the box in a minimum number of moves.&nbsp;</span></p>

<p><span style="font-size:18px"><strong>In one move, you can either decrease the length or the breath of the carpet by half (floor value of its half).</strong></span></p>

<p><span style="font-size:18px">Note:&nbsp;One can even turn the carpet by 90 degrees any number of times, wont be counted as a move.</span></p>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
A = 8, B = 13
C = 6, D = 10</span>
<span style="font-size:18px"><strong>Output:</strong>
Minimum number of moves: 1
<strong>Explanation:</strong>
Fold the carpet by breadth, 13/2 i.e. 6, 
so now carpet is 6*8 and can fit fine.</span>
</pre>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>A = 4, B = 8
C = 3, D = 10</span>
<span style="font-size:18px"><strong>Output:
</strong>Minimum number of moves: 1
<strong>Explanation:</strong> Fold the carpet by length , 4/2 i.e. 2,
so now carpet is 2*8 and can fit fine.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong></span><br>
<span style="font-size:18px">You don't need to read input or print anything.&nbsp;You only need to complete the function<strong> carpetBox()&nbsp;</strong>that takes an integer A, B, C and D&nbsp;as input and returns an integer&nbsp;denoting the minimum numbers of moves required to fit the carpet into the box.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O( max( log(a), log(b) ) ) .<br>
<strong>Expected Auxiliary Space:&nbsp;</strong>O(1) .</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constrains:</strong><br>
1&lt;= A,B,C,D &lt;= 10<sup>9</sup></span></p>
</div>