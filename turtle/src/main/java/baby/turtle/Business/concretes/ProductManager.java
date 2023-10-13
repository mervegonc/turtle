package baby.turtle.Business.concretes;

import java.util.List;
//import baby.turtle.core.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import baby.turtle.Business.abstracts.ProductService;
import baby.turtle.core.DataResult;
import baby.turtle.core.DataResultSuccess;
import baby.turtle.core.Result;
import baby.turtle.core.ResultSuccess;
import baby.turtle.dataAccess.abstracts.ProductDao;
import baby.turtle.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	@Autowired
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}


	@Override
	public DataResult<List<Product>> getAll() {
		return new DataResultSuccess<List<Product>>(this.productDao.findAll(), "Data Listed");
	}


	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new ResultSuccess("Product Added");
	}

}
