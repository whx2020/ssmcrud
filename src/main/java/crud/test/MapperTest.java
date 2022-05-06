package crud.test;

import crud.bean.Product;
import crud.bean.ProductExample;
import crud.dao.BrandMapper;
import crud.dao.ProductMapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MapperTest {
    @Autowired
    BrandMapper brandMapper;
    @Autowired
    ProductMapper productMapper;

    @Test
    public void test(){

        Product product = productMapper.selectByPrimaryKeyWithBrand(2);
        System.out.println(product);
    }

    @Test
    public void insertTest(){
        productMapper.insertSelective(new Product(null,"测试",3,2040.0,"products/.img",""));


    }
    @Test
    public void updateTest(){
        productMapper.updateByPrimaryKeyWithBLOBs(new Product(9,"测试",3,2040.0,"products/.img","一条msg"));

    }
    @Test
    public void deleteTest(){
        productMapper.deleteByPrimaryKey(8);
    }
}
