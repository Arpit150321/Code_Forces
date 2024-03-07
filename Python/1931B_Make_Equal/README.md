## 1931 B. Make Equal
### Link: https://codeforces.com/problemset/problem/1931/B

# Intuition
The problem seems to require distributing water equally among containers, and the solution might involve calculating the average amount of water each container should have.

# Approach
1. Read the number of test cases.
2. For each test case:
   a. Read the number of containers.
   b. Read the water amounts for each container and calculate the total sum.
   c. Calculate the average water amount per container.
   d. Check if each container can be filled to the average amount by redistributing water from containers with excess water to those with insufficient water.
   e. If all containers can be equalized, return "YES"; otherwise, return "NO".

# Complexity
- Time complexity: O(n), where n is the number of containers. We iterate through each container to calculate the total sum and check if each container can be equalized.
- Space complexity: O(1) as we are using a constant amount of extra space for variables regardless of the input size.