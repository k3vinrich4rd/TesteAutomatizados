package trabalhandoComTestesAutomatizados.model.calculhotrabalhista;

import trabalhandoComTestesAutomatizados.model.Funcionario;

import java.math.BigDecimal;

public class BonificacaoFuncionario {

    public BigDecimal bonusFuncionario(Funcionario funcionario) {
        BigDecimal valor = funcionario.getSalario().multiply(new BigDecimal("0.1"));
        if (valor.compareTo(new BigDecimal("1000")) > 0) {
            valor = new BigDecimal("1000");
        } //Bonificação de 10% se o valor for menor que mil
        // caso o valor for maior que mil, continuará sendo mil.
        return valor;
    }
}
