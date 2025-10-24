package ar.edu.unq.po2.tp8;

import java.time.LocalDate;

public class FileLeaf implements IFileSystem{
	private String name;
	private int size;
	private LocalDate lastModify;
	
	
	
	public FileLeaf(String name, int size, LocalDate lastModify) {
		this.name = name;
		this.size = size;
		this.lastModify = lastModify;
	}
	
	public String getName() {
		return name;
	}

	public int totalSize() {
		return size;
	}
	
	public void printStructure() {
		 System.out.println("nombre" + name);
	}
	
	
	public IFileSystem lastModified() {
		return this;
	}
	
	public IFileSystem oldestElement() {
		return this;
	}
	
	public LocalDate getLastModify() {
		return lastModify;
	}

}
