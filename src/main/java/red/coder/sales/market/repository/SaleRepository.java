package red.coder.sales.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import red.coder.sales.market.model.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
