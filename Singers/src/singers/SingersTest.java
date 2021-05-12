package singers;

public class SingersTest {

	public static void main(String[] args) {
		Singers singer1 = new Singers();
		System.out.printf("%d %n %s %n %s %n %s %n %d", singer1.getSingerId(), singer1.getSingerName(), singer1.getSingerAddress(), singer1.getSingerDoB(), singer1.getSingerAlbumsPub());
		
		singer1.setSingerId(12);
		singer1.setSingerName("Rock Star");
		singer1.setSingerAddress("314 Rock Lane");
		singer1.setSingerDoB("12-12-1992");
		singer1.setNumAlbumsPub(10);
		
		System.out.printf("%n %d %n %s %n %s %n %s %n %d", singer1.getSingerId(), singer1.getSingerName(), singer1.getSingerAddress(), singer1.getSingerDoB(), singer1.getSingerAlbumsPub());
	}

}
