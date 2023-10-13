package baby.turtle.Business.abstracts;

import java.util.List;

import baby.turtle.core.DataResult;
import baby.turtle.core.Result;
import baby.turtle.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>>  getAll();
	Result add(Product product);
}
