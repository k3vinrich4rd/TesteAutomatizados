package trabalhandoComTestesAutomatizados.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import trabalhandoComTestesAutomatizados.model.enumerics.DesempenhoFuncionario;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario {
    private String nome;
    private LocalDate dataAdmissao;
    private BigDecimal salario;
}
