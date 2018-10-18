package composite;

import java.util.ArrayList;
import java.util.Iterator;

public class SongGroup extends SongComponent {
	
	ArrayList<SongComponent> songComponents = new ArrayList<SongComponent>();
	
	String name;
	String description;
	
	public SongGroup(String name, String description) {
		this.name = name;
		this.description = description;
	}
	
	public String getName() { 
		return name; 
	}
	
	public String getDescription() { 
		return description; 
	}
	
	public void add(SongComponent songComponent) {
		songComponents.add(songComponent);
	}
	
	public void remove(SongComponent songComponent) {
		songComponents.remove(songComponent);
	}
	
	public SongComponent getComponent(int index) {
		return (SongComponent) songComponents.get(index);
	}
	
	public void displaySongInfo() {
		
		System.out.println(getName() +  " "
				+ getDescription() + "\n");
		
		Iterator songIterator = songComponents.iterator();
		
		while(songIterator.hasNext()) {
			SongComponent songInfo = (SongComponent) songIterator.next();
			songInfo.displaySongInfo();
		}
	}

}
