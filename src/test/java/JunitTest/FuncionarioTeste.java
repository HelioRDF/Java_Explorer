package JunitTest;
import escopo.Heranca_Implements.Funcionario;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class FuncionarioTeste {

	@Test
	public void buscarFuncionario() {
		Funcionario f = new Funcionario("Maria", 19);
		 assertEquals(f.getIdade(), 19);

	}

}