package org.itstack.demo.netty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by dingyang on 2019/9/17.
 */
@SpringBootApplication
@ComponentScan("org.itstack.demo.netty")
public class TestApplication implements CommandLineRunner {

    @Autowired
    private EchoServer echoServer;
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        echoServer.bind(8007);
    }
}