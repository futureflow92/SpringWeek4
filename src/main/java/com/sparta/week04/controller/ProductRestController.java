package com.sparta.week04.controller;

import com.sparta.week04.models.Product;
import com.sparta.week04.models.ProductRepository;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //JSON으로 응답하는 자동응답기
@RequiredArgsConstructor  //ProductRepository에 대한 권한을 줌
public class ProductRestController {

   private final ProductRepository productRepository;

    @GetMapping("/api/products")
//    public 반환형 메소드명(재료){}
    public List<Product> readProducts(){
        return productRepository.findAll();
    }
}
