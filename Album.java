import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
	private String name;
	private String artist;
	private ArrayList<Song> songs;

	public Album(String name, String artist) {
		this.artist = artist;
		this.name = name;
		songs = new ArrayList<>();
	}

	public boolean addSong(String title, double duration) {
		if (findSong(title) == null) {
			songs.add(new Song(title, duration));
			return true;
		} else {
			return false;
		}
	}

	private Song findSong(String title) {
		// return songs if it exists
		for (int index = 0; index < songs.size(); index++) {
			if (songs.get(index).getTitle().equals(title)) {
				return songs.get(index);
			}
		}
		return null;
	}

	public boolean addToPlayList(String title, LinkedList<Song> playlist) {
		Song song = findSong(title);

		if (song == null) {
			return false;
		}

		else {
			playlist.add(song);
			return true;
		}
	}

	public boolean addToPlayList(int trackNum, LinkedList<Song> playlist) {
		// return true if the songs existis and added, otherwise false
		if (trackNum >= 1) {
			playlist.add(songs.get(trackNum));
			return true;
		} else {
			return false;
		}
	}

}
