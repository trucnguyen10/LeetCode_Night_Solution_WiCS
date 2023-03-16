//Truc's solution: 

          // Recrusion: 
          class Solution(object):
              def reverseList(self, head):
                  if not head or not head.next: 
                      return head

                  result = self.reverseList(head.next)
                  head.next.next = head
                  head.next = None

                  return result

              // Runtime: O(n), space: O(n)

          // Iteration:
          class Solution(object):
              def reverseList(self, head):
                  if not head: 
                      return None
                  prev = None
                  cur = head
                  while cur: 
                      nex = cur.next
                      cur.next = prev
                      prev = cur
                      cur = nex
                  return prev
               // Runtime: O(n), space: O(1)

   
  
