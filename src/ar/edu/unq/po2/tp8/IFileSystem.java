package ar.edu.unq.po2.tp8;

public interface IFileSystem {
	
	int totalSize();
	void printStructure();
	IFileSystem lastModified();
	IFileSystem oldestElement(); 

	
}
