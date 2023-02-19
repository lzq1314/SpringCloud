# SpringCloud全家桶

什么是微服务？

微服务架构是一种架构模式，他提倡将单一应用程序划分成一组小的服务，服务之间相互协调、相互配合，为用户提供最终价值。每个服务运行在其独立的进程中，服务与服务间采用轻量级的通信机制互相协作（通常是基于HTTP协议的RESTful API）。每个服务都围绕着具体业务进行构建，并且能够独立的部署到生产环境、类生产环境等。另外，应当尽量避免统一的、集中式的服务管理机制，对具体的一个服务而言，应根据业务上下文，选择合适的语言、工具对其进行构建。

SpringCloud包括的组件

服务注册发现、服务调用、服务熔断、负载均衡、服务降级、服务消息队列、配置中心管理、服务网关、服务监控、全链路追踪、自动化构建部署、服务定时任务调度等

SpringCloud组件官网地址

https://www.springcloud.cc/

微服务类似架构样例

![image-20230219134922462](C:\Users\lizhiqiang\AppData\Roaming\Typora\typora-user-images\image-20230219134922462.png)



![image-20230219135044857](C:\Users\lizhiqiang\AppData\Roaming\Typora\typora-user-images\image-20230219135044857.png)



![image-20230219135109445](C:\Users\lizhiqiang\AppData\Roaming\Typora\typora-user-images\image-20230219135109445.png)



SpringCloud一些主要的组件

![image-20230219135228044](C:\Users\lizhiqiang\AppData\Roaming\Typora\typora-user-images\image-20230219135228044.png)



## SpringCloud版本选型

Springboot git源码地址：https://github.com/spring-projects/spring-boot/releases

Springboot 2.0新特性：https://github.com/spring-projects/spring-boot/wiki/Spring-Boot-2.0-Release-Notes

SpringCloud版本：https://github.com/spring-projects/spring-cloud/wiki

SpringCloud版本与Spring boot版本对应选择：https://spring.io/projects/spring-cloud#overview

SpringCloud 更详细的版本选型：https://start.spring.io/actuator/info



### 本次选型

cloud :Hoxton.SR1

boot:2.2.2.RELEASE

Maven: 3.5及以上

Mysql: 5.7及以上

## Cloud各组件停更/升级/替换



























