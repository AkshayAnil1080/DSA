# Phone directory
## Hard
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a list of contacts <strong>contact[]</strong>&nbsp;of length <strong>n</strong>&nbsp;where each contact is a string which exist in a phone directory and a query string <strong>s</strong>. The task is to implement a search query for the phone directory. Run a search query for each prefix <strong>p</strong> of the query string <strong>s&nbsp;</strong>(<em>i.e.</em> from&nbsp; index 1 to |s|) that prints all the distinct contacts which have the same prefix as p&nbsp;in <strong>lexicographical increasing&nbsp;order</strong>.&nbsp;Please refer the explanation part for better understanding.</span><br>
<span style="font-size:18px"><strong>Note: </strong>If there is no match between query and contacts, print "0".</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong> 
n = 3
contact[] = {"geeikistest", "geeksforgeeks", 
"geeksfortest"}
s = "geeips"
<strong>Output:</strong>
geeikistest geeksforgeeks geeksfortest
geeikistest geeksforgeeks geeksfortest
geeikistest geeksforgeeks geeksfortest
geeikistest
0
0
<strong>Explaination:</strong> By running the search query on 
contact list for "g" we get: "geeikistest", 
"geeksforgeeks" and "geeksfortest".
By running the search query on contact list 
for "ge" we get: "geeikistest" "geeksforgeeks"
and "geeksfortest".
By running the search query on contact list 
for "gee" we get: "geeikistest" "geeksforgeeks"
and "geeksfortest".
By running the search query on contact list 
for "geei" we get: "geeikistest".
No results found for "geeip", so print "0". 
No results found for "geeips", so print "0".</span></pre>

<p><span style="font-size:18px"><strong>Your Task:</strong><br>
Youd do not need to read input or print anything. Your task is to complete the function <strong>displayContacts()</strong> which takes <strong>n, contact[ ] </strong>and<strong> s</strong> as input parameters and returns a list of list of strings for required prefixes. If some prefix has no matching contact return&nbsp;"0" on that list.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:</strong> O(|s| * n * max|contact[i]|)<br>
<strong>Expected Auxiliary Space:</strong> O(n * max|contact[i]|)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ T&nbsp;≤ 100, T = number of test cases<br>
1 ≤&nbsp;n ≤&nbsp;50<br>
1 ≤ |contact[i]| ≤&nbsp;50<br>
1 ≤&nbsp;|s| ≤&nbsp;6&nbsp;</span></p>
</div>