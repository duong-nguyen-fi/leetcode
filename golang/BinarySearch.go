//  Runtime: Beats 61.06%of users with Go
//  Memory: Beats 100% users with Go
  
func search(nums []int, target int) int {
    return searchRecur(nums, target, 0, len(nums)-1);
}

func searchRecur(nums []int, target int, left int, right int) int {
    var mid int = left + (right-left)/2;
    if (left>right){
        return -1
    }
    if nums[mid]==target {
        return mid
    } else if nums[mid] < target {
        return searchRecur(nums,target,mid+1, right)
    } else {
        return searchRecur(nums,target,left, mid-1)
    }
}
