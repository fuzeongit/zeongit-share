#### 关于项目  
这个项目是一个spring boot的插件，这个插件主要是实现了用户和登录接口拦截，并对返回类型和异常类型进行包装。
该项目不进行登录接口实现，只是提供了user表的设计，具体可根据自己业务调整。


#### 项目主要实现功能
1. @RestfulPack 
    * 该注解主要实现的是对返回数据和异常进行包装，具体包装的类型如下
    ```bash
       var status: Int = 200
       var message: String? = null
       var data: T? = null 
   ```
   * 使用方法在控制器的方法上
  
2. @Auth
    * 该注解主要实现登录校验，当用户没有登录却登录了带该注解的访问方法是将抛出401异常
        
3. @CurrentUserInfoId 和 @CurrentUserId 
    * 该两个注解为参数注解，分别是获取用户的infoId和userId，在依赖的项目中，最好使用infoId作为判断用户的id，
    userId是存放账号密码的id，不应该使用为项目依赖的id。除了登录注册的项目都不应该去使用@CurrentUserId

#### 使用方法
1. 将项目打包
2. 运行 
    ```bash
   mvn install:install-file -Dfile=D:\zeongit-share-0.0.1.jar -DgroupId=com.zeongit -DartifactId=share -Dversion=0.0.1 -Dpackaging=jar 
   ```
   把项目部安装到maven仓库
   
3. 使用项目添加依赖
  ```bash
         <dependency>
                <groupId>com.zeongit</groupId>
                <artifactId>share</artifactId>
                <version>0.0.1</version>
         </dependency>  
  ```

#### 使用项目  
[zeongit-beauty](https://github.com/JunJieFu/beauty)  
  
#### 开源协议  
[MIT](https://opensource.org/licenses/MIT)
  

