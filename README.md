## 项目简介

### 项目介绍

基于 Vue 3 + Spring Boot + Redis + ChatGLM AI + RxJava + SSE 的 AI 答题应用平台。

用户可以基于 AI 快速制作并发布多种答题应用，支持检索和分享应用、在线答题并基于评分算法或 AI 得到回答总结；管理员可以审核应用、集中管理整站内容，并进行统计分析。




## 架构设计

### 1、核心业务流程图

![](https://pic.yupi.icu/1/20240604145232082.png)

### 2、时序图

![](https://pic.yupi.icu/1/20240604145232239.png)

### 3、架构设计图

![](https://pic.yupi.icu/1/20240604145232474.png)



## 技术选型

### 后端

- Java Spring Boot 开发框架（万用后端模板）
- 存储层：MySQL 数据库 + Redis 缓存 + 腾讯云 COS 对象存储
- MyBatis-Plus 及 MyBatis X 自动生成
- Redisson 分布式锁
- Caffeine 本地缓存
- 基于 ChatGLM 大模型的通用 AI 能力
- RxJava 响应式框架 + 线程池隔离实战 
- SSE 服务端推送
- Shardingsphere 分库分表
- 幂等设计 + 分布式 ID 雪花算法




### 前端

#### Web 网页开发

- Vue 3 
- Vue-CLI 脚手架
- Axios 请求库
- Arco Design 组件库
- 前端工程化：ESLint + Prettier + TypeScript
- 富文本编辑器
- QRCode.js 二维码生成
- Pinia 状态管理
- OpenAPI 前端代码生成

#### 小程序开发

- React
- Taro 跨端开发框架
- Taro UI 组件库

### 开发工具

- 前端 IDE：JetBrains WebStorm
- 后端 IDE：JetBrains IDEA
