# Decode the string
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">An encoded string (<strong>s</strong>) is given, the task is to decode it. The encoding pattern is that the occurance of the string is given at the starting of the string and each string is enclosed by square brackets.</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> s = 1[b]
<strong>Output:</strong> b
<strong>Explaination:</strong> 'b' is present only one time.</span></pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> s = 3[b2[ca]]
<strong>Output:</strong> bcacabcacabcaca
<strong>Explaination:</strong> 2[ca] means 'ca' is repeated 
twice which is 'caca' which concatenated with 
'b' becomes 'bcaca'. This string repeated 
thrice becomes the output.</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You do not need to read input or print annything. Your task is to complete the function <strong>decodedString()</strong> which takes s as input parameter and returns the decoded string.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(|s|)<br>
<strong>Expected Auxiliary Space:</strong> O(|s|)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ |s| ≤ 10<sup>3</sup>&nbsp;</span></p>
</div>