package en.abramovskyi.spring.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("en.abramovskyi.spring.aop")
@EnableAspectJAutoProxy
public class MyConfig {
}
