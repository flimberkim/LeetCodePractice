//HashMap을 사용하면 시간복잡도를 조금 더 줄일 수 있다.

//시간복잡도 : O(N^2)
//배열
//아이디어 : 배열에 대해 반복문을 돌면서 두 수의 합이 target 값인 인덱스를 찾는다.

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] answer = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    answer[0] = i;
                    answer[1] = j;
                   return answer;
                }
            }
        }
        
        return answer;
    }
}