package singers;
public class Singers {
	
	int singerId;
	String singerName;
	String singerAddress;
	String singerDateOfBirth;
	int singerAlbumsPub;
	
	// Setters
	public void setSingerId(int id) 
	{
		this.singerId = id; // set singer id
	}
	
	public void setSingerName(String name)
	{
		this.singerName = name; // set singer name
	}
	
	public void setSingerAddress(String address)
	{
		this.singerAddress = address; // set singer address
	}
	
	public void setSingerDoB(String dateOfBirth)
	{
		this.singerDateOfBirth = dateOfBirth; // set singer DoB
	}
	
	public void setNumAlbumsPub(int number)
	{
		this.singerAlbumsPub = number; // set number of albums published
	}
	
	public void setAllSingerVars(int id, String name, String address, String dateOfBirth, int number)
	{
		this.singerId = id;
		this.singerName = name;
		this.singerAddress = address;
		this.singerDateOfBirth = dateOfBirth;
		this.singerAlbumsPub = number;
	}
	
	// Getters
	public int getSingerId()
	{
		return singerId; // get singer Id
	}
	
	public String getSingerName()
	{
		return singerName; // get singer name
	}
	
	public String getSingerAddress()
	{
		return singerAddress; // get singer address
	}
	
	public String getSingerDoB()
	{
		return singerDateOfBirth; // get singer DoB
	}
	
	public int getSingerAlbumsPub()
	{
		return singerAlbumsPub; // get number of albums published
	}
	// Constructors
	Singers(){
		singerId = 1;
		singerName = "Test";
		singerAddress = "Test Address";
		singerDateOfBirth = "01-01-1990";
		singerAlbumsPub = 1;
	}
	
	Singers(int id){
		singerId = id;
		singerName = "Test 2";
		singerAddress = "Test Address 2";
		singerDateOfBirth = "01-01-1990";
		singerAlbumsPub = 2;
	}
	
	Singers(int id, String name){
		singerId = id;
		singerName = name;
		singerAddress = "Test Address 3";
		singerDateOfBirth = "01-01-1990";
		singerAlbumsPub = 3;
	}
	
	Singers(int id, String name, String address){
		singerId = id;
		singerName = name;
		singerAddress = address;
		singerDateOfBirth = "01-01-1990";
		singerAlbumsPub = 3;
	}
	
	Singers(int id, String name, String address, String dateOfBirth){
		singerId = id;
		singerName = name;
		singerAddress = address;
		singerDateOfBirth = dateOfBirth;
		singerAlbumsPub = 4;
	}
	Singers(int id, String name, String address, String dateOfBirth, int number){
		singerId = id;
		singerName = name;
		singerAddress = address;
		singerDateOfBirth = dateOfBirth;
		singerAlbumsPub = number;
	}
}
