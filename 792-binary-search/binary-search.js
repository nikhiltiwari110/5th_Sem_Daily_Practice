/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
let si = 0
let ei = nums.length-1
while(si<=ei){
    let m = Math.floor(si + (ei - si) / 2)
    if(nums[m]===target){
        return m
    }else if(nums[m]>target){
        ei = m-1;
    }else{
        si = m+1;
    }
}
return -1 
};