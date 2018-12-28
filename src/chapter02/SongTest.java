package chapter02;

public class SongTest {
	public static void main(String[] args) {
		/*Song song = new Song(String title, String artist,String album, String composer, int year, String track);
		song.setAlbum("Real");
		song.setArtist("아이유");
		song.setComposer("이민수 작곡");
		song.setTitle("좋은날");
		song.setTrack("3번 track");
		song.setYear(2010);
		System.out.println(song);*/
		
		Song song =new Song("Love Shot", "EXO" ,null, null, 0, null);
		System.out.println(song);
		Song song2 = new Song("Tempo","EXO");
		System.out.println(song2);
	}
}
