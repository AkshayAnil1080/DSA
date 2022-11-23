# Longest Bitonic subsequence
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array of positive integers. Find&nbsp;the maximum length of Bitonic subsequence.&nbsp;<br>
A subsequence of array&nbsp;is called Bitonic if it is first strictly increasing, then strictly decreasing.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>nums = [1, 2, 5, 3, 2]
<strong>Output: </strong>5
<strong>Explanation: </strong>The sequence {1, 2, 5} is
increasing and the sequence {3, 2} is 
decreasing so merging both we will get 
length 5.
</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>nums = [1, 11, 2, 10, 4, 5, 2, 1]
<strong>Output: </strong>6
<strong>Explanation: </strong>The bitonic sequence 
{1, 2, 10, 4, 2, 1} has length 6.
</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read or print anything. Your task is to complete the function&nbsp;<strong>LongestBitonicSequence()&nbsp;</strong>which takes the array nums[] as input parameter and returns the maximum length of bitonic subsequence.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(n<sup>2</sup>)<br>
<strong>Expected Space Complexity:&nbsp;</strong>O(n)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤&nbsp;length of array ≤ 1000<br>
1 ≤&nbsp;arr[i] ≤&nbsp;1000000</span></p>
</div>