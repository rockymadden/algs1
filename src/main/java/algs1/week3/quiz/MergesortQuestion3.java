package algs1.week3.quiz;

import edu.princeton.cs.algs4.StdRandom;

// Shuffling a linked list. Given a singly-linked list containing n items, rearrange the items
// uniformly at random. Your algorithm should consume a logarithmic (or constant) amount of extra
// memory and run in time proportional to n log n in the worst case.
//
// See: https://stackoverflow.com/questions/12167630/algorithm-for-shuffling-a-linked-list-in-n-log-n-time
public class MergesortQuestion3 {
    public static class ListNode {
        int val;
        ListNode next;

        public ListNode(int i) { val = i; }

        public String toString() {
            ListNode itr = next;
            String str = val + " -> ";

            while (itr != null) {
                str = str + itr.val + " -> ";
                itr = itr.next;
            }

            return str + "null";
        }
    }

    static int length(ListNode list) {
        if (list == null) return 0;

        int n = 0;

        while (list != null) {
            n++;
            list = list.next;
        }

        return n;
    }

    static ListNode insertAt(ListNode list, ListNode node, int index) {
        assert(list != null);
        assert(node != null);
        assert(index >= 0);

        ListNode ans = new ListNode(-1);
        ans.next = list;
        list = ans;
        int i = 0;

        while (list != null) {
            if (i++ == index) {
                node.next = list.next;
                list.next = node;
                break;
            }

            list = list.next;
        }

        return ans.next;
    }

    static ListNode sanitize(ListNode list) {
        assert(list != null);

        // Prepend with dummy node;
        ListNode ans = new ListNode(-1);
        ans.next = list;
        list = ans;
        ListNode prev = ans;

        while (list != null) {
            if (list.val == -1) {
                prev.next = list.next;
            }

            prev = list;
            list = list.next;
        }

        return ans.next;
    }

    public static ListNode shuffle(ListNode list) {
        if (list == null) return list;

        ListNode l1 = new ListNode(-1); // Lead with dummy node.
        ListNode l2 = new ListNode(-1); // Lead with dummy node.
        ListNode l1Builder = l1;
        ListNode l2Builder = l2;

        // Interleave nodes between two lists. We will use the split to randomly concat them later.
        while (list != null) {
            l1Builder.next = list;
            list = list.next;
            l1Builder = l1Builder.next;
            l1Builder.next = null;

            if (list != null) {
                 l2Builder.next = list;
                 list = list.next;
                 l2Builder = l2Builder.next;
                 l2Builder.next = null;
            }
        }

        l1 = l1.next; // Remove dummy node.
        l2 = l2.next; // Remove dummy node.
        int n1 = length(l1);
        int n2 = length(l2);

        if (n1 > 2) shuffle(l1);
        if (n2 > 2) shuffle(l2);

        if (n2 < n1) {
            int rnd = StdRandom.uniform(0, n2);
            l2 = insertAt(l2, new ListNode(-1) , rnd);
        }

        list = new ListNode(-1); // Lead with dummy node.
        ListNode listBuilder = list;

        while (l1 != null || l2 != null) {
            int favor =
                l1 != null && l2 != null
                    ? StdRandom.uniform(1, 3)
                : l1 == null
                    ? 2
                    : 1;

            if (favor == 1) {
                listBuilder.next = l1;
                l1 = l1.next;
                listBuilder = listBuilder.next;
                listBuilder.next = null;
            } else {
                listBuilder.next = l2;
                l2 = l2.next;
                listBuilder = listBuilder.next;
                listBuilder.next = null;
            }
        }

        list = list.next; // Remove dummy node.

        return sanitize(list);
    }
}
