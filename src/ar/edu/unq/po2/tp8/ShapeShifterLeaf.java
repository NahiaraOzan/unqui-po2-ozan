package ar.edu.unq.po2.tp8;

import java.util.List;

public class ShapeShifterLeaf implements IShapeShifter {
	private int valor;
	
	public ShapeShifterLeaf(int valor) {
		this.valor = valor;
	}
	
	public IShapeShifter compose(IShapeShifter sf) {
		ShapeShifterComposite newComposite = new ShapeShifterComposite();
		newComposite.addShape(this);
		newComposite.addShape(sf);
		return newComposite;
	}
	
	public int deepest() {
		return 0;
	}
	
	public IShapeShifter flat() {
		return this;
	}
	
	public List<Integer> values(){
		List<Integer> valores = List.of(valor);
		return valores;
	}

}
