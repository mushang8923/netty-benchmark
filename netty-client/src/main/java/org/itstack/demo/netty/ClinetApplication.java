package org.itstack.demo.netty;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by dingyang on 2019/9/17.
 */
@SpringBootApplication
@ComponentScan("org.itstack.demo.netty")
public class ClinetApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(ClinetApplication.class, args);
        new EchoClient().bind(args[0],8007);
    }

    @Override
    public void run(String... strings) throws Exception {

    }
}
