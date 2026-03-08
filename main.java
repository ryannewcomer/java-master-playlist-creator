import java.util.ArrayList;
import java.util.LinkedList;

public class main {
	public static void main(String[] args) {
		ArrayList<Album> ablums = new ArrayList<>();

		Album album = new Album("Stormbringer", "Deep Purple");

		album.addSong("Stormbringer", 4.6);
		album.addSong("Love don't mean a thing", 4.22);
		album.addSong("Holy man", 4.3);
		ablums.add(album);

		LinkedList<Song> playList = new LinkedList<Song>();
		ablums.get(0).addToPlayList("You can't do it right", playList);
		ablums.get(0).addToPlayList(2, playList);

	}
}
