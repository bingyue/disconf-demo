package me.bingyue.disconf.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.disconf.demo.AutoBean;
import com.example.disconf.demo.AutoService;
import com.example.disconf.demo.AutoService2;
import com.example.disconf.demo.InvestService;

public class DemoMain {
    private static String[] fn = null;

    private static void contextInitialized() {
        fn = new String[] {"applicationContext.xml"};
    }

    /**
     * @param args
     *
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

       contextInitialized();
       final ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(fn);

       while (true) {
			AutoService bean = ctx.getBean("autoService", com.example.disconf.demo.AutoService.class);
			AutoService2 bean2 = ctx.getBean("autoService2", com.example.disconf.demo.AutoService2.class);
			AutoBean bean3 = ctx.getBean("hsDemoBean", com.example.disconf.demo.AutoBean.class);
			InvestService bean4 = ctx.getBean("investService", com.example.disconf.demo.InvestService.class);
			System.out.println("配置项注入:" + bean4);
			
			//System.out.println("properties auto:" + bean.getAuto());
			//System.out.println("properties auto2:" + bean2.getAuto2());
			//注入配置项值时需要加@DisconfItem注解，有轻微API侵入
			//System.out.println("properties与配置项"+bean3);
			//System.out.println("配置项注入:" + bean4);
			Thread.sleep(3000);
		}
		
    }
}
