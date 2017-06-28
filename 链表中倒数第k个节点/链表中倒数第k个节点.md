# 链表中倒数第k个节点



---

## 题目描述：
输入一个链表，输出该链表中倒数第k个结点。
### 思路1：
先遍历先求出链表个数，然后求倒数k个节点，也就是正数第size-k+1个节点 时间复杂度为O(n)
代码：
```
public Node getKthNode(Node head, int k) {

        if (head == null || k < 1)
            return null;

        int size = getNodeNum(head);
        if (k > size)
            return null;
        current = head;
        //倒数第k个节点,就是正数第size-k+1个节点,当前指向第一个节点，还需要移动size-k次
        for (int i = 1; i <= size - k; i++)
            current = current.next;

        return current;


    }
```
### 思路2：
在k合法的情况下：链表共有n个节点，倒数第k个节点，就是正数第n-k+1个节点。最后一个节点为n，倒k节点与最后一个节点之间共有n-(n-k+1) = k-1；
采用双指针法：前指针先n移动k-1次，然后双指针一起移动,注意，如果第一个指针在第一次移动过程中出现null，即代表链表长度小于k，此时无法获取k节点。
while循环条件  first.next == null ，因为first指针移动到最后一个节点时，second指针正好移动到倒数第k个节点。因此该判断条件一定要注意。
代码：
```
public Node getKthNodeByTwoPoint(Node head, int k) {

        if (head == null || k < 1)
            return null;
        Node first = head;
        Node second = head;
        for (int i = 1; i <= k - 1; i++) {
            first = first.next;
            if (first == null)
                return null;
        }

        while (first.next != null) {
            first = first.next;
            second = second.next;
        }

        return second;
    }
```





