package koschei.config;

import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean ("island2")
    public static Island2 getIsland(Wood3 wood3) {
        return new Island2(wood3);
    }

    @Bean ("egg6")
    public static Egg6 getIsland(Needle7 needle7) {
        return new Egg6(needle7);
    }
}
