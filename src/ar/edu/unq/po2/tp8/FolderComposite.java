package ar.edu.unq.po2.tp8;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FolderComposite implements IFileSystem {
	
	private String name;
	private LocalDate creationDate;
	private List<IFileSystem> contenido;
	
	public FolderComposite(String name) {
		this.name = name;
		this.creationDate = LocalDate.now(); 
		this.contenido = new ArrayList<>();
	}
	
	public void add(IFileSystem elemento) {
		contenido.add(elemento);
	}
	
	public String getName() {
		return name;
	}
	
	public LocalDate getCreationDate() {
		return creationDate;
	}
	
	public List<IFileSystem> getContenido() {
		return contenido;
	}
	
	public int totalSize() {
		 return this.contenido.stream().mapToInt(c -> c.totalSize()).sum();
	}
	
	public void printStructure() {
		System.out.println("📁 " + name);
		contenido.forEach(e -> e.printStructure());
	}
	
	
	public IFileSystem lastModified() {
		return contenido.stream()
				.max(Comparator.comparing(e -> {
					if (e instanceof FileLeaf file) return file.getLastModify();
					else if (e instanceof FolderComposite folder) return folder.getCreationDate();
					return LocalDate.MIN;
				}))
				.orElse(this);
	}

	public IFileSystem oldestElement() {
        return contenido.stream()
                .map(IFileSystem::oldestElement)
                .min(Comparator.comparing(e -> {
                    if (e instanceof FileLeaf f) return f.getLastModify();
                    else if (e instanceof FolderComposite f) return f.creationDate;
                    else return LocalDate.MAX;
                }))
                .orElse(this);
    }
	
	
	
	

}
