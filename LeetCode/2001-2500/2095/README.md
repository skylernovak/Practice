# LeetCode #2095

## Delete the Middle Node of a Linked List

You are given the head of a linked list. **Delete** the **middle node**, and return the head _of the modified linked list_.

The **middle node** of a linked list of size n is the ⌊n / 2⌋th node from the **start** using **0-based indexing**, where ⌊x⌋ denotes the largest integer less than or equal to x.

- For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.

## Example 1

**Input:** head = [1,3,4,7,1,2,6]

**Output:** [1,3,4,1,2,6]

**Explaination:** The list is 7 nodes long. The 0-based index is 6, and half of which is 3. The 0-based index 3 is node with value of 7. We must delete this node.

## Example 2

**Input:** head = [1,2,3,4]

**Output:** [1,2,4]

**Explaination:** We must delete the 0-based indexed node 2 with the value of 3 when the length of the LinkedList is 4.

## Example 3

**Input:** head = [2, 1]

**Output:** [2]

**Explaination:** For n = 2, node 1 with value 1 is the middle node.
Node 0 with value 2 is the only node remaining after removing node 1.

## Constraints:

- The number of nodes in the list is in the range [1, 10^5].
- 1 <= Node.val <= 10^5

## Personal Reflection

I attempted this as part of Weekly Contest 270. It was the second problem, and the only one I was able to solve. I figured a two pointer approach was the way to go. The fast pointer continues to the next node on each iteration of the loop, while the slow pointer would only advance once every two iterations of the loop. When the fast pointer gets to the end, the slow pointer will be at the node to be deleted. I then had to add a third pointer that would trail the slow pointer, so once the middle was found, the trailing pointer would then point to the node after the slow pointer to delete the middle node.

I was pleased that I was able to complete this problem, but was disappointed with how long it took me. I spent a lot of time on the problem before this one in the contest, but was unable to complete it. I had some small errors with my original submissions of this problem. First, I didn't have the trailing pointer, so I was deleting the wrong node. Second, I was having an out of bounds error with the fast pointer. It was going to null, and then checking if it exisited. I corrected it but having the fast pointer check if the next node was null.
