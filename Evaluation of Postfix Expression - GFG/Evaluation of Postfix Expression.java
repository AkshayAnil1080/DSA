 D-552 Evaluation of Postfix Expression | gfg potd today | GeeksForGeeks 28 Feb | DSA 360
   Youtube Link - https://youtu.be/x9fhjifomlM

SOURCE CODE
// Algo
// Create an empty stack
// Traverse through array
// 	If operand - push into stack
// 	Else
// 	Pop two ele and push the result.
// Return top


class Solution {
    public int evaluate(String[] arr) {
        Stack<Integer> st = new Stack<>();
        
        for (String x : arr) {
            // If string is an operand, push it to stack
            if (isNumber(x)) {
                st.push(Integer.parseInt(x));
            } 
            else {
                // Pop two operands from stack
                int n1 = st.pop();
                int n2 = st.pop();
                
                // Perform operation based on operator
                switch (x) {
                    case "+":
                        st.push(n2 + n1);
                        break;
                    case "-":
                        st.push(n2 - n1);
                        break;
                    case "*":
                        st.push(n2 * n1);
                        break;
                    case "/":
                        st.push(n2 / n1);
                        break;
                }
            }
        }
        // The result is stored at the top of the stack
        return st.peek();
    }
     boolean isNumber(String s) {
        if (s.isEmpty()) return false; // Empty string is not a number
        if (s.length() > 1 && s.charAt(0) == '-') s = s.substring(1); // Allow negative numbers

        for (char c : s.toCharArray()) {
            if (!Character.isDigit(c)) return false; // If any character is not a digit, return false
        }
        return true; // All characters are digits
    }
}

// Time Complexity: O(N)
// 	• The function iterates through the arr once → O(N).
// 	• Each operation (push, pop, parseInt) takes O(1) time.
// 	• Since each element is processed at most once, overall time complexity is O(N).
// Space Complexity: O(N)
// 	• The stack st stores at most N/2 elements in worst case (all numbers before any operation).
// 	• The extra function isNumber() runs in O(1) auxiliary space.
// 	• The overall space used is O(N) (for the stack).
// 0/7)


  Explore all resources
►DSA 360 - https://docs.google.com/spreadsheets/d/1VGndOtnWGz_KwTdiQi0qdxb4HYnigWKr4woVZQWz6kY/edit?usp=sharing

Reference Videos 
1.   Trick The TLE   -  https://youtu.be/EQgEueWySUg
https://youtu.be/EQgEueWySUg?si=-PqrC2qOLAB_WJ4b
2. "Time Complexity: Live Q&A with Students | "SRM University" - https://youtu.be/8s1EXyglKFA

Follow 👉DSA repository - https://github.com/AkshayAnil1080/DSA

Try it Yourself -  https://leetcode.com/problems/longest-substring-without-repeating-characters/description/
Source Code - https://github.com/AkshayAnil1080/DSA/tree/main/Longest%20substring%20with%20distinct%20characters%20-%20GFG%20-%20Sliding%20window

Use code for 10% off on GFG : "AKSHAYS10"
https://practice.geeksforgeeks.org/courses?utm_source=youtube&utm_medium=collab_akshayanil_description&utm_campaign=affiliateash

----------------------------------------------
"Sab log bolte hain 'padho, padho,' lekin koi yeh nahi batata padhein kaisen ???". I've stumbled a lot myself in figuring out the right way, and I'm grateful for the sequence of events that brought me here. Life’s too short to learn only from our own mistakes—that’s exactly why I want to share my approach with you all: how to study and what to focus on."  

Google Form link - https://forms.gle/HgkEs9Y8hnQDx6D87

Padhna kya h ?  -- (Syllabus ) https://docs.google.com/document/d/1M0b9Xii8WqVclS1YqEKr8t3knb0Cp9f1/edit?usp=sharing&ouid=114214536054275518148&rtpof=true&sd=true

Padhna kaise h ? - -  https://youtu.be/fipAfJGblhE

Hi! I’m Akshay, an SDE-2 at Mastercard with over 500 days of coding consistency. I’m excited to start a new journey with a DSA 0-100 playlist, aiming to break down complex data structures and algorithms for learners at all levels. I’ll share my notes, experiences, and insights, building on my time as an SDE at Mastercard, Ex - Sigmoid, Cognome, and Brillio.

LinkedIn -  https://www.linkedin.com/in/akshay-a-26672a172/
---------------------------------------------
Check out:

