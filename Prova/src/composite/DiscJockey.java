package composite;

public class DiscJockey {
	
	SongComponent songList;
	
	public DiscJockey(SongComponent songComponent) {
		this.songList = songComponent;
	}
	
	public void getSongList() {
		songList.displaySongInfo();
	}

}
