package crud.service;

import crud.bean.Brand;
import crud.dao.BrandMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {
    @Autowired
    BrandMapper brandMapper;

    public List<Brand> getAll() {
        return brandMapper.selectByExample(null);
    }
}
