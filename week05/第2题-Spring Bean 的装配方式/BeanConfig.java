package io.ylq.springbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
    @Bean
    public BeanBean beanBean() {
        return new BeanBean();
    }

    @Bean
    @Conditional(RandIntCondition.class)
    public ConditionBean conditionBean(){
        return new ConditionBean();
    }
}
