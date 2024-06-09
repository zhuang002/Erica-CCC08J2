import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Character> songs = new ArrayList<>();
		songs.add('A');
		songs.add('B');
		songs.add('C');
		songs.add('D');
		songs.add('E');
		int op;
		do {
			op = sc.nextInt();
			int repeats = sc.nextInt();
			for (int i=0;i<repeats;i++) {
				doOp(op, songs);
			}
		} while (op!=4);
	}

	private static void doOp(int op, ArrayList<Character> songs) {
		// TODO Auto-generated method stub
		if (op==1) {
			char c = songs.remove(0);
			songs.add(c);
		} else if (op==2) {
			char c = songs.remove(songs.size()-1);
			songs.add(0,c);
		} else if (op==3) {
			char c = songs.remove(0);
			songs.add(1,c);
		} else if (op==4) {
			for (char c:songs) {
				System.out.print(c+" ");
			}
		}
	}

}
