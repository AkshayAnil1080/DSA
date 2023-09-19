# Rotate Bits
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an integer <strong>N</strong> and an integer <strong>D</strong>, rotate the binary representation of the integer N by D<strong> </strong>digits to the <strong>left </strong>as well as <strong>right </strong>and return the results in their <strong>decimal&nbsp;representation </strong>after each of the rotation.<br><strong>Note</strong>: Integer N is stored using <strong>16 bits</strong>. i.e. 12 will be stored as 0000</span><span style="font-size: 18px;">0000</span><span style="font-size: 18px;">0000</span><span style="font-size: 18px;">1100.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong>
N = 28, D = 2
<strong>Output:
</strong>112
7
<strong>Explanation</strong>: <br>28 in Binary is: 0000000000011100
Rotating left by 2 positions, it becomes 0000000001110000 = 112 (in decimal).<br>Rotating right by 2 positions, it becomes 0000000000000111 = 7 (in decimal).</span>
</pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input</strong>: 
N = 29, D = 2
<strong>Output:</strong> 
116
16391
<strong>Explanation</strong>: <br>29 in Binary is: 0000000000011101
Rotating left by 2 positions, it becomes 0000000001110100 = 116 (in decimal).
Rotating right by 2 positions, it becomes 0000000010000111 = 16391 (in decimal).
</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>rotate()&nbsp;</strong>which takes the integer N and integer D as inputs and returns an array of size 2 where arr[0] = Decimal value after left rotation and arr[1] = Decimal value after right rotation.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity: </strong>O(1).<br><strong>Expected Auxiliary Space:&nbsp;</strong>O(1).</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 &lt;= N &lt;&nbsp; 2<sup>16</sup><br>1 &lt;= D &lt;= 10<sup>5</sup></span></p></div>