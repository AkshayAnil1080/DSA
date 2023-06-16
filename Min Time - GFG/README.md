# Min Time
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an array <strong>locations[]</strong>&nbsp;of size <strong>n</strong>&nbsp;where<strong> locations[i]</strong> represents the location of the <strong>i<sup>th</sup></strong> fruit on the <strong>x-axis</strong>&nbsp;and also&nbsp;given an array <strong>types[]</strong> &nbsp;where <strong>types[i]</strong> is an <strong>integer</strong> which represents the type of the <strong>i<sup>th</sup></strong> fruit. You are initially at coordinate<strong> 0</strong> and you have&nbsp;to collect <strong>all</strong> the fruits and then return back to coordinate <strong>0</strong> again. To move <strong>1</strong> unit on the x-axis requires <strong>1</strong> second of time. The only condition is that you have to collect the fruits in a <strong>non-decreasing&nbsp;order</strong> of their <strong>types[i]&nbsp;</strong>(for example if <strong>i<sup>th</sup></strong> fruit has type[i]=1 and<strong> j<sup>th</sup> </strong>fruit has type[j]=2 then <strong>i<sup>th</sup></strong> fruit has to be picked before <strong>j<sup>th</sup></strong> fruit). Find&nbsp;</span><strong style="font-size: 18px;">minimum time</strong><span style="font-size: 18px;">&nbsp;to collect all fruits in the non-decreasing</span><strong style="font-size: 18px;">&nbsp;order</strong><span style="font-size: 18px;">&nbsp;of their types and return back to coordinate&nbsp;</span><strong style="font-size: 18px;">0</strong><span style="font-size: 18px;">.</span></p>
<p><span style="font-size: 18px;"><strong>Note</strong>: You can assume it takes no time to pick up fruit and the location of a fruit can be <strong>negative</strong> also.</span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong>
n=4
locations={1,3,5,7}
types={1,2,3,1}</span>
<span style="font-size: 18px;"><strong>Output:<br></strong></span><span style="font-size: 18px;">18</span>
<span style="font-size: 18px;"><strong>Explanation:</strong>
You start at x=0 and move to x=7 and 
in the way pick fruits of type 1 at x=1 
and x=7 and it took total 7 seconds to 
move from 0-&gt;7 now you move to x=3 
in 4 seconds and than to x=5 in 2 seconds 
and than return back to x=0 in 5 seconds.
So overall it took 18 seconds(7+4+2+5).</span></pre>
<p><strong><span style="font-size: 18px;">Example 2:</span></strong></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong>
n=4
locations={-4,-3,1,-8}
types={4,2,4,5}</span>
<span style="font-size: 18px;"><strong>Output:<br></strong>24</span>
<span style="font-size: 18px;"><strong>Explanation:</strong>
The optimal way is to way go to x=-3 
in starting than 1 and follow path 
like this  (1)-&gt;(-4)-&gt;(-8)-&gt;(0) and 
total time it takes is 24 .</span></pre>
<p><span style="font-size: 18px;"><strong>Your Task</strong>:<br>You don't need to read input or print anything. Your task is to complete the function <strong>minTime() </strong>which takes an integer <strong>n</strong>, integer array<strong> locations</strong> and <strong>types</strong> and you have to return <strong>minimum time</strong> to collect all fruits.</span></p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong> O(n)<br><strong>Expected Space Complexity:</strong> O(n)</span></p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1&lt;=<strong>n</strong>&lt;=10<sup>5</sup><br>-10<sup>9</sup>&lt;=<strong>locations[i]</strong>&lt;=10<sup>9</sup><br>1&lt;=<strong>types[i]</strong>&lt;=10<sup>5</sup></span></p></div>