public class Album {
	private String name;
	private String artist;
	private ArrayList<Song> songs;

	public Album(String album, String artist) {
		this.artist = artist;
		this.album = album;
		songs = new ArrayList();
	}

	public void addSong(String title, double duration) {
		songs.add(new Song(title, duration));
	}

	public Song findSong(String title) {
		// return songs if it exists
		/*
		 * for (String titleIndex : songs.title) {
		 * if (titleIndex.equals(title)) {
		 * return titleIndex;
		 * }
		 * }
		 */
		return null;
	}

	public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
		// return true if it exists

		return false;
	}

}
