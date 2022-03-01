package codingTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class problem_9012 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < t; i++) { // 정수입력한만큼 반복문
			String str = br.readLine();// () 입력 vps = yes

			Stack stack = new Stack();

			for (int j = 0; j < str.length(); j++) {// 괄호쓴만큼 반복문
				if (str.charAt(j) == '(') {
					stack.push("(");

				} else if (str.charAt(j) == ')') {
					try {
						stack.pop();

					} catch (Exception e) {
						stack.push(")");
						break;
					}
				}
			}
			
			if (stack.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");

			}

		}
		br.close();
	}
}