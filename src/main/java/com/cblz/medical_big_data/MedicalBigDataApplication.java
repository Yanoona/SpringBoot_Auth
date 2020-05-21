package com.cblz.medical_big_data;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.cblz.medical_big_data.mapper.*")
@EntityScan("com.cblz.medical_big_data.entity.*")
@ComponentScan("com.cblz.medical_big_data.*")
public class MedicalBigDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(MedicalBigDataApplication.class, args);
    }

}
