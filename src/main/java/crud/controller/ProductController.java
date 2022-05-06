package crud.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import crud.bean.Brand;
import crud.bean.Product;
import crud.dao.ProductMapper;
import crud.service.BrandService;
import crud.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private BrandService brandService;

    @RequestMapping("/updateProduct")
    public String updateProductHtml(@RequestParam("productId") Integer productId,Model model){
        Product product = productService.findProduct(productId);
        List<Brand> brands =  brandService.getAll();
        model.addAttribute("brands",brands);
        model.addAttribute("product",product);
        return "updateProduct";
    }

    @RequestMapping(value = "/product/update",method = RequestMethod.POST)
    public String updateProduct(Integer productId,  String productName,
                                Integer productBrand, Double productPrice,
                                String productDesc,MultipartFile productImg){
        Product product;
        String productImgName = productImg.getOriginalFilename();
        if ("".equals(productImgName)){
            product = new Product(productId, productName, productBrand, productPrice, null, productDesc);
        }else {
            String productImgPath = "products/" + productImgName;
            product = new Product(productId, productName, productBrand, productPrice, productImgPath, productDesc);
        }
        productService.updateProduct(product);
         return "ok";
    }

    @RequestMapping("/product/delete")
    public String deleteProduct(@RequestParam("productId") Integer productId){
        productService.deleteProduct(productId);
        return "ok";
    }

    @RequestMapping("/addProduct")
    public String addProduct(Model model) {
     List<Brand> brands =  brandService.getAll();
        model.addAttribute("brands",brands);
        return "addProduct";
    }

    @RequestMapping(value = "/product", method = RequestMethod.POST)
    public String postAddProduct(MultipartFile productImg, String productName,
                                 Integer productBrand, Double productPrice,
                                 String productDesc) {
        String productImgName = productImg.getOriginalFilename();
        String productImgPath = "products/" + productImgName;

        productService.insertProduct(new Product(null, productName, productBrand, productPrice, productImgPath, productDesc));

        return "ok";
    }

    @RequestMapping("/products")
    public String getProducts(@RequestParam(value = "pn", defaultValue = "1") Integer pn, Model model) {
//        System.out.println("接受请求 /products");
//       分页插件 传入当前页 每页多少条
        PageHelper.startPage(pn, 3);
//startPage 后面紧跟的是一个分页查询
        List<Product> products = productService.getAll();
//        PageInfo包装数据 把PageInfo交给页面
        PageInfo pageInfo = new PageInfo(products);
        model.addAttribute("pageInfo", pageInfo);
//        System.out.println("model.addAttribute");
        return "products";
    }

}
