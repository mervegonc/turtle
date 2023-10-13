package baby.turtle.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import baby.turtle.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{

}
