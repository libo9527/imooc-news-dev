package com.imooc.user.controller;

import com.imooc.api.controller.user.HelloControllerApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author bo li
 * @date 2020-12-14 12:17
 */
@RestController
public class HelloController implements HelloControllerApi {

    private final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public Object hello() {
        logger.debug("debug hello~");
        logger.info("info hello~");
        logger.warn("warn hello~");
        logger.error("error hello~");

//        Docket docket = applicationContext.getBean(Docket.class);
//        System.out.println(docket);

        return "hello";
    }
}
