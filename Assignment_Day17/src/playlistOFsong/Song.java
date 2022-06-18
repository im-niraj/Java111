package playlistOFsong;

public class Song {
	private String movieName;
	private String songName;
	public Song(String songName, String movieName) {
		this.movieName = movieName;
		this.songName = songName;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) 
			return true;
			
		Song s1 = this;
		Song s2 = (Song) o;
		return s1.movieName.equals(s2.movieName) && s1.songName.equals(s2.songName);
	}
	@Override
	public int hashCode() {
		return movieName.hashCode();
	}
	
	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getSongName() {
		return songName;
	}

	public void setSongName(String songName) {
		this.songName = songName;
	}

	
	public void play() {
		System.out.println(this.songName+" of "+ this.movieName+" is playing...!");
	}
}