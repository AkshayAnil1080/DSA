Remove the balls
Difficulty: MediumAccuracy: 58.66%Submissions: 37K+Points: 4
You are given two arrays, color and radius, representing a sequence of balls:


color[i] is the color of the i-th ball.
radius[i] is the radius of the i-th ball.

If two consecutive balls have the same color and radius, remove them both. Repeat this process until no more such pairs exist.


Return the number of balls remaining after all possible removals.

Examples:

Input: color[] = [2, 3, 5], radius[] = [3, 3, 5]
Output: 3
Explanation: All the 3 balls have different colors and radius.
Input: color[] = [2, 2, 5], radius[] = [3, 3, 5]
Output: 1
Explanation: First ball and second ball have same color 2 and same radius 3. So, after removing only one ball is left. It cannot be removed from the array. Hence, the final array has length 1.
Constraints:
1 ≤ color.size() = radius.size() ≤ 105
1 ≤ color[i] ≤ 109
1 ≤ radius[i] ≤ 109                                                                                                                                           

Expected Complexities
Time Complexity: O(n)
Auxiliary Space: O(n)
Topic Tags
StackData Structures
Related Articles
Length Of Array After Removing Consecutive Balls
