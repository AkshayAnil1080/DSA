# Given a linked list of 0s, 1s and 2s, sort it.
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a linked list of <strong>N</strong>&nbsp;nodes where nodes can contain values&nbsp;<strong>0s</strong>, <strong>1s,</strong> and <strong>2s&nbsp;</strong>only. The task is to segregate <strong>0s</strong>, <strong>1s,</strong> and <strong>2s</strong>&nbsp;linked list such that all zeros segregate to head side, 2s at the end of the linked list, and 1s in the mid of 0s and 2s.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>N = 8
value[] = {1,2,2,1,2,0,2,2}
<strong>Output: </strong>0 1 1 2 2 2 2 2<strong>
Explanation: </strong>All the 0s are segregated
to the left end of the linked list,
2s to the right end of the list, and
1s in between.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>N = 4
value[] = {2,2,0,1}
<strong>Output: </strong>0 1 2 2<strong>
Explanation: </strong>After arranging all the
0s,1s and 2s in the given format,
the output will be 0 1 2 2.</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>The task is to complete the function <strong>segregate</strong>() which segregates the nodes in the linked list as asked in the problem statement and returns the head of the modified linked list. The <strong>printing </strong>is done <strong>automatically </strong>by the <strong>driver code</strong>.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:&nbsp;</strong>O(N).<br><strong>Expected Auxiliary Space:&nbsp;</strong>O(N).</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= N &lt;= 10<sup>6</sup></span></p></div>