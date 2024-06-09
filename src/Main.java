import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] songs = {'A','B','C','D','E'};
		int op;
		do {
			op = sc.nextInt();
			int repeats = sc.nextInt();
			for (int i=0;i<repeats;i++) {
				doOp(op, songs);
			}
		} while (op!=4);
	}

	private static void doOp(int op, char[] songs) {
		// TODO Auto-generated method stub
		if (op==1) {
			char c = songs[0];
			for (int i=0;i<songs.length-1;i++) {
				songs[i]=songs[i+1];
			}
			songs[4] = c;
		} else if (op==2) {
			char c = songs[songs.length-1];
			for (int i=songs.length-1;i>=1;i--) {
				songs[i]=songs[i-1];
			}
			songs[0]=c;
		} else if (op==3) {
			char c = songs[0];
			songs[0] = songs[1];
			songs[1] = c;
		} else if (op==4) {
			for (int i=0;i<songs.length;i++) {
				System.out.print(songs[i]+" ");
			}
		}
	}

}
