# Array Removals
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an array <strong>arr[]</strong> of size <strong>N</strong> and an integer <strong>K</strong>. The task is to&nbsp;find the minimum number of elements that should be removed, such that <strong>A<sub>max</sub>-A<sub>min</sub>&lt;=K.</strong> After the removal of elements, A<sub>max</sub>&nbsp;and A<sub>min</sub>&nbsp;is considered among the remaining elements.&nbsp;</span></p>

<p><strong><span style="font-size:18px">Note:&nbsp;</span></strong><span style="font-size:18px">Can you solve the probelm without using any extra space and O(N*log(N)) time complexity?</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input: </strong>N = 9, K = 4<strong> </strong> 
arr[] = {1,3,4,9,10,11,12,17,20}
<strong>Output:</strong> 5
<strong>Explanation:</strong> Remove 1, 3, 4 from beginning
and 17, 20 from the end.</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input: </strong>N = 5, K = 2 
arr[] = {1, 5, 6, 2, 8} 
<strong>Output:</strong> 3
<strong>Explanation:</strong> There are multiple ways to
remove elements in this case.
One among them is to remove 5, 6, 8.
The other is to remove 1, 2, 5</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>removals()</strong>&nbsp;which takes the&nbsp;array of&nbsp;integers&nbsp;<strong>arr,</strong>&nbsp;<strong>n&nbsp;</strong>and<strong>&nbsp;k&nbsp;</strong>as parameters and returns an integer, denotes minimum number of elements should be remove to satisfy the condition.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N^2)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(N^2)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1&nbsp;≤ N ≤ 100</span><br>
<span style="font-size:18px">1 ≤ Arr[i], K ≤ 10</span><sup>6</sup></p>
</div>