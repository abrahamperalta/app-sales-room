package pe.com.sales.context;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Configuration;


import java.util.Collections;

@Configuration
public class SwaggerConfig {




    private OpenAPI apiInfo(){
        return new OpenAPI()
                .info(new Info()
                        .title("Api Rest for controll on payment in room ")
                        .description("Api rest hecha con spring boot")
                        .contact(new Contact().name("Abraham Tech").email("aperalta@gmail.com")
                                .url("www.todoweb.com"))
                        .license(new License().name("License of Api").url("www.todoweb.com")));

    }

}
