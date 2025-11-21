package red.coder.sales.market.dto;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailsDTO {
    private Long id;
    private String prodName;
    private Integer quantity;
    private BigDecimal price;
}
