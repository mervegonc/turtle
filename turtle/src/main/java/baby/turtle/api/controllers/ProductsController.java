package baby.turtle.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import baby.turtle.Business.abstracts.ProductService;
import baby.turtle.core.DataResult;
import baby.turtle.core.Result;
import baby.turtle.entities.concretes.Product;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping(name = "/api/products")
public class ProductsController {
	
	private ProductService productService;
	
	@Autowired
	public ProductsController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll(){
		return this.productService.getAll();
		
	}
	@PostMapping("/add")
	public Result add(@RequestBody Product product) {//hem istek hem data veriyor ve map eşleştirme
		return this.productService.add(product);
		
	}
}
