# 二叉搜索树的第k个节点

标签（空格分隔）： 树

---

### 题目描述：
给定一颗二叉搜索树，请找出其中的第k大的结点。例如， 5 / \ 3 7 /\ /\ 2 4 6 8 中，按结点数值大小顺序第三个结点的值为4。

### 思路：
二叉搜索树中序遍历的结果就是已经拍好顺序的结果，所以按照中序遍历的顺序寻找第k个节点就行

### 代码：
```
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {

  

    TreeNode KthNode(TreeNode pRoot, int k) {

        if (pRoot == null || k < 1)
            return null;

        Stack<TreeNode> stack = new Stack<>();
        int count = 0;
        while (pRoot != null || !stack.empty()) {

            while (pRoot != null) {

                stack.push(pRoot);
                pRoot = pRoot.left;

            }

            if (!stack.empty()) {

                TreeNode node = stack.pop();
                count++;
                if (count == k)
                    return node;
                pRoot = node.right;//此处非常容易出错 一定是pRoot而不是node
            }

        }

        return null;
    }
}

```



