// Hue's solution: 

class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        return reverse(head).get(0);
    }
    //check head is the end
    //create new linked list
    //return a list of head and end of a linked list
    private ArrayList<ListNode> reverse(ListNode head){
        if(head.next == null){
            ListNode newList = new ListNode(head.val);
            ArrayList<ListNode> result = new ArrayList();
            result.add(newList);
            result.add(newList);
            return result;
        }
        ArrayList<ListNode> reversed = reverse(head.next);
        System.out.println(reversed.toString());
        reversed.get(1).next = new ListNode(head.val);
        reversed.set(1, reversed.get(1).next);
        return reversed;
    }
}
