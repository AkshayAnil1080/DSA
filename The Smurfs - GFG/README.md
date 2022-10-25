# The Smurfs
## Medium
<div class="problems_problem_content__Xm_eO"><p dir="ltr"><span style="font-size:18px">A geek once visited a magical island where he found a special creature. He named it as&nbsp;Smurf. He noticed a very strange thing there. The&nbsp;smurfs&nbsp;resembled the primary colors of light. To make it more clear, the primary colors of light are <strong>Red</strong>(R), <strong>Green</strong>(G), and <strong>Blue</strong>(B). He talked to one of the&nbsp;smurfs. The&nbsp;smurfs&nbsp;came to know that he is a good programmer. The&nbsp;smurfs&nbsp;suggested a deal that they will ask him one question and if he is able to answer that question, they will allow the geek to take anything from the island.<br>
The question is as follows:<br>
The&nbsp;smurfs&nbsp;possess a very magical property. When two&nbsp;smurfs&nbsp;of different colors meet with other, they gets converted into a&nbsp;smurf&nbsp;of the third color. How many minimum number of&nbsp;smurfs&nbsp;will be remaining after this transformation? The question looked simple to geek. However, the&nbsp;smurfs&nbsp;put another constraint to make the geek think more. The two&nbsp;smurfs&nbsp;must be adjacent to each other &nbsp;to make the transformation take place. There are <strong>n</strong> smurfs the colors of which are given in an array <strong>a[]</strong>.</span></p>

<p dir="ltr"><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> n = 5
a = {'R' , 'G', 'B', 'R', 'B'}
<strong>Output:</strong> 1
<strong>Explaination:</strong> First 'R' and 'G' makes 'B'. 
Then 'B' and 'R' makes 'G' and that 'G' 
with 'B' at index 2 makes 'R', Now the 'R' 
and the last 'B' makes 'G'.</span></pre>

<p dir="ltr"><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> n = 2
a = {'R', 'R'}
<strong>Output:</strong> 2
<strong>Explaination:</strong> There are two 'R' s. So 
they cannot change to anything else.</span></pre>

<p dir="ltr"><span style="font-size:18px"><strong>Your Task:</strong><br>
You do not need to read input or print anything. Your task is to complete the function <strong>findMin()</strong> which takes n and a as input parameters and retunrs the minimum number of smurfs existing at the end.</span></p>

<p dir="ltr"><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(n)<br>
<strong>Expected Auxiliary Space:</strong> O(1)</span></p>

<p dir="ltr"><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ n ≤ 1000&nbsp;&nbsp;</span></p>
</div>