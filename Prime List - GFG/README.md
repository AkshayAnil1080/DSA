# Prime List
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">You are given the head of a linked list. You have to replace all the values of the nodes with the nearest <strong>prime</strong> number. If more than one prime number exists at an equal distance, choose the <strong>smallest</strong> one.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
2 → 6 → 10
<strong>Output:</strong>
2 → 5 → 11
<strong>Explanation:</strong>
</span><span style="font-size:18px">The nearest prime of 2 is 2 itself.
The nearest primes of 6 are 5 and 7,
since 5 is smaller so, 5 will be chosen.
The nearest prime of 10 is 11.</span></pre>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
1 → 15 → 20
<strong>Output:</strong>
2 → 13 → 19
<strong>Explanation:</strong>
</span><span style="font-size:18px">The nearest prime of 1 is 2.
The nearest primes of 15 are 13 and 17,
since 13 is smaller so, 13 will be chosen.
The nearest prime of 20 is 19.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
The task is to complete the function&nbsp;<strong>primeList</strong>() which contains a reference to the head as the only argument. This function should return the head of the modified linked list.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(number of nodes * sqrt(value of node)).<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ Number of Nodes ≤ 10<sup>4</sup><br>
1 ≤ Value&nbsp;on Node ≤ 10<sup>4</sup></span></p>
</div>