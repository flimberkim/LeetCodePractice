//시간복잡도 : O(N), N은 초기 LinkedList의 길이
//자료구조 : LinkedList
//아이디어 : 처음 주어진 LinkedList의 길이를 파악하고, k개의 LinkedList로 나누었을 때 각 List의 길이와 나머지를 구한다. 나머지를 차감하면서 각 LinkedList의 길이를 하나씩 늘려가면서 ans 배열에 head값을 넣어준다.

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        
        ListNode[] ans = new ListNode[k];

        int size = 0;

        ListNode current = head;

        while (current != null) {
            size++;
            current = current.next;
        }

        int baseGroupSize = size / k;
        int remainder = size % k;
        
        current = head;
        
        for(int i = 0; i < k; i++){
            ListNode newPart = new ListNode(0);
            ListNode remainingPart = newPart;
            
            int currentSize = baseGroupSize;
            
            if(remainder > 0){
                remainder--;
                currentSize++;
            }
            
            int j = 0;
            
            while(j < currentSize){
                remainingPart.next = new ListNode(current.val);
                remainingPart = remainingPart.next;
                j++;
                current = current.next;
            }
            ans[i] = newPart.next;
        }

        return ans;
    }
}