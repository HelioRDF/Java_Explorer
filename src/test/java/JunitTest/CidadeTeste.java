package JunitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import objetos.Cidade;

public class CidadeTeste {
	
	@Test
	public void testGetNome() {
		Cidade c = new Cidade("Embu", 6);
		assertEquals(c.getNome(), "Embu");
		
	}
	
	@Test
	public void testGetCod() {
		Cidade c = new Cidade("Embu", 6);
		assertEquals(c.getCod(), 6);
		
	}
}
