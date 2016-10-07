/*2. Implement Class MusicAlbum which encapsulated a music Album, each album has a string variable albumTitle and a String variable singer representing the name of singer, double variable price representing the price of album, objects of this class are Initialized using all of its instance variables.
The class has accessor methods for all its Variables and a mutator method for price.
*/
public class MusicAlbum {
	private String albumTitle;
	private String singer;
	private double price;
	
	MusicAlbum(String albumTitle, String singer, double price){
		this.albumTitle = albumTitle;
		this.singer = singer;
		this.price = price;
	}
	
	public  String getAlbumTitle(){
		return albumTitle;
	}
	
	public void setAlbumTitle(String albumTitle ){
		this.albumTitle = albumTitle;
	}
	
	public  String getSinger(){
		return singer;
	}
	
	public void setSinger(String singer ){
		this.singer = singer;
	}
	
	public  double getPprice(){
		return price;
	}
	
	public void setPrice(double price ){
		this.price = price;
	}

}
