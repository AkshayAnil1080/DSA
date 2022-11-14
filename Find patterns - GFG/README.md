# Find patterns
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given two&nbsp;strings S and&nbsp;W. Find the number of times W appears as a subsequence of&nbsp;string S where every character of string S can be included in forming at most one subsequence.</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1: </strong> </span></p>

<pre><span style="font-size:18px"><strong>Input:</strong> </span>
 <span style="font-size:18px">S = "abcdrtbwerrcokokokd" </span>
 <span style="font-size:18px">W = "bcd" </span>
<span style="font-size:18px"><strong>Output:</strong> </span>
 <span style="font-size:18px">2</span>
<span style="font-size:18px"><strong>Explanation:</strong> </span>
<span style="font-size:18px">The two subsequences of string W are</span>
<span style="font-size:18px">{ S<sub>1</sub></span><span style="font-size:18px"> , S<sub>2</sub></span><span style="font-size:18px"> , S<sub>3</sub></span><span style="font-size:18px"> } and { S<sub>6</sub></span><sub> </sub><span style="font-size:18px">, S<sub>11</sub></span><span style="font-size:18px"> , S</span><sub>18</sub><span style="font-size:18px"> }</span>
<span style="font-size:18px">(Assuming 0- based indexing).</span>
</pre>

<p>&nbsp;</p>

<p><strong><span style="font-size:18px">Example 2: </span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> </span>
<span style="font-size:18px">S = "ascfret" </span>
<span style="font-size:18px">W = "qwer" </span>
<span style="font-size:18px"><strong>Output:</strong> </span>
<span style="font-size:18px">0</span>
<strong><span style="font-size:18px">Explanation:</span></strong>
<span style="font-size:18px">No valid subsequences are possible.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:&nbsp;&nbsp;</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>numberOfSubsequences()</strong>&nbsp;which takes the string S and string W<strong>&nbsp;</strong>as input parameters&nbsp;and returns the number of subsequences of string W in string S.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N<sup>2</sup>)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N)</span><br>
&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&lt;=|S|&lt;=1000<br>
1&lt;=|W|&lt;=|S|</span></p>
</div>