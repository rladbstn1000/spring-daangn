package com.ssafy.daangn_demo.service;

import com.ssafy.daangn_demo.entity.ProductEntity;
import com.ssafy.daangn_demo.entity.UserEntity;
import com.ssafy.daangn_demo.repository.UserRepository;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import static org.assertj.core.api.Assertions.*;

@SpringBootTest
//@Transactional
class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EntityManager em;

//    @Test
//    void USERID로_회원이_작성한_판매물품_가져오기() {
//        //given
//        UserEntity user = new UserEntity();
//        user.setEmail("abcd@gmail.com");
//        user.setPhoneNumber("010-1234-5678");
//        user.setMannerTemperature(36.7);
//        userRepository.save(user);
//
//        ProductEntity product1 = new ProductEntity();
//        product1.setWriter(user);
//        product1.setTitle("제목1");
//        product1.setDescription("내용1");
//        product1.setPrice(10000);
//        product1.setStatus("on_sale");
//        productService.create(product1);
//
//        ProductEntity product2 = new ProductEntity();
//        product2.setWriter(user);
//        product2.setTitle("제목2");
//        product2.setDescription("내용2");
//        product2.setPrice(10000);
//        product2.setStatus("on_sale");
//        productService.create(product2);
//
//        ProductEntity product3 = new ProductEntity();
//        product3.setWriter(user);
//        product3.setTitle("제목3");
//        product3.setDescription("내용3");
//        product3.setPrice(10000);
//        product3.setStatus("on_sale");
//        productService.create(product3);
//
//        //when
//        List<ProductEntity> products = productService.getByWriter(user.getId());
//
//        //then
//        assertThat(products.size()).isEqualTo(3);
//    }

//    @Test
//    void 판매물품_전체목록의_작성자_조회하기(){
//        //given
//        UserEntity user1 = new UserEntity();
//        user1.setEmail("abcd1@gmail.com");
//        user1.setPhoneNumber("010-1234-5678");
//        user1.setMannerTemperature(36.7);
//        userRepository.save(user1);
//
//        UserEntity user2 = new UserEntity();
//        user2.setEmail("abcd2@gmail.com");
//        user2.setPhoneNumber("010-1234-5678");
//        user2.setMannerTemperature(36.8);
//        userRepository.save(user2);
//
//        UserEntity user3 = new UserEntity();
//        user3.setEmail("abcd3@gmail.com");
//        user3.setPhoneNumber("010-1234-5678");
//        user3.setMannerTemperature(36.9);
//        userRepository.save(user3);
//
//        ProductEntity product1 = new ProductEntity();
//        product1.setWriter(user1);
//        product1.setTitle("제목1");
//        product1.setDescription("내용1");
//        product1.setPrice(10000);
//        product1.setStatus("on_sale");
//        productService.create(product1);
//
//        ProductEntity product2 = new ProductEntity();
//        product2.setWriter(user2);
//        product2.setTitle("제목2");
//        product2.setDescription("내용2");
//        product2.setPrice(10000);
//        product2.setStatus("on_sale");
//        productService.create(product2);
//
//        ProductEntity product3 = new ProductEntity();
//        product3.setWriter(user3);
//        product3.setTitle("제목3");
//        product3.setDescription("내용3");
//        product3.setPrice(10000);
//        product3.setStatus("on_sale");
//        productService.create(product3);
//
////        em.flush();
////        em.clear();
//
//        //when
//        List<ProductEntity> products = productService.getAll();
//
//        //then
//        System.out.println("==============start===============");
//        for (ProductEntity product: products) {
//            System.out.println(product.getWriter().getEmail());
//        }
//        System.out.println("==============end===============");
//    }
}