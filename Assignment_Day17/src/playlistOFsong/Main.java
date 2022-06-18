package playlistOFsong;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PlayList playList = new PlayList();
		Scanner sc = new Scanner(System.in);
		int i=0;
		do {
			System.out.println("Add song name");
			String songName = sc.nextLine();
			System.out.println("Add movie name");
			String movieName = sc.nextLine();
			
			playList.addSong(new Song(songName, movieName));
			i++;
		}while(i<4);
		
		sc.close();

		System.out.println("\n------------------------------\n");
		playList.songs.forEach(e -> e.play());
		
		
		
	}

}
