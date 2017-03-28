package com.test.clientnodeeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

/**
 * Created by noel on 19/01/17.
 */

@SpringBootApplication
@EnableSidecar
@EnableDiscoveryClient
public class ClientNodeEureka {

    public static void main(String [] args){
        SpringApplication.run(ClientNodeEureka.class,args);
    }
}
