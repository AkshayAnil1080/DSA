# Bit Magic
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given an integer array <strong>arr[]</strong> of size <strong>n</strong> which contains only <strong>1</strong> and <strong>0.</strong> Your task is to make the array perfect. An array is said to be <strong>perfect</strong> if for each <strong>i</strong> from <strong>0</strong> to <strong>n-1</strong> <strong>arr[i]==arr[n-1-i]</strong> is satisfied.&nbsp;</span></p>

<p><span style="font-size:18px">To Make the array perfect you are allowed to do the following operation &nbsp;:</span></p>

<p><span style="font-size:18px">In one operation you can choose two different indexes&nbsp;<strong>i</strong> and <strong>j</strong> and set value of both <strong>arr[i]</strong> and <strong>arr[j] </strong>to <strong>arr[i]^arr[j]</strong>.</span></p>

<p><span style="font-size:18px">Your task is to make the array <strong>perfect</strong> in <strong>minimum possible number</strong> of operations and return the number of operations.</span></p>

<p><span style="font-size:18px"><strong>Note</strong>: <strong>0-based indexing is used</strong>.</span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
n<strong> = </strong>4
arr = {1,0,0,0}
<strong>Output:
</strong>1
<strong>Explanation:</strong>
We can take index 0 and 3 and apply the operation.
Array becomes {1,0,0,1}.Now the condition is satisfied </span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:</strong>
n = 3
arr = {1,0,1}
<strong>Output:</strong>
0
<strong>Explanation:</strong>
condition is satisfied intially. So no operation is required
in this case.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>bitMagic()</strong> which takes an integer <strong>n</strong> and <strong>a binary integers array arr</strong>&nbsp;respectively and returns&nbsp;the<strong> minimum</strong> number of operations required to make the array <strong>perfect.&nbsp;</strong></span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(N)<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(1)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= n<strong>&nbsp;</strong>&lt;= 10^5<br>
0 &lt;=&nbsp;arr[i]<strong>&nbsp;</strong>&lt;=1</span></p>
</div>