►My Day 1 Experience at Mastercard: [https://www.youtube.com/watch?v=UNcajikQz3U]
►Honest Talk - how to maximise output in your 20's | DSA Busted | #success #journey - https://www.youtube.com/watch?v=7QVVY10RBFA
►My 6-Month Experience at Sigmoid: [https://www.youtube.com/watch?v=NKX7NmXkhZU&t=101s]
►Interview Experience Playlist: [https://www.youtube.com/playlist?list=PL7EDHkJGOkPQH-12bG42l-2sDfojxohfv]
Problem-Solving Playlist: [https://www.youtube.com/@AkshayAnil0-1/playlists]

---------------------------------------------
ALL CP/DSA RESOURCES : https://linktr.ee/aksh_yay
Asked in Google - https://www.youtube.com/watch?v=jE-2v4B-VU4&list=PL7EDHkJGOkPQlXrUfnhltfLS8yEz7TCzNa
Interview Experience Playlist - https://www.youtube.com/watch?v=3nS8GCsat6g&list=PL7EDHkJGOkPQH-12bG42l-2sDfojxohfv
Leetcode Interview preparation - https://www.youtube.com/watch?v=QbecYVaL-MM&list=PL7EDHkJGOkPQpFMWiegKmQhNdGHtKjaqP
GFG POTD - https://www.youtube.com/watch?v=J8fPxMjv4kY&list=PL7EDHkJGOkPTQk_QoeHSTtaa1Fu0HywVy

Topics Wise
----------------------------------------------
Bitwise - https://www.youtube.com/watch?v=ARugnT9gK1c&list=PL7EDHkJGOkPSJjh1kn0wPLqrVeRDZXo-1
Stack and Queues - https://www.youtube.com/playlist?list=PL7EDHkJGOkPTLQ9Eba7wKBMGbUuiRwUmI
String Playlist - https://www.youtube.com/watch?v=_mlDsYT2zcc&list=PL7EDHkJGOkPR8LFDSh8tTC6ddSCYAQo-K&pp=gAQBiAQBI
Bitwise - https://www.youtube.com/playlist?list=PL7EDHkJGOkPSJjh1kn0wPLqrVeRDZXo-1
Linked List- https://www.youtube.com/playlist?list=PL7EDHkJGOkPSJwUBeKzGwCEnnIUM2-g8v
Recursion and BackTracking - https://www.youtube.com/watch?v=g1vrKDrIop8&list=PL7EDHkJGOkPRYVrWIK4qIASg1rwDl08Pb
Binary Trees - https://www.youtube.com/watch?v=RUo1QTXlteE&list=PL7EDHkJGOkPT3u4zQLBGIUzfnDFJpIIN8
Binary Search Tree - https://www.youtube.com/watch?v=7BkuXzLwmzc&list=PL7EDHkJGOkPTvoOQm-Hh-XjT8Wc4iQsrq
Graphs - https://www.youtube.com/watch?v=J9d9o1DROpk&list=PL7EDHkJGOkPTDkGbr0bz8KhJ9ZfoPVG2n
Dynamic Programming - https://www.youtube.com/watch?v=spiTIpmXLEc&list=PL7EDHkJGOkPS4ZTUX9p-iqtsvoobYIvNi
Disjoint Set - https://www.youtube.com/watch?v=WSmHLKC7E6w&list=PL7EDHkJGOkPSqV2JygvlE-h98JLYQk6FC&pp=gAQBiAQB
Trie - https://www.youtube.com/watch?v=4DeX5mnLiL4&list=PL7EDHkJGOkPQn40haKTw1XTqzt4ZcxkLb
Heaps - https://www.youtube.com/watch?v=AnxbVSXRUa4&list=PL7EDHkJGOkPRfvt-sv1oxkEHsQcSMNtrs
Arrays - https://www.youtube.com/watch?v=SBRbeaqViGE&list=PL7EDHkJGOkPT8no7CAX6BU51Ucg7yjf0U
Number Theory - https://www.youtube.com/watch?v=I5aFenPv3oQ&list=PL7EDHkJGOkPTtaJywiQDIXXjNmmO7PA7u


--------------------------
"Don't miss out on our #CodingPractice sessions designed to help you master #DataStructuresAndAlgorithms. 
#GFG #POTD #geeksforgeeks #problemoftheday #java
#AkshayAnil #dsa #code_with_akshay #dsa_with_akshay #dsasheet  #programming #leetcodesolutions  #gfg #gfgpotd #problemsolving #coding #softwareengineer #faang #amazon #microsoft #competitiveprogramming #dsasheet #interviewpreparation 
