# atguigu-springboot2.0-study
springboot的默认静态资源文件夹为
/static or /public or /resources or /META-INF/resources
可以通过配置spring.web.resources.static-locations的值来修改默认配置
可以通过配置spring.mvc.static-path-pattern=/res/**
访问静态资源时请求路径为： 当前项目 + （spring.mvc.static-path-pattern的值）res + 静态资源名