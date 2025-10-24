package ar.edu.unq.po2.tp8;

import java.util.ArrayList;
import java.util.List;

public class RegionComposite implements IRegion{
	private List<IRegion> regiones;
	
	public RegionComposite() {
		this.regiones = new ArrayList<>();
	}
	
	public void subDividir(IRegion region1, IRegion region2, IRegion region3, IRegion region4) {
		List<IRegion> regionesAAgregar = List.of(region1, region2, region3, region4);
		for (IRegion region : regionesAAgregar) {
			regiones.add(region);
		}
		
	}
	
	public double gananciasAnuales() {
		return this.regiones.stream().mapToDouble(region -> region.gananciasAnuales()).sum();
	}

}
