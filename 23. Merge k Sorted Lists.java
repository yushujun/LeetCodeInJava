brute force
:public class Solution {
  public ListNode mergeKLists(ListNode[] lists) {
    ListNode resList = new ListNode(-1);
    ListNode curNode = resList;
    resList.next = null;
    List<ListNode> list = new ArrayList<>();
    for(ListNode tmpNode : lists)
      if(tmpNode != null) list.add(tmpNode);
    ListNode node = null;
    while(list.size() > 0){
      for(int i = 0; i < list.size(); i++){
        if(list.get(i) == null){
          list.remove(i);
          continue;
        }
        if(node == null) node = list.get(i);
        else node = list.get(i).val < node.val ? list.get(i) : node;
      }
      if(list.size() > 0){
        curNode.next = node;
        curNode = node;
        list.remove(node);
        node = node.next;
        list.add(node);
      }
    }
    return resList.next;
  }
}
time complexity:O(n(k^2))
space complexity:O(1)

min heap:
public class Solution {
  public ListNode mergeKLists(ListNode[] lists) {
    PriorityQueue<ListNode> minQueue = new PriorityQueue<>(new Comparator() {
      @Override
      public int compare(Object o1, Object o2) {
        return ((ListNode)o1).val - ((ListNode)o2).val;
      }
    });
    for(int i = 0; i < lists.length; i++)
      if(lists[i] != null)
        minQueue.add(lists[i]);
    ListNode resList = new ListNode(-1);
    ListNode temp = resList;
    temp.next = null;
    while(minQueue.size() > 0){
      ListNode node = minQueue.poll();
      temp.next = node;
      temp = node;
      if(node.next != null) minQueue.add(node.next);
    }
    return resList.next;
  }
}
time complexity:O(nklogk)
space complexity:O(k)

divide and conquer:
public class Solution {
  public ListNode mergeKLists(ListNode[] lists) {
    if(lists.length == 0) return null;
    return merge(lists,0,lists.length-1);
  }
  public ListNode merge(ListNode[] lists,int left,int right){
      if(left == right) return lists[left];
      else if(left > right) return null;
      int mid = left+(right-left)/2;
      ListNode leftNode = merge(lists,left,mid);
      ListNode rightNode = merge(lists,mid+1,right);
      return mergeSort(leftNode,rightNode);
  }
  public ListNode mergeSort(ListNode list1,ListNode list2){
      if(list1 == null) return list2;
      if(list2 == null) return list1;
      ListNode dummy = new ListNode(-1);
      ListNode temp = dummy;
      while(list1 != null && list2 != null){
          if(list1.val > list2.val){
              temp.next = list2;
              list2 = list2.next;
          } else {
              temp.next = list1;
              list1 = list1.next;
          }
          temp = temp.next;
      }
     if(list1 != null){
         temp.next = list1;
     } else if(list2 != null){
         temp.next = list2;
     }
     return dummy.next;
  }
}
time complexity:O(nklogk)
space complexity:O(1)

