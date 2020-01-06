package com.hzq.rabbitservice.consumer;

import com.hzq.rabbitservice.config.RabbitQueue;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author Huangzq
 * @title: TestConsumer
 * @projectName applications
 * @date 2019/12/13 15:40
 */
@Component
@RabbitListener(queues = RabbitQueue.QUEUE_A)
@Slf4j
public class TestConsumer {
    @RabbitHandler
    public void process(String msg){
        log.info("收到A队列消息："+msg);
    }
}