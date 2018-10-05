package com.imooc.repository;

import com.imooc.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by wzh-zhua on 2018/10/5.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest() {
        //ProductCategory productCategory = repository.findOne(1);
        ProductCategory productCategory = repository.findById(1).get();
        System.out.println(productCategory.toString());
    }

    /**
     * 插入测试
     */
    @Test
    //@Transactional  //如果希望执行测试test之后，数据库是干净的没有变化的，可以用@Transactional注解
    public void insertTest() {
        ProductCategory productCategory = new ProductCategory("女生最爱", 2);
       // productCategory.setCategoryId(4);//更新的时候需要设置主键，由于主键自增，插入的时候不需要设置主键
        ProductCategory result = repository.save(productCategory);
        System.out.println(result);

        Assert.assertNotNull(result);
//        Assert.assertNotEquals(null, result);
    }

    /**
     *更新测试
     */
    @Test
    //@Transactional
    public void updateTest() {
        ProductCategory productCategory = repository.findById(3).get();
        productCategory.setCategoryName("女生最爱");

        ProductCategory result = repository.save(productCategory);
        Assert.assertNotNull(result);
//        Assert.assertNotEquals(null, result);
    }

    /**
     * 查询列表
     */
    @Test
    public void findByCategoryTypeInTest() {
        List<Integer> list = Arrays.asList(4,5,6);

        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        System.out.println(result);
        Assert.assertNotEquals(0, result.size());
    }

}