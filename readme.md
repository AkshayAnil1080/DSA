# Accelerating_My_Dream_With_Techdose
<a href="https://docs.google.com/spreadsheets/d/1oKnWkzI2U3eQFrZtYo7U-r2QhnpxNJn2zFnz9nFTJZM/edit#gid=0">Assignment Link</a>

## Day1 pg 1-9
	* -Time Complexity Analysis
	* MasterTheorem


## Day2 pg 9-16
	* Bit Manipulation - NOT,AND,OR,XOR,LEFT and RIGHT SHIFT
	* 1.IF n is power of 2 - logn , O(1)
	* 2.Counting Set Bits - logn , o(set_bits)Brian Algo, theta(1) table lookup 
	* 3.Check if kth bit is set or not - o(1)
	* 4.DP and BitMasking - Generate all possible subsets - n*2pown
	* 5.Compute XOR from 1toN - O(1)
	* 6.Bitwise and of number range - O(set_bits)
	* LC-136,137,169,201,338,461,11734
## Day3 pg 17-28
	* Mahtematics
	1. Base conversion
	2. N is prime or not - (sqrt(n))
	3. All factors in a number - (sqrt(n))
	4. Find all prime from 1 to N - (n*sqrt(n)),  Sieve of Eratosthenes - nloglogn
	5. Prime factors of N - - (sqrt(n))
	6. Coeff of NCr - DP app - (n^2)
	HW1. If n is fixed, how to do in 1d table
	7. Distributive Property to handle representation overflow
	8. Euclidean algo -  log(min(A,B))
	9. Binary Exponentiation - itr - logn(b) for a^b
	10. Catylyan Numbet
		a.The no. of valid () expression that consist N right () and N left () is Cn
		b. A rooted BT with one root node where each node has either 0 or 2 branches
		   An internal node has 2 branches and leaf node has 0. Count how many rooted BTs are there with N interanal node
		c. Count no of ways to divide circle using N non-intersecting chords
		d. Cn is the no of diff ways (N+1) factor can completely ()sized. U cannot put single value in()
		e. Count structurally unique BSTs with N keys.
		f. In a NxN matrix number of ways to to reach from bottom left -> top right diagonal using paths on either side of diagonal
		g. All possible BT with given inorder traversal
	HW. Read article/blog on c,e,f.
