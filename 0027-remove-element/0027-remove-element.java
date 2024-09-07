//시간복잡도 : O(NlogN), N은 nums의 길이
//자료구조 : 배열
//아이디어 : nums과 같은 크기의 배열을 만들어 놓고, nums를 돌며 val와 값이 일치하면 -1을 채우고 아니면 nums의 값을 가져온다. 마지막에 temp를 정렬하고 그 값들을 그대로 nums에 복사한다. 이 문제는 매우 비효율적으로, nums의 참조를 바꿀 수 없게 만들어 놓아서 시간복잡도와 공간복잡도 모두 효율적으로 작성할 수 없는 문제라고 생각한다..

class Solution {
    public int removeElement(int[] nums, int val) {
        
        Integer[] temp = new Integer[nums.length];

        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                temp[i] = -1;
            } else {
                temp[i] = nums[i];
                count++;
            }
        }

        Arrays.sort(temp, Collections.reverseOrder());

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }

        return count;
    }
}