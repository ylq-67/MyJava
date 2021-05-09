package io.ylq.springbean;

import io.kimmking.aop.ISchool;
import io.kimmking.spring02.Klass;
import io.ylq.springbean.AutoWireBean;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.Resource;

@Data
public class BeanUser{
    @Autowired(required = true)
    AutoWireBean autoWireBean;



    public void autoWiredFun(){
        System.out.println("@Autowired方式配置的bean：" + this.autoWireBean.fun());
    }

}
