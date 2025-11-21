package red.coder.sales.market.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import red.coder.sales.market.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
