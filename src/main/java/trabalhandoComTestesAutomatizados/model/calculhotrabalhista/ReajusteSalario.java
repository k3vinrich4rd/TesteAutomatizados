package trabalhandoComTestesAutomatizados.model.calculhotrabalhista;

import trabalhandoComTestesAutomatizados.model.Funcionario;
import trabalhandoComTestesAutomatizados.model.enumerics.DesempenhoFuncionario;

import java.math.BigDecimal;

public class ReajusteSalario {
    public void concederReajuste(Funcionario funcionario, DesempenhoFuncionario desempenhoFuncionario) {
        if (desempenhoFuncionario == DesempenhoFuncionario.A_Desejar) {
            BigDecimal valorAdd = funcionario.getSalario().multiply(new BigDecimal("0.03"));
            BigDecimal reajuste = funcionario.getSalario().add(valorAdd);
            funcionario.setSalario(reajuste);
        } else if (desempenhoFuncionario == DesempenhoFuncionario.Bom) {
            BigDecimal valorAdd = funcionario.getSalario().multiply(new BigDecimal("0.15"));
            BigDecimal reajuste = funcionario.getSalario().add(valorAdd);
            funcionario.setSalario(reajuste);
        } else if (desempenhoFuncionario == DesempenhoFuncionario.Otimo) {
            BigDecimal valorAdd = funcionario.getSalario().multiply(new BigDecimal("0.2"));
            BigDecimal reajuste = funcionario.getSalario().add(valorAdd);
            funcionario.setSalario(reajuste);
        }
    }
}
