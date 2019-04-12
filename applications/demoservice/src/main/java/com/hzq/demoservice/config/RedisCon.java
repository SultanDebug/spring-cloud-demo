package com.hzq.demoservice.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Huangzq
 * @date 2019-04-12
 */
@Component
@ConfigurationProperties(prefix = "spring.redis")
@Data
public class RedisCon {

    private String host;
    //prefix+参数名  对应于配置文件config.properties中的spring.redis.*信息
    private int port;

    private int timeout;
}
