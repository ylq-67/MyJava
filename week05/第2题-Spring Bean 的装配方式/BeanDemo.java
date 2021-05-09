package io.ylq.springbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BeanDemo {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-ylq.xml");

        //xml方式配置bean
        XmlBean xmlbean = (XmlBean) context.getBean("xmlbean");
        xmlbean.fun();
        System.out.println("XML方式配置bean：" + xmlbean.fun());


        //@AutoWire方式配置bean
        BeanUser beanUser = context.getBean(BeanUser.class);
        beanUser.autoWiredFun();

       //@Service方式配置bean
        ServiceBean serviceBean = context.getBean(ServiceBean.class);
        System.out.println("@Service方式配置bean：" + serviceBean.fun());

        //@Bean/@Configuation方式配置bean
        BeanBean beanBean = context.getBean(BeanBean.class);
        System.out.println("@Bean/@Configuation方式配置bean：" + beanBean.fun());

        //@Condition方式配置bean
        ConditionBean conditionBean = context.getBean(ConditionBean.class);
        System.out.println("@Condition方式配置bean：" + conditionBean.fun());

        //@AutoConfigureX方式配置bean
    }

}
