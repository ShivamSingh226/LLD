package compositeDP;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
	String directoryName;
	List<FileSystem> listFileSystem;
	public Directory(String directoryName) {
		this.directoryName=directoryName;
		listFileSystem=new ArrayList<>();
	}
	public void addFilesToDirectory(FileSystem fileSystemObj) {
		listFileSystem.add(fileSystemObj);
	}
	public void ls() {
		System.out.println("Directory Name is "+directoryName);
		for(FileSystem fileSystem:listFileSystem) {
			fileSystem.ls();
		}
	}
}
