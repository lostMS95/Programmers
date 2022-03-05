package codingTest;

//absolutes_len은 배열 absolutes의 길이입니다.
//signs_len은 배열 signs의 길이입니다.
public class Lsesso_76501 {
	public int solution(int[] absolutes, boolean[] signs) {
		int answer = 0;

		for (int i = 0; i < absolutes.length; i++) {
			if (signs[i]) {
				answer += absolutes[i];
			} else {
				answer -= absolutes[i];
			}
       
		}
        return answer;
	}
}