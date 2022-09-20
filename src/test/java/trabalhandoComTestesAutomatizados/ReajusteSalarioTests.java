package trabalhandoComTestesAutomatizados;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import trabalhandoComTestesAutomatizados.model.Funcionario;
import trabalhandoComTestesAutomatizados.model.calculhotrabalhista.ReajusteSalario;
import trabalhandoComTestesAutomatizados.model.enumerics.DesempenhoFuncionario;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootTest
public class ReajusteSalarioTests {

    @Test
    void reajusteTresPorcentoADesejar() {
        ReajusteSalario reajusteSalario = new ReajusteSalario();
        Funcionario funcionario = new Funcionario("Emelly", LocalDate.now(), new BigDecimal("2000"));
        reajusteSalario.concederReajuste(funcionario, DesempenhoFuncionario.A_Desejar);
        Assertions.assertEquals(new BigDecimal("2060.00"), funcionario.getSalario());
    }

    @Test
    void ReajusteQuinzePorcento() {
        ReajusteSalario reajusteSalario = new ReajusteSalario();
        Funcionario funcionario = new Funcionario("Carlos", LocalDate.now(), new BigDecimal("1000"));
        reajusteSalario.concederReajuste(funcionario, DesempenhoFuncionario.Bom);
        Assertions.assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    void ReajusteVintePorcento() {
        ReajusteSalario reajusteSalario = new ReajusteSalario();
        Funcionario funcionario = new Funcionario("Vilma", LocalDate.now(), new BigDecimal("1000"));
        reajusteSalario.concederReajuste(funcionario, DesempenhoFuncionario.Otimo);
        Assertions.assertEquals(new BigDecimal("1200.0"), funcionario.getSalario());
    }


}
