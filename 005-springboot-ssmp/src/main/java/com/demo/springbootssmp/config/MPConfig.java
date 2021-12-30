package com.demo.springbootssmp.config;

import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MPConfig {

    /**
    * @Description: MP使用拦截器来进行分页功能
    * @Param: []
    * @return: com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor
    * @Author: lin
    */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor(){
//        生成拦截器
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
//        使用具体的分页拦截策略
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor());
        return interceptor;
    }
}
