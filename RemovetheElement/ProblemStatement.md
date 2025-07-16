# LeetCode 27: Remove Element

## 🧩 Problem Statement

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in `nums` **in-place**. The order of the elements may be changed. Then return the number of elements in `nums` which are **not equal to `val`**.

### You must:
- Change the array `nums` such that the first `k` elements of `nums` contain the elements which are **not equal to `val`**.
- Return `k`.

The remaining elements in `nums` beyond `k` are not important.

---

## ✅ Custom Judge

The judge will test your solution with the following code:

```java
int[] nums = [...]; // Input array
int val = ...; // Value to remove
int[] expectedNums = [...]; // The expected answer with correct length.

int k = removeElement(nums, val); // Calls your implementation

assert k == expectedNums.length;
sort(nums, 0, k); // Sort the first k elements of nums
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
🔍 Example 1
Input:
nums = [3,2,2,3], val = 3

Output:
k = 2, nums = [2,2,_,_]
(The underscores represent values beyond index k, which don't matter)

🔍 Example 2
Input:
nums = [0,1,2,2,3,0,4,2], val = 2

Output:
k = 5, nums = [0,1,3,0,4,_,_,_]
(The first 5 elements contain the result; order can vary)

💡 Constraints
0 <= nums.length <= 100

0 <= nums[i] <= 50

0 <= val <= 100

