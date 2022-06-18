package playlistOFsong;

import java.util.HashSet;
import java.util.Set;

public class PlayList {
	Set<Song> songs = new HashSet<>();
//	List<Song> songs = new ArrayList<>();
	
	public void addSong(Song song) {
		
		boolean x = songs.add(song);
		
		if(x) {
			songs.forEach(e -> System.out.println(e.getSongName()+ " ----- "+e.getMovieName()));
			System.out.println("Song added to the playlist successfully.");
		}
		else {
			System.out.println("Song is already added in the playlist");
		}
	}
	
}
