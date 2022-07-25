package com.sparta.week04.controller;

import com.sparta.week04.models.Product;
import com.sparta.week04.models.ProductRepository;
import com.sparta.week04.models.ProductRequestDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //JSON으로 응답하는 자동응답기
@RequiredArgsConstructor  //ProductRepository에 대한 권한을 줌
public class ProductRestController {

   private final ProductRepository productRepository;

    @GetMapping("/api/products") //이 주소로 들어왔을 때 실행 되어야할 메소드는 아래와 같음
//   메소드 형태:  public 반환형 메소드명(재료){}
    public List<Product> readProducts(){
        return productRepository.findAll();
    }

    @PostMapping("/api/products")
    public Product createProduct(@RequestBody ProductRequestDto requestDto){
        Product product = new Product(requestDto);
        return productRepository.save(product);
    }
}
