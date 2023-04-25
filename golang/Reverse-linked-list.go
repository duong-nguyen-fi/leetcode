/**
 * Definition for singly-linked list.
 * type ListNode struct {
 *     Val int
 *     Next *ListNode
 * }
 */

 func reverseList(head *ListNode) *ListNode {
		arr := []int{}
    if head == nil {
			return nil
		} else {
			for head != nil {
				arr = append(arr, head.Val)
				head = head.Next
			}
	}
	
	//reverse the array
	for i, j := 0, len(arr)-1; i < j; i, j = i+1, j-1 {
        arr[i], arr[j] = arr[j], arr[i]
  }

	//create empty listnode - tmp and dummy point to the empty node
	tmp := &ListNode{}
	dummy := tmp

	for _, node := range arr {
		//fmt.Printf("%+v ->", node)
		tmp.Next = &ListNode{node, nil}
		tmp = tmp.Next
	}
	tmp.Next = nil
	return dummy.Next
}