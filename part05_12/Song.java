package part05_12;

public class Song {

	private String name;
	private String artist;
	private int durationInSeconds;

	public Song(String name, String artist, int durationInSeconds) {
		this.name = name;
		this.artist = artist;
		this.durationInSeconds = durationInSeconds;
	}

	public boolean equals(Object compared) {

		if (this == compared) {
			return true;
		}

		if (!(compared instanceof Song)) {
			return false;
		}

		Song comparedSong = (Song) compared;

		return this.name.equals(comparedSong.name) && this.artist.equals(comparedSong.artist)
				&& this.durationInSeconds == comparedSong.durationInSeconds;

	}

	@Override
	public String toString() {
		return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
	}

}
