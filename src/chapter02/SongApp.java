package chapter02;

public class SongApp {

	public static void main(String[] args) {
		Song song = new Song();
		song.setAlbum( "Real" );
		song.setArtist( "아이유" );
		song.setComposer( "이민수" );
		song.setTitle( "좋은날" );
		song.setTrack( 3 );
		song.setYear( 2010 );
		
		song.show();
		
		Song song2 = new Song(null,
				"에일리",
				null,
				"너에게로 첫눈 처럼 가겠다"
				,2017,0);
		song2.show();
		Song song3 = new Song("크러쉬","Beautiful");
		song3.show();
		Song song4 = new Song("어반자카파","소원");
		song4.show();
	}

}
