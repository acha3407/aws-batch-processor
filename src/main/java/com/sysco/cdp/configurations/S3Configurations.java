package com.sysco.cdp.configurations;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class S3Configurations {

    @Bean
    public AmazonS3 getAmazonS3() {
        return AmazonS3ClientBuilder.standard().withRegion(Regions.US_EAST_1).build();
    }

}
