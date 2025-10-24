package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class RegionTestCase {

@Test
public void testGananciaDeRegionSimple() {
    // Región simple con soja ($500)
    IRegion soja = new RegionLeaf("soja", 500);
    // Región simple con trigo ($300)
    IRegion trigo = new RegionLeaf("trigo", 300);

    assertEquals(500, soja.gananciasAnuales());
    assertEquals(300, trigo.gananciasAnuales());
}

@Test
public void testGananciaDeRegionCompuesta() {
    // Cuatro regiones simples
    IRegion soja = new RegionLeaf("soja", 500);
    IRegion trigo = new RegionLeaf("trigo", 300);
    IRegion soja2 = new RegionLeaf("soja", 500);
    IRegion trigo2 = new RegionLeaf("trigo", 300);

    // Región compuesta con las 4 subregiones
    RegionComposite parcela = new RegionComposite();
    parcela.subDividir(soja, trigo, soja2, trigo2);

    // La ganancia total debería ser 500 + 300 + 500 + 300 = 1600
    assertEquals(1600, parcela.gananciasAnuales());
}

@Test
public void testGananciaDeRegionCompuestaConSubdivisionesAnidadas() {
    // Subdivisión anidada
    RegionComposite subParcela = new RegionComposite();
    subParcela.subDividir(
        new RegionLeaf("soja", 500),
        new RegionLeaf("trigo", 300),
        new RegionLeaf("soja", 500),
        new RegionLeaf("trigo", 300)
    );

    // Región principal que contiene una hoja + la subparcela
    RegionComposite regionPrincipal = new RegionComposite();
    regionPrincipal.subDividir(
        new RegionLeaf("soja", 500),
        new RegionLeaf("trigo", 300),
        subParcela,
        new RegionLeaf("soja", 500)
    );

    // Ganancia total:
    // regionPrincipal = 500 + 300 + subParcela(1600) + 500 = 2900
    assertEquals(2900, regionPrincipal.gananciasAnuales());
}




}
