package composite;

public class SongListGenerator {
	
	public static void main(String[] args) {
		
		SongComponent brazilianMusic = new SongGroup("Brazilian", "");
		SongComponent popMusic = new SongGroup("Pop", "");
		
		SongComponent everySong = new SongGroup("Song List", "Every Song Available");
		
		everySong.add(brazilianMusic);
		
		brazilianMusic.add(new Song("Manchete de Jornais", "Calcinha Preta", 2005));
		brazilianMusic.add(new Song("Evidências", "Chitãozinho e Xororó", 1980));
		
		everySong.add(popMusic);
		
		popMusic.add(new Song("Mirrors", "Justin Timberlake", 2010));
		popMusic.add(new Song("California Girls", "Katy Perry", 2011));
		
		DiscJockey crazyLarry = new DiscJockey(everySong);
		
		crazyLarry.getSongList();
	}

}
