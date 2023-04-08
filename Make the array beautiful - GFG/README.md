# Make the array beautiful
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array of positive and negative integers. You have to make the array beautiful. An array is beautiful if two adjacent integers, arr[i] and arr[i+1] have the same sign. And you can do the following&nbsp;operation any number of times until the array becomes beautiful.</span></p>

<ul>
	<li><span style="font-size:18px">If two adjacent integers have different signs, remove them.</span></li>
</ul>

<p><span style="font-size:18px">Return the beautiful array after performing the above operation.</span></p>

<p><span style="font-size:18px"><strong>Note:</strong> An empty array is also a beautiful array. There can be many adjacent integers with different signs. So remove adjacent integers with different signs from <strong>left to right</strong>.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>4 2 -2 1<strong>
Output: </strong>4 1
<strong>Explanation:</strong> As at indices 1 and 2 , 2 and -2 have
different sign, they are removed. And the  the final
array is: 4 1.</span>
</pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><strong><span style="font-size:18px">Input: </span></strong><span style="font-size:18px">2 -2 1 -1</span><strong><span style="font-size:18px">
Output: </span></strong><span style="font-size:18px">[]</span><strong><span style="font-size:18px">
Explanation: </span></strong><span style="font-size:18px">As at indices 0 and 1, 2 and -2 have
different sign, so they are removed. Now the array
is 1 -1.Now 1 and -1 are also removed as they have
different sign. So the final array is empty. </span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>makeBeautiful()&nbsp;</strong>which takes an array as an input parameter and returns an array.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N)<br>
<strong>Expected Space Complexity:</strong> O(N)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= size of the array&nbsp;&lt;= 10</span><sup><span style="font-size:18px">5</span></sup><br>
<span style="font-size:18px">-10<sup>5</sup> &lt;= arr[i] &lt;= 10</span><sup><span style="font-size:18px">5</span></sup><br>
&nbsp;</p>

<p>&nbsp;</p>
</div>