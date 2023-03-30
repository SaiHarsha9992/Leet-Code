class Solution {
    public int sumOfUnique(int[] nums) {
        int n = nums.length;
int sum=0;
for(int i=0;i<n;i++){
int flag=0;
for(int j=0;j<n;j++){
if(i==j){
continue;
}
else if(nums[i]==nums[j]){
flag=1;
break;
}
}
if(flag==0){
sum=sum+nums[i];
}
}
return sum;
}
}