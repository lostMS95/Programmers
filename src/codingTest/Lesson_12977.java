package codingTest;

public class Lesson_12977 {
	public static void main(String[] args) {
		int answer = 0;
		int[] nums = { 1,2,7,6,4 };

		for (int i = 0; i < nums.length; i++) { // 0 1 2 3
			for (int j = i+1; j < nums.length; j++) { // 1 2 3
				for (int k = j+1; k < nums.length; k++) {// 2 3
					int sum = nums[i] + nums[j] + nums[k];
					
					int cnt = 0;
					for (int z = 2; z < sum; z++) {
						if (sum % z == 0) {
							cnt++;
							break;
						}
					}
					if (cnt == 0) {
						answer++;
					}
				}
			}
		}
		System.out.println(answer);
	}
}
