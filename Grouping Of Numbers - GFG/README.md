# Grouping Of Numbers
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">One day Jim came across array <strong>arr[]</strong> of <strong>N</strong> numbers. He decided to divide these <strong>N</strong> numbers into different groups. Each group contains numbers in which sum of any two numbers should <strong>not be divisible</strong> by an integer <strong>K</strong>. Print the size of the group containing <strong>maximum</strong> numbers.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>N = </strong>4, <strong>K = </strong>8</span>
<span style="font-size:18px"><strong>arr[] = </strong>{1, 7, 2, 6}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">2</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">The  group of numbers which can be formed
are: (1),(2),(7),(6),(1,2),(1,6),(7,2),(7,6).
So,the maximum possible size of the group is 2.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px"><strong>N = </strong>2, <strong>K = </strong>3</span>
<span style="font-size:18px"><strong>arr[] = </strong>{1, 2}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">1</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">The  group of numbers which can be formed
are: (1),(2). So,the maximum possible size
of the group is 1.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>maxGroupSize()</strong> which takes 2 Integers N, and K and also an array arr[] of N integers as input and returns the maximum group size possible.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(N)<br>
<strong>Expected Auxiliary Space:</strong> O(K)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 ≤ N,K,arr[i] ≤ 10<sup>5</sup></span></p>
</div>