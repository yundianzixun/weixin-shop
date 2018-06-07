package com.itunion.shop.config;

import com.google.common.collect.Sets;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Configuration
@EnableSwagger2
public class Swagger2Config {
    @Value("${swagger.enable}")
    private boolean enable;
    @Value("${swagger.protocol}")
    private String protocol;
    @Value("${swagger.host}")
    private String host;

    @Bean
    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
//                // 生产环境的时候建议关闭
//                .enable(enable)
//                        //将Timestamp类型全部转为Long类型
//                .directModelSubstitute(Timestamp.class, Long.class)
//                        //将Date类型全部转为Long类型
//                .directModelSubstitute(Date.class, Long.class)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.itunion.wxshop"))
//                .paths(PathSelectors.any())
//                .build();
        List<Parameter> params = new ArrayList<>();
        // 增加 全局的clientId 参数
//        ParameterBuilder clientIdParam = new ParameterBuilder();
//        params.add(clientIdParam.name(AppKeyService.APP_KEY_PARAM).description("App Key")
//                .modelRef(new ModelRef("string")).parameterType("query").required(false).build());

        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo())
                .globalOperationParameters(params)
                .protocols(Sets.newHashSet(protocol))
                .host(host)
                        //将Timestamp类型全部转为Long类型
                .directModelSubstitute(Timestamp.class, Long.class)
                        //将Date类型全部转为Long类型
                .directModelSubstitute(Date.class, Long.class)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.itunion.shop"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("wxShop", "127.0.0.1", "super@100boot.cn");
        return new ApiInfoBuilder()
                .title("微商城-PC")
                .description("微商城PC端")
                .termsOfServiceUrl("https://100boot.cn/")
                .contact(contact)
                .version("1.0")
                .build();
    }

}
