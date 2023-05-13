# Maximum subset sum
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array&nbsp;<strong>A</strong> of size&nbsp;<strong>N.&nbsp;</strong>Find the maximum subset-sum of elements that you can make from the given array such that for every <strong>two consecutive</strong> elements in the array, at least one of the elements is present in our subset.<strong>&nbsp;</strong></span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: 
</strong>N = 4
A[] = {1, -1, 3, 4}
<strong>Output: </strong>8
<strong>Explanation: </strong>
We can choose 0th,2nd &amp; 3rd index(0 based <br>Index),so that it can satisfy the <br>condition &amp; can make maximum sum 8. 
</span></pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: 
</strong>N = 3
A[] =  {0, 2, 0};
<strong>Output: </strong>2
<strong>Explanation: </strong>
We can choose 1st index. Here the <br>maximum possible sum is 2.</span></pre>
<p><span style="font-size: 18px;"><strong>Your task:</strong></span></p>
<p><span style="font-size: 18px;">You don't have to read input or print anything. Your task is to complete the function <strong>findMaxSubsetSum()</strong> which takes the array <strong>A</strong> and its size <strong>N</strong> as input and returns the Maximum possible subset-sum.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(N)</span><br><span style="font-size: 18px;"><strong>Expected Auxiliary Space:&nbsp;</strong>O(N)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>2 ≤ N ≤ 10<sup>5</sup><br>-10<sup>5&nbsp;</sup>≤ A[i] ≤ 10<sup>5</sup></span></p></div>