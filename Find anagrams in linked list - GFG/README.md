# Find anagrams in linked list
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a linked list of characters and a string S.Return all the anagrams of the string present in the given linked list.In case of overlapping anagrams choose the first anagram from left.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input: </strong>a -&gt; b -&gt; c -&gt; a -&gt; d -&gt; b -&gt; c -&gt; a</span>
<span style="font-size:18px">S = bac<strong>
Output: </strong>[a -&gt; b -&gt; c, b -&gt; c -&gt; a]</span><span style="font-size:18px"><strong>
Explanation: </strong>In the given linked list,
there are three anagrams: 
1. <strong><span style="color:#ff0000">a -&gt; b -&gt; c</span></strong> -&gt; a -&gt; d -&gt; b -&gt; c -&gt; a
2. a -&gt; <strong><span style="color:#ff0000">b -&gt; c -&gt; a</span></strong> -&gt; d -&gt; b -&gt; c -&gt; a
3. a -&gt; b -&gt; c -&gt; a -&gt; d -&gt; <strong><span style="color:#ff0000">b -&gt; c -&gt; a
</span></strong><span style="color:#000000">But in 1 and 2, a -&gt; b -&gt; c and b -&gt; c-&gt; a
are ovelapping.So we take a -&gt; b -&gt; c as it
comes first from left.So the output is:
[a-&gt;b-&gt;c,b-&gt;c-&gt;a]</span></span></pre>

<p><strong><span style="font-size:18px"><span style="color:#000000">Example 2:</span></span></strong></p>

<pre><strong><span style="font-size:18px"><span style="color:#000000">Input: </span></span></strong><span style="font-size:18px"><span style="color:#000000">a -&gt; b -&gt; d -&gt; c -&gt; a</span></span><strong><span style="font-size:18px"><span style="color:#000000">
</span></span></strong><span style="font-size:18px"><span style="color:#000000">S = bac</span></span><strong><span style="font-size:18px"><span style="color:#000000">
Output: </span></span></strong><span style="font-size:18px"><span style="color:#000000">-1</span><strong> 
Explanation: </strong>There is no anagrams, so output is -1</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>findAnagrams()&nbsp;</strong>which takes head node of the linked list and a string S as input parameters and returns an array of linked list. If there is no anagram in the linked list,return -1.</span></p>

<p><br>
<span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N), where N is length of LinkedList<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p><br>
<span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= N&nbsp;&lt;= 10<sup>5</sup><br>
1 &lt;= |S|&nbsp;&lt;= 10<sup>5</sup></span></p>

<p>&nbsp;</p>
</div>