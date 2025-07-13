# 26. Remove Duplicates from Sorted Array

**Difficulty:** Easy  
**Topics:** Array, Two Pointers

---

## 📝 Problem Statement

Given an integer array `nums` **sorted in non-decreasing order**, remove the duplicates **in-place** such that each unique element appears **only once**.  
The **relative order** of the elements should be kept the same.

Then return the number of unique elements in `nums`.

You **must** do this by modifying the input array **in-place** with **O(1)** extra memory.

---

## ✅ Constraints

- `1 <= nums.length <= 3 * 10^4`
- `-100 <= nums[i] <= 100`
- `nums` is sorted in **non-decreasing** order.

---

## 🧪 Example 1

**Input:**
nums = [1,1,2]

**Output:**
k = 2, nums = [1,2,_]


**Explanation:**  
Your function should return `k = 2`, with the first two elements of `nums` being `1` and `2` respectively.  
It doesn't matter what you leave beyond the returned `k`.

---

## 🧪 Example 2

**Input:**
nums = [0,0,1,1,1,2,2,3,3,4]

**Output:**
k = 5, nums = [0,1,2,3,4,,,,,_]