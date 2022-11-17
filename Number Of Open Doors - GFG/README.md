# Number Of Open Doors
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px"><span style="font-family:arial,helvetica,sans-serif">Consider a long alley with a <strong>N</strong> number of doors on one side. All the doors are closed initially. You move to and fro in the alley changing the states of the doors as follows: you open a door that is already closed and you close a door that is already opened. You start at one end go on altering the state of the doors till you reach the other end and then you come back and start altering the states of the doors again.</span><br>
<span style="font-family:arial,helvetica,sans-serif">In the first go, you alter the states of doors numbered 1, 2, 3,  , n.</span><br>
<span style="font-family:arial,helvetica,sans-serif">In the second go, you alter the states of doors numbered 2, 4, 6</span><br>
<span style="font-family:arial,helvetica,sans-serif">In the third go, you alter the states of doors numbered 3, 6, 9 </span><br>
<span style="font-family:arial,helvetica,sans-serif">You continue this till the Nth go in which you alter the state of the door numbered N.</span><br>
<span style="font-family:arial,helvetica,sans-serif">You have to find the number of open doors at the end of the procedure.</span></span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
N =</strong> 2</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">1</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">Initially all doors are closed.
After 1st go, all doors will be opened.
After 2nd go second door will be closed.
So, Only 1st door will remain Open.</span></pre>

<p><span style="font-size:18px"><strong>Example 2:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
N =</strong> 4</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">2</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">Following the sequence 4 times, we can
see that only 1st and 4th doors will
remain open.</span></pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
You don't need to read input or print anything. Your task is to complete the function <strong>noOfOpenDoors()</strong> which takes an Integer N as input and returns the answer.</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(</span>√N<span style="font-size:18px">)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Constraints:</strong></span><br>
<span style="font-size:18px">1 &lt;= N &lt;= 10<sup>12</sup></span></p>
</div>