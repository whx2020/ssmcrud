package crud.service;

import crud.bean.Product;
import crud.dao.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductMapper productMapper;

    public List<Product> getAll(){
        return productMapper.selectByExampleWithBrand(null);
    }

    public void insertProduct(Product product) {
        productMapper.insertSelective(product);
    }

    public void deleteProduct(Integer productId) {
        productMapper.deleteByPrimaryKey(productId);
    }

    public Product findProduct(Integer productId) {
        return productMapper.selectByPrimaryKeyWithBrand(productId);
    }

    public void updateProduct(Product product) {
        productMapper.updateByPrimaryKeySelective(product);
    }
}
