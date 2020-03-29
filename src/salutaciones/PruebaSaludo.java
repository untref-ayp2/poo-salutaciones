package salutaciones;

import org.junit.Assert;
import org.junit.Test;

public class PruebaSaludo {

	@Test
	public void obtenerParaMarina() {
		
		Saludo saludo = new SaludoInformal("Marina");
		
		Assert.assertEquals("Hola Marina", saludo.obtener());
	}
	
	@Test
	public void obtenerParaSergio() {
		
		Saludo saludo = new SaludoInformal("Sergio");
		
		Assert.assertEquals("Hola Sergio", saludo.obtener());
	}
}
