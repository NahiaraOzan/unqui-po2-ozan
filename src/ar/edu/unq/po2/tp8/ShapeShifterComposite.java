package ar.edu.unq.po2.tp8;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

public class ShapeShifterComposite implements IShapeShifter{
	private List<IShapeShifter> shapes;

	public ShapeShifterComposite() {
		this.shapes = new ArrayList<>();
	}
	
	
	public IShapeShifter compose(IShapeShifter shape) {
		ShapeShifterComposite newComposite = new ShapeShifterComposite();
		newComposite.addShape(this);
		newComposite.addShape(shape);
		return newComposite;
	}
	
	public int deepest() {
        return 1 + shapes.stream()
                .mapToInt(IShapeShifter::deepest)
                .max()
                .orElse(0);
    }
	
	/*public int deepest() {
	    int maxDepth = 0;
	    for (IShapeShifter shape : shapes) {
	        int depth = shape.deepest();
	        if (depth > maxDepth) {
	            maxDepth = depth;
	        }
	    }
	    return 1 + maxDepth;
	}*/
	
	
	public IShapeShifter flat() {
	    List<Integer> allValues = this.values();      				// obtengo todos los valores de las hojas
	    ShapeShifterComposite flatComposite = new ShapeShifterComposite();

	    for (Integer value : allValues) {             				// recorro cada número
	        ShapeShifterLeaf leaf = new ShapeShifterLeaf(value);    // creo una hoja por cada valor
	        flatComposite.addShape(leaf);             				// la agrego al nuevo composite "plano"
	    }

	    return flatComposite;
	}
	
	/*
	public IShapeShifter flat() {
	    List<Integer> allValues = this.values();
	    ShapeShifterComposite flatComposite = new ShapeShifterComposite();
	    allValues.stream()
	             .map(ShapeShifterLeaf::new)
	             .forEach(flatComposite::addShape);
	    return flatComposite;
	}
	*/
	
	public List<Integer> values() {
		
		return shapes.stream()
					 .flatMap(s -> s.values().stream())
					 .toList();
			  
	}
	
	public void addShape(IShapeShifter a) {
		shapes.add(a);
	}

}
