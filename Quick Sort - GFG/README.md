# Quick Sort
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Quick Sort is a Divide and Conquer algorithm. It picks an element as a pivot and partitions the given array around the picked pivot.<br>Given an array arr[], its starting position is low (the index of the array)&nbsp;and its ending position is high(the index of the array).</span></p>
<p><span style="font-size: 18px;"><strong>Note</strong>: The <strong>low</strong> and <strong>high</strong> are inclusive.</span></p>
<p><span style="font-size: 18px;">Implement the partition() and quickSort() functions to sort the array.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>
N = 5 
arr[] = { 4, 1, 3, 9, 7}
<strong>Output:</strong>
1 3 4 7 9</span></pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: </strong>
N = 9
arr[] = { 2, 1, 6, 10, 4, 1, 3, 9, 7}
<strong>Output:</strong>
1 1 2 3 4 6 7 9 10</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task:&nbsp;</strong><br>You don't need to read input or print anything. Your task is to complete the functions <strong>partition()&nbsp; </strong>and <strong>quickSort() </strong>which takes the array arr[], low and high as input parameters and partitions the array. Consider the last element as the pivot such that all the elements less than(or equal to) the pivot lie before it and the elements greater than it lie after the pivot.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(N*logN)<br><strong>Expected Auxiliary Space:</strong> O(logN)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= N &lt;= 10<sup>3</sup><br>1 &lt;= arr[i] &lt;= 10<sup>4</sup></span></p></div>