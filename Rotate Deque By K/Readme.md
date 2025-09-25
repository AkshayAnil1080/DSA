Rotate Deque By K
Difficulty: EasyAccuracy: 78.2%Submissions: 13K+Points: 2
You are given a deque dq[] (double-ended queue) containing non-negative integers, along with two positive integer type and k. The task is to rotate the deque circularly by k positions.
There are two types of rotation operations:


Right Rotation (Clockwise): If type = 1, rotate the deque to the right. This means moving the last element to the front, and repeating the process k times.

Left Rotation (Anti-Clockwise): If type = 2, rotate the deque to the left. This means moving the first element to the back, and repeating the process k times.

Examples:

Input: dq = [1, 2, 3, 4, 5, 6], type = 1, k = 2
Output: [5, 6, 1, 2, 3, 4] 
Explanation: The type is 1 and k is 2. So, we need to right rotate dequeue by 2 times.
In first right rotation we get [6, 1, 2, 3, 4, 5].
In second right rotation we get [5, 6, 1, 2, 3, 4].
Input: dq = [10, 20, 30, 40, 50], type = 2, k = 3 
Output: [40, 50, 10, 20, 30] 
Explanation: The type is 2 and k is 3. So, we need to left rotate dequeue by 3 times.
In first left rotation we get [20, 30, 40, 50, 10]. 
In second left rotation we get [30, 40, 50, 10, 20].
In third left rotation we get [40, 50, 10, 20, 30].
Constraints:
1 ≤ dq.size() ≤ 105 
1 ≤ k ≤ 105 
1 ≤ type ≤ 2

