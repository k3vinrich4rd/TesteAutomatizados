package trabalhandoComTestesAutomatizados;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import trabalhandoComTestesAutomatizados.model.Funcionario;
import trabalhandoComTestesAutomatizados.model.calculhotrabalhista.BonificacaoFuncionario;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootTest
class TrabalhandoComTestesAutomatizadosApplicationTests {

	@Test
	void somarValores() {
		Calculadora calculadora = new Calculadora(); //Objeto
		float soma = calculadora.somar(100, 50); //Envio dos parâmetros
		Assertions.assertEquals(150, soma); // Teste
	}

	@Test
	void bonificacaoFuncionario(){
		BonificacaoFuncionario bonificacao = new BonificacaoFuncionario();
		//A simulação requere todos os atributos do objeto como o nome
		BigDecimal bonusBonificacao = bonificacao.bonusFuncionario(new Funcionario("Fulano", LocalDate.now(), new BigDecimal("50000")));
		//Um caso onde o funcionario não recebe bonus
		Assertions.assertEquals(new BigDecimal("1000"), bonusBonificacao);
	}



}
