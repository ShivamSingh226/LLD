package compositeDP;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Directory movieDirectory=new Directory("Movie");
		FileSystem border=new File("Border");
		
		movieDirectory.addFilesToDirectory(border);
		
		Directory comedyMovieDirectory =new Directory("ComedyMovie");
		File hulchul=new File("Hulchul");
		comedyMovieDirectory.addFilesToDirectory(hulchul);
		movieDirectory.addFilesToDirectory(comedyMovieDirectory);
		
		movieDirectory.ls();
	}

}
