# Longest Perfect Piece
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array <strong>arr[]</strong> of <strong>N</strong> Numbers. A Perfect Piece is defined </span><span style="font-size:18px">as </span><span style="font-size:18px">a </span><span style="font-size:18px">subarray</span><span style="font-size:18px"> such that the difference between the minimum and the maximum value in that range is<strong> </strong>at most 1. Find the Maximal Length Perfect Piece.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><strong><span style="font-size:18px">Input:</span></strong>
<span style="font-size:18px"><strong>N = </strong>4</span>
<span style="font-size:18px"><strong>arr[] = </strong>{8, 8, 8, 8}</span>
<span style="font-size:18px"><strong>Output:
</strong>4</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">The longest subarray is [1, 4]
where maximum=8 and minimum = 8 and
difference is 0, which is less than 1.
Its length is 4.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><strong><span style="font-size:18px">Input:</span></strong>
<span style="font-size:18px"><strong>N = </strong>11</span>
<span style="font-size:18px"><strong>arr[] = </strong>{5, 4, 5, 5, 6, 7, 8, 8, 8, 7, 6}</span>
<span style="font-size:18px"><strong>Output:
</strong>5</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">The longest subarray is [6, 10]
where maximum=8 and minimum = 7 and
difference is 1. Its length is 5.</span> </pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>longestPerfectPiece()</strong> which takes an Integer N and an array arr[] of length N as input and returns the maximal length Perfect Piece.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N*logN)<br>
<strong>Expected Auxiliary Space:</strong> O(N)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 &lt;= N &lt;= 10<sup>5</sup></span><br>
<span style="font-size:18px">1 &lt;= arr[i] &lt;= 10<sup>5</sup></span></p>
</div>