package net.valorweb.ecommerce.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
public class Produto {

    @Id
    @EqualsAndHashCode.Include
    private Integer id;
    private String nome;
    private String descircao;
    private BigDecimal preco;

}
