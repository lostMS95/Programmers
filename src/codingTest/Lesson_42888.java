package codingTest;

public class Lesson_42888 {
	public static void main(String[] args) {
		String[] record = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };

		for (int i = 0; i < record.length; i++) {
			String[] sp = record[i].split(" ");

			if (sp[0].equals("Enter")) {
				System.out.println(sp[2] + "님이 들어왔습니다.");

			} else if (sp[0].equals("Leave")) {
				
				for(int j=0; j<record.length; j++) {
				String[] ssp = record[j].split(" ");
				
				String str = record[i].substring(6);
				System.out.println(str);
				System.out.println("///"+ssp[1].equals(str));
				while(ssp[1].equals(str)) {
					/* str = str.replaceAll(record[i].substring(6)); */

				System.out.println(str + "님이 나갔습니다.");
				}
				}
			} else if (sp[0].equals("Change")) {

				if (sp[1].equals("uid4567")) {
					String[] sp2 = record[0].split(" ");

					System.out.println(sp[2]);
				}
			}
		}
	}
}