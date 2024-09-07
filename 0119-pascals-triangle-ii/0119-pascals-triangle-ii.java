//시간복잡도 : O(N^2), N은 rowIndex 값
//자료구조 : 배열
//아이디어 : 배열로 트리구조를 만들어서 파스칼 삼각형을 구현한다.

class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();
        List<Integer> next = new ArrayList<>();

        temp.add(1);
        pascalTriangle.add(temp);
        temp = new ArrayList<>();
        temp.add(1);
        temp.add(1);
        pascalTriangle.add(temp);

        if (rowIndex > 1) {

            for (int i = 2; i <= rowIndex; i++) {
                temp = pascalTriangle.get(i - 1);

                next.add(1);
                for (int j = 0; j < temp.size() - 1; j++) {
                    next.add(temp.get(j) + temp.get(j + 1));
                }
                next.add(1);
                pascalTriangle.add(next);
                next = new ArrayList<>();
            }

        }

        return pascalTriangle.get(rowIndex);
    }
}