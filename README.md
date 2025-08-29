# 🌟 Day 5 – Problem Solving in Java

This repository contains three problems solved using Queues and Priority Queues, showcasing brute force and optimized approaches.
Each problem includes explanations, edge cases, dry runs, and complexity analysis for better understanding. 💡


---

## 🔢 1. Decimal to Binary Conversion

📌 Problem Statement

Convert a given decimal number into its binary representation.

⚡ Edge Cases

Input = 0 → Output should be 0

Input = 1 → Smallest non-zero binary

Large input values (e.g., 1024) → Should still work efficiently

Negative numbers → If allowed, must handle two’s complement (optional case depending on constraints)


🛠 Approaches

Brute Force Approach

Repeatedly divide the number by 2.

Collect remainders and reverse them.

⏳ Time Complexity: O(log n)

💾 Space Complexity: O(log n) (stack of remainders)


Optimized Approach (Using Queue)

Instead of reversing, use a queue to maintain order while dividing.

Push remainders into the queue and directly build the binary string.

⏳ Time Complexity: O(log n)

💾 Space Complexity: O(log n)


🔍 Dry Run (n = 10)

Step 1: 10 % 2 = 0 → queue = [0]
Step 2: 10 / 2 = 5
Step 3: 5 % 2 = 1 → queue = [0,1]
Step 4: 5 / 2 = 2
Step 5: 2 % 2 = 0 → queue = [0,1,0]
Step 6: 2 / 2 = 1
Step 7: 1 % 2 = 1 → queue = [0,1,0,1]
Binary = 1010

✅ Output: 1010


---

## 🪢 2. Minimum Rope Cost (a.k.a Minimum Cost to Connect Ropes)

📌 Problem Statement

Given n ropes with different lengths, connect them into one rope with the minimum cost.
The cost of connecting two ropes = sum of their lengths.

⚡ Edge Cases

Single element array → Cost = 0

All elements same → Multiple minimal costs, but output consistent

Strictly increasing/decreasing arrays

Large inputs → Must avoid TLE


🛠 Approaches

Brute Force Approach

Try all possible ways of connecting ropes.

Extremely inefficient.

⏳ Time Complexity: O(n^2)

💾 Space Complexity: O(1)


Optimized Approach (Using Priority Queue / Min-Heap)

Always connect the two smallest ropes first.

Push back their sum into the priority queue.

Repeat until one rope remains.

⏳ Time Complexity: O(n log n)

💾 Space Complexity: O(n)


🔍 Dry Run (ropes = [4,3,2,6])

Step 1: PQ = [2,3,4,6]
Take 2 & 3 → cost = 5 → total = 5
PQ = [4,5,6]

Step 2: Take 4 & 5 → cost = 9 → total = 14
PQ = [6,9]

Step 3: Take 6 & 9 → cost = 15 → total = 29
PQ = [15]

✅ Output: 29


---

## 🪟 3. Sliding Window Maximum

📌 Problem Statement

Given an array and a window size k, find the maximum element in each sliding window.

⚡ Edge Cases

k = 1 → Every element is its own max

k = n → Only one window = max of full array

All elements same → Output should repeat same value

Large k values close to n

Empty array → No output


🛠 Approaches

Brute Force Approach

For each window of size k, scan all k elements.

⏳ Time Complexity: O(nk)

💾 Space Complexity: O(1)


Optimized Approach (Using Deque)

Maintain a deque of indices of useful elements.

Keep elements in decreasing order inside the deque.

The front always gives the maximum of the current window.

⏳ Time Complexity: O(n)

💾 Space Complexity: O(k)


🔍 Dry Run (arr = [1,3,-1,-3,5,3,6,7], k=3)

Window 1: [1,3,-1] → Max = 3
Window 2: [3,-1,-3] → Max = 3
Window 3: [-1,-3,5] → Max = 5
Window 4: [-3,5,3] → Max = 5
Window 5: [5,3,6] → Max = 6
Window 6: [3,6,7] → Max = 7

✅ Output: [3,3,5,5,6,7]


---

### 📚 Data Structures Used

🧾 Queue → Decimal to Binary Conversion

🔽 Priority Queue (Min-Heap) → Minimum Rope Cost

🔄 Deque → Sliding Window Maximum



---

🏆 Conclusion

These problems demonstrate the evolution of problem-solving from brute force to optimal solutions using Queues & Priority Queues.
Writing and analyzing both approaches helps in understanding time-space trade-offs and prepares for interview-level problem solving.

✨ This concludes Day 5 of Problem Solving in Java ✨


---
