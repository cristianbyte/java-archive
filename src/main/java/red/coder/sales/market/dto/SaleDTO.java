package red.coder.sales.market.dto;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SaleDTO {
    private Long id;
    private LocalDate date;
    private BigDecimal totalAmount;
    private List<DetailsDTO> details;
    private String branch_name;
}
