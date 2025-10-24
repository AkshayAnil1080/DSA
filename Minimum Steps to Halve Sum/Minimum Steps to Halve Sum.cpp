Best Video Solution with Live Coding: https://youtu.be/R8m5R-wP6gY
LIKE | SHARE | SUBSCRIBE

practice here-- https://www.geeksforgeeks.org/problems/minimum-steps-to-halve-sum/1




nlogn , n
class Solution {
public:
    int minOperations(vector<int>& arr) {
        priority_queue<double> pq; // max-heap in C++
        double sum = 0;
        for (int x : arr) {
            sum += x;
            pq.push((double)x);
        }
        
        double target = sum / 2;
        int times = 0;
        while (sum > target) {
            double valueToDecrease = pq.top();
            pq.pop();
            double newDecreasedValue = valueToDecrease / 2;
            sum -= newDecreasedValue;
            pq.push(newDecreasedValue);
            times++;
        }
        return times;
    }
};
