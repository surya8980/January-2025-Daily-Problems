# [Subarrays with Sum K](https://github.com/surya8980/January-2025-Daily-Problems/blob/main/GeeksForGeeks/02-01-2024/Subarrays%20with%20sum%20K.java)
# Problem Statement:

Given an unsorted array of integers, find the number of continuous subarrays having sum exactly equal to a given number  **k**.

**Examples:**
```
Input:  arr = [10, 2, -2, -20, 10], k = -10  
Output: 3  
Explaination: Subarrays: arr[0...3], arr[1...4], arr[3...4] have sum exactly equal to -10.
```  
```
Input: arr = [9, 4, 20, 3, 10, 5], k = 33  
Output: 2   
Explaination: Subarrays: arr[0...2], arr[2...4] have sum exactly equal to 33.
```  
```
Input: arr = [1, 3, 5], k = 0    
Output:0  
Explaination: No subarray with 0 sum.  
```
**Constraints:**

-   1 ≤ arr.size() ≤ 10^5
-   -10^3  ≤ arr[i] ≤ 10^3
-   -10^7 ≤ k ≤ 10^7
