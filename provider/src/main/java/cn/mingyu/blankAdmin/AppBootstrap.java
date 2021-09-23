package cn.mingyu.blankAdmin;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * ClassName: AppBootstap
 * Description:
 * date: 2021/9/21 下午4:13
 *
 * @author yimingyu
 * @version 1.0
 * @since JDK 1.8
 */
@SpringBootApplication
@ComponentScan(basePackages = {
        "cn.mingyu.blankAdmin.*"
})
@Slf4j
public class AppBootstrap {
    public static void main(String[] args) {
        log.info("Start to run AppBootStrap");
        SpringApplication.run(AppBootstrap.class);
    }
}
