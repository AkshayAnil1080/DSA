# Heap Sort
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array of size N. The task is to sort the array elements by completing functions <strong>heapify</strong>() and <strong>buildHeap</strong>() which are used to implement Heap Sort.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>N = 5
arr[] = {4,1,3,9,7}
<strong>Output:</strong>
1 3 4 7 9<strong>
Explanation:
</strong>After sorting elements
using heap sort, elements will be
in order as 1,3,4,7,9.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
</strong>N = 10
arr[] = {10,9,8,7,6,5,4,3,2,1}
<strong>Output:</strong>
1 2 3 4 5 6 7 8 9 10<strong>
Explanation:
</strong>After sorting elements
using heap sort, elements will be
in order as 1, 2,3,4,5,6,7,8,9,10.</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task</strong> <strong>:</strong><br>You don't have to read input or print anything. Your task is to complete the functions&nbsp;<strong>heapify()</strong><em>,&nbsp;</em><strong>buildheap()</strong> and <strong>heapSort() </strong>where heapSort() and buildheap() takes the array and it's size as input and heapify() takes the array, it's size and an index i as input. Complete and use these functions to sort the array using heap sort algorithm.<br><strong>Note: </strong>You don't have to return the sorted list. You need to sort the array "arr" in place.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong>&nbsp;O(N * Log(N)).<br><strong>Expected Auxiliary Space:</strong> O(1).</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ N ≤ 10<sup>6</sup><br>1 ≤ arr[i] ≤ 10<sup>6</sup></span></p></div>