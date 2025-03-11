package compositeDP;

public class File implements FileSystem {
	String fileName;
	public File(String fileName) {
		this.fileName=fileName;
	}
	public void ls() {
		System.out.println("The filesystem is: "+fileName);
	}
}
