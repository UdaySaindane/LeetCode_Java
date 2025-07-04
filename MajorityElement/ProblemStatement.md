# 🧠 169. Majority Element

## 📝 Problem Statement

Given an array `nums` of size `n`, return the **majority element**.

The **majority element** is the element that appears **more than ⌊n / 2⌋ times**.

You may assume that the majority element **always exists** in the array.

---

## 📥 Input

- An integer array `nums` of length `n`.

---

## 📤 Output

- An integer representing the majority element.

---

## ✅ Constraints

- `n == nums.length`
- `1 <= n <= 5 * 10⁴`
- `-10⁹ <= nums[i] <= 10⁹`
- The majority element **always exists**.

---

## 📚 Examples

### Example 1:
```
Input:  nums = [3, 2, 3]  
Output: 3
```

### Example 2:
```
Input:  nums = [2, 2, 1, 1, 1, 2, 2]  
Output: 2
```

---

## 💡 Approach 1: Boyer-Moore Voting Algorithm (Optimal)

### 🔧 Java Code:

```java
class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0];

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }
}
```

### 🕒 Time Complexity:
- O(n)

### 💾 Space Complexity:
- O(1)

---

## 💡 Approach 2: Brute Force (Count Frequencies)

### 🔧 Java Code:

```java
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majorityCount = n / 2;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] == nums[i]) {
                    count++;
                }
            }
            if (count > majorityCount) {
                return nums[i];
            }
        }

        return -1; // As per constraints, this will never be reached.
    }
}
```

### 🕒 Time Complexity:
- O(n²)

### 💾 Space Complexity:
- O(1)

---

## 🔚 Summary

- The **Boyer-Moore Voting Algorithm** is the most efficient method to solve this problem.
- No extra memory is needed.
- Works only when the majority element is **guaranteed** to exist (which it is in this problem).

---
