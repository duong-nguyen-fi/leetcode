//  Runtime: Beats 91.06%of users with Go
//  Memory: Beats 100% users with Go
  
func search(nums []int, target int) int {
    end := len(nums)-1
    return searchRecur(nums, target, 0, end)
}

func searchRecur(nums []int, target , left , right int) int {
    if (left>right){
        return -1
    }
    mid  := left + (right-left)/2;
    if nums[mid]==target {
        return mid
    } else if nums[mid] < target {
        return searchRecur(nums,target,mid+1, right)
    } else {
        return searchRecur(nums,target,left, mid-1)
    }
}



/*
func solB(nums []int, target int) int {
    var res int = -1
    left , right := 0, len(nums)-1
    for (left <= right) {
        var mid int = left + (right-left)/2;
        if (nums[mid] > target){
            right = mid -1
        } else if (nums[mid]<target){
            left = mid +1
        } else{
            return mid
        }
    }
    return res
}
/*