## Day5
	* Arays
	1.Sum of integers(N<=40), each value <=10^9, det the max sum subset having sum<=S , S<=10^18 - 
	2^N, DP(0-1 Knapsack) N*S - Binary Search (n* 2^n/2)
	2. Range Addition - grad[L]+=x, grad[R+1]-=x - (n)
	3. Binary Search - Sorted Array, Rotated Sorted Array, Peak Ele, 
	BS on assignmen prob, Allocating min number of pages - (n*log(sum)
## Day4 pg 29-35
	*BinarySearch
	1. kth smallest/l multiplication result
	2. Two Ptr APP
		a. merge two sorted array into one
		b. given two unsorted arr, o/p for eacg ele in array b, how many ele are <= B[i] in array A
		c. find largest/s/no of subarrays with sum <=x
		d. count no of subarrays with atmost 'k' unique ch/nos from the given arr
		e. MAX SPEED PROBLEM - count all subarrays ( find max len of subarray) where maxinSA-mininSA<=k
	3. Sliding Window
		FixSW
		a. max/min in all subarrays of size k
		b. 1st -ve in every window of size k
		c. count occurences of anagrams
		d. find max of all SW of size k
		e.  find the window which has most number of unique letters
		
		Var SW
		a. l/s Sub array size where sum<=s
		b. l substring with k distinct charcters(rep allowed)
		c. l of longesrt substring with no repeating ch
		
	4. MOORES VORING ALGO - bit tech will not work if not gaurenteed that maj is present
	5. RABGE QUERY PROB -sum(1,3) ->prefixsum(r)-ps(l-1) i!=0; else ret ps[r]
	6. KANDANES ALGO
	
## Day6
	* SORTNG
	1. Bubble
	2. selection
	3. insertion
	4. merge
	5. quick - lomuto
	6. counting
	7. radix
	8. bucket
## Day6
	* STACKS, QUEUE,
	* DEQUE
	1. Simple, Circular, Dequeu, Priority
	2. Expression Evaluation
	3. postfix Evaluation
	4. Stack Using Queue
	5. Implement a Stack Using One Queue
## Day7
	* HASHING
	a. Chaining - arr, ll, selfbalacning - logl(bes)
	b. OpenAddressing
		-linear probing
		-quadratic probing
		-double hashing
	c. Rehashing
## HEAP
	1. Max and Min heap
    2. Internal node >= Leaf node
    3. Range of leaf node = floor(n/2) +1 to n.
    4. Range of Internal Node = 1 to floor(n/2)
    5. Max node at ht h = 2powh : h=0,1,2,3...
    6. Heapify Algo
    7. Build Heap
    8. Extract_Min
    9. Insert ele
    10. Increase key
    11. Decrese key for Max heap
    12. heap Sort

## TREE
    1. FULL BT -0 or 2 children
    2. Complete BT -  which all the levels are completely filled except possibly the lowest one, which is filled from the left.
    3. Balanced BT 
    4. Degenerate/Skewed/Pathological Tree
    5. for Full BT -  LeafNode = Int Node+1
    6. For k arr Tree -  L =(k-1)*IN+1
    7. pre, in, Post , Level order
    8. Construct BT - poss only from In + (pRe/post) is given
    9. Inorder - itr order(Stack)- Morris Traversal -> Threaded BT
    10. Impl of BT with Array
    11. Continuous, Foldabel(Mirro), Expression trees
    12. Convert BL to DLL
    13. Balamced BST (avl)
    14. Directory File System -  File System Imp (LCRS) - Left Child right Sibling Tree
    15. Why not n arr tree for file dir => no space opt

## Greedy
    1. Decision Tree
    2. Fractional KnapSack
    3. Huffman Coding
    4. Job Scheduling prob
    
## RECURSION
    1. Fibonacci
    2. generate Subsets
    3. String permutation Problem
    4. Recusrion with BackTracking
    5. What is Pruning - removing a part from search such that its gaurenteed
    6. Recucruos with Divide and Conquer - merge Sort
## Trie
    1. Remove all instance - we->0 , remove 1 instance -> we--
    2. Store a bunch of name(10pow6) and search if name is present
        m1 - hashmap/Set - rolling hash
        m2 - Trie O(word_len)
    3. (a+b)%m = ((a%m) + (b%m))%m

## SEGMENT TREE
    1. to make balanced BT, divide arr into two halves
    2. No overlap, Partial Overlap, totol Overlap
    3. buildTree() , Query(), updateNode(),
    4. Range Sum,Min/Max, XOR, GCD/LCM, Query
    5. Find Count of Zeros in range Query
    
## GRAPHS
    1. Directed, undirected, Cyclic, Weighted, Unweighted, Sparse/dense, full connected, Spanning Tree
    2. DFS, BFS, Disjoint Set, Rank, Union, path Compression
    3. topological Sort via DFS, BFS(Khans Algo)
    App. Dete Cycle in undirected graph, Order of elements
    4. Cycle Detection
        m1 - DFS(2 colors - UG, 3 colors - DG)
        m2 = Disjoint Set - UG
        m3 = topologicalSort - DG
        m4 = BFS - UG.
    5. Graph is tree or not ? 1. no cycle 2. 1 component
    6. Bipartate graph
    7. Spanning Tree - Prims(Greedy) , kruskals
    8. Dijkstras
    9. Rechability Prob - All pairs Shortest path(Floydd warshall Algo)
    
## DP
    1. BT - parsing all poss paths - Recursion , DP, Greesy(fastest)
    2. 0-1KnapSack
    3. Subset Sum
    4. Count Subsets with given Sum
    5. Can u divide into two subsets equally
    6. Coin Change Prob
    7. Subsequences, substring
    8. memorization
    9. LCS
    10. LIS
    11. Edit Distance(Levenshthein Distance Algo)
    12. Matrix Chain Multiplication


	
	
