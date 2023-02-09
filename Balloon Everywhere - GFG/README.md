# Balloon Everywhere
## Easy
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Bob is very fond of balloons. Once he visited an amusement park with his mother. The mother told Bob that she would buy him a balloon only if he answer her problem right. She gave Bob a string<strong>&nbsp;S </strong>[contains only lowercase characters]&nbsp;and asked him to use the characters of string to form&nbsp;as many instances of the word "balloon" as possible. Return the <strong>maximum</strong> number of instances that can be formed.</span></p>

<p><span style="font-size:18px">Help Bob to solve the problem.</span></p>

<p><span style="font-size:18px"><strong>Note:</strong>&nbsp;You can use each character in the string&nbsp;<strong>at most once</strong>. </span></p>

<p><span style="font-size:18px"><strong>Example 1:</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>S: nlaebolko
<strong>Output: </strong>1
<strong>Explanation:</strong>
Here, the number of occurence of 'b' = 1
of occurence of 'a' = 1
of occurence of 'l' = 2
of occurence of 'o' = 2
of occurence of 'n' = 1
So, we can form 1 "balloon" using the letters.
 </span>
</pre>

<p><span style="font-size:18px"><strong>Example 2:&nbsp;</strong></span></p>

<pre><span style="font-size:18px"><strong>Input:
</strong>S: loonbalxballpoon
<strong>Output: </strong>2
<strong>Explanation:</strong>
Here, the number of occurence of 'b' = 2
of occurence of 'a' = 2
of occurence of 'l' = 4
of occurence of 'o' = 4
of occurence of 'n' = 2
So, we can form 2 "balloon" using the letters.</span>
</pre>

<p>&nbsp;</p>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
The task is to complete the function <strong>maxInstance</strong>() which takes a string as the only input parameter and should return the <strong>maximum</strong> instances that can be formed of the word "<strong>balloon</strong>" using the&nbsp;given string.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong>&nbsp;O(n), n is size of the given string.<br>
<strong>Expected Auxiliary Space:</strong>&nbsp;O(26).</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 &lt;= s.length &lt;= 10<sup>6</sup></span></p>
</div>