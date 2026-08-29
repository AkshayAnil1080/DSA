//{ Driver Code Starts
//Initial Template for javascript
'use strict';

process.stdin.resume();
process.stdin.setEncoding('utf-8');

let inputString = '';
let currentLine = 0;

process.stdin.on('data', inputStdin => {
    inputString += inputStdin;
});

process.stdin.on('end', _ => {
    inputString = inputString.trim().split('\n').map(string => {
        return string.trim();
    });
    
    main();    
});

function readLine() {
    return inputString[currentLine++];
}

function main() {
    let t = parseInt(readLine());
    let i = 0;
    for(;i<t;i++)
    {
        let n = parseInt(readLine());
        let arr = new Array(n);
        let input_ar = readLine().split(' ').map(x=>parseInt(x));
        for(let i=0;i<n;i++)
            arr[i] = input_ar[i];
        let obj = new Solution();
        console.log(obj.maxIndexDiff(arr, n));
        
    }
}
// } Driver Code Ends


//User function Template for javascript

/**
 * @param {number[]} A
 * @param {number} N
 * @returns {number}
*/

class Solution {
    // Function to find the maximum index difference.
 maxIndexDiff(arr, n) {
    

    let right = new Array(n); // max, j
    let left = new Array(n); // min, i
    left[0] = arr[0];
    right[n - 1] = arr[n - 1];

    // Calculate the minimum element encountered so far from the left
    for (let i = 1; i < n; i++) {
        left[i] = Math.min(arr[i], left[i - 1]);
    }

    // Calculate the maximum element encountered so far from the right
    for (let j = n - 2; j >= 0; j--) {
        right[j] = Math.max(arr[j], right[j + 1]);
    }

    let i = 0, j = 0, ans = -1;
    while (i < n && j < n) {
        if (left[i] <= right[j]) {
            ans = Math.max(ans, j - i); // Update ans if a new maximum difference is found
            j++;
        } else {
            i++;
        }
    }
    return ans;
}



}
