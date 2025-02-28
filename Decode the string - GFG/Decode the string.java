D-553 Decode String | LeetCode 394 |  gfg potd today | GeeksForGeeks 01 Mar | Stacks 
 Youtube Link - https://youtu.be/zMelqC4qU8U
https://www.geeksforgeeks.org/problems/decode-the-string2444/1

ALGO:
	1. Traverse through str
	2. If number, [, push
	3. If "]"
		a. Pop until "["
		b. Remove "["
		c. Pop repeat count
		d. Repeat substring count times and push back
	4. Construct final result

COde

class Solution {
    static String decodeString(String s) {
       Stack<String> st = new Stack<>();
        char c[] = s.toCharArray();
        int n = s.length();
        
        for (int i = 0; i < n;) {
            if (Character.isDigit(c[i])) {  // Case 1: Number
                StringBuilder str = new StringBuilder();
                while (i < n && Character.isDigit(c[i])) {
                    str.append(c[i]);
                    i++;
                }
                st.push(str.toString());
            } 
            else if (c[i] == ']') {  // Case 2: Closing bracket
                StringBuilder str = new StringBuilder();
                
                while (!st.isEmpty() && st.peek()!="[") 
                    str.insert(0, st.pop()); //  insert at the beginning
                
                if (!st.isEmpty()) st.pop(); 
                //repeat cnt
                int times = !st.isEmpty() && Character.isDigit(st.peek().charAt(0)) ? Integer.parseInt(st.pop()) : 1; 
                
                StringBuilder repeatedStr = new StringBuilder();
                while (times-- > 0) {
                    repeatedStr.append(str);
                }
                st.push(repeatedStr.toString());
                i++;
            } 
            else if (c[i] == '[') {  // Case 3: Opening bracket
                st.push("[");
                i++;
            } 
            else {  // Case 4: Letters
                StringBuilder str = new StringBuilder();
                while (i < n && Character.isLetter(c[i])) {
                    str.append(c[i]);
                    i++;
                }
                st.push(str.toString());
            }
        }
        
         StringBuilder res = new StringBuilder();
        while (!st.isEmpty()) {
            res.insert(0, st.pop()); // Insert at beginning
        }
        return res.toString();
    }
}



  ►DSA 360 - https://docs.google.com/spreadsheets/d/1VGndOtnWGz_KwTdiQi0qdxb4HYnigWKr4woVZQWz6kY/edit?usp=sharing

Reference Videos 
1.   Trick The TLE   -  https://youtu.be/EQgEueWySUg
https://youtu.be/EQgEueWySUg?si=-PqrC2qOLAB_WJ4b
2. "Time Complexity: Live Q&A with Students | "SRM University" - https://youtu.be/8s1EXyglKFA

Follow 👉DSA repository - https://github.com/AkshayAnil1080/DSA

Leetcode - https://leetcode.com/problems/decode-string/description/
GFG - https://www.geeksforgeeks.org/problems/decode-the-string2444/1
Source Code with Dry Run - 

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
