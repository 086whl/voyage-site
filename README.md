
# voyage-site
2021年11月6日   初始化
2021年11月13日  测试
2021年11月15日  前台引入

# 项目介绍：

voyage-site旅游信息分享网站是基于SpringBoot+Mybatis+Thymeleaf开发，网站前台提供各类旅游信息的分类展示与广告推送，为用户提供登录注册功能，相关展示信息可供注册用户收藏，用户登录后可在收藏页面进行管理。网站后台为管理员提供旅游路线管理、用户信息管理、销售商信息管理等功能。

由于该项目为课程作业近期刚开始开发，目前仅完成上述功能，后续功能还在完善当中。

开发小组成员2人，因为开发重心在后端，前台前端图片资源、数据库商品信息数据以及部分css样式借用了开源项目的资源。



# 技术架构：

## 开发环境：

- 语言：Java 8
- IDE(Java): IDEA (安装lombok插件)
- 依赖管理：Maven
- 数据库：MySQL8.0

## 后端：

- 基础框架：Spring Boot 2.5.6
- 持久层框架：Mybatis 2.2.0
- 数据库连接池：Aibaba Druid 1.1.10
- 模板库：Thymeleaf
- 其他：FastJson,lombok等

## 前端：

- 前端后台管理框架：layuimini

# 功能模块：

## 前台：

- 用户相关

  - 用户登录

  - 用户注册
  - 用户退出登录
  - 用户密码MD5加密
  - 登录拦截器（防止用户重复登录）
  - 用户收藏列表

  - 收藏列表管理

- 旅游信息相关（下文商品可指旅游信息）

  - 首页跳转菜单栏

  - 商品信息查询列表

  - 商品信息展示

  - 商品列表分页
  - 商品详情显示
  - 商品收藏功能
  - 旅游路线模糊搜索功能
  - 收藏排行榜

## 后台：

- 后台管理员登录

- 用户信息管理

  - 用户信息查询
  - 用户信息编辑
  - 用户信息删除

- 旅游路线管理（商品管理）

  - 旅游路线查询（所有旅游路线信息查询，按路线ID/路线名称模糊查询）

  - 旅游路线编辑

  - 旅游路线删除（逻辑删除）

    

# 项目运行相关配置：

- 数据库脚本：src/main/resources/database/voyage.sql
- 默认登录账号： admin/123
- 数据库端口：localhost:3306
- 前台访问地址：http://localhost:8080/
- 后台访问地址：http://localhost:8080/layuimini/page/login-1.html

# 运行效果：

前台首页：

![image-20211116222740397](https://github.com/086whl/voyage-site/blob/master/src/main/resources/image/image-20211116222740397.png)

用户登录页面：

![image-20211116222909347](https://github.com/086whl/voyage-site/blob/master/src/main/resources/image/image-20211116222909347.png)

用户注册页面：

![image-20211116223015840](https://github.com/086whl/voyage-site/blob/master/src/main/resources/image/image-20211116223015840-16370746970411.png)

分类商品列表展示：

![image-20211116223136673](https://github.com/086whl/voyage-site/blob/master/src/main/resources/image/image-20211116223136673-16370746998082.png)

列表分页显示：

![image-20211116223158751](https://github.com/086whl/voyage-site/blob/master/src/main/resources/image/image-20211116223158751.png)

商品详情页面：

![image-20211116223305846](https://github.com/086whl/voyage-site/blob/master/src/main/resources/image/image-20211116223305846.png)

添加收藏功能：

![image-20211116223335769](https://github.com/086whl/voyage-site/blob/master/src/main/resources/image/image-20211116223335769.png)

![image-20211116223351032](https://github.com/086whl/voyage-site/blob/master/src/main/resources/image/image-20211116223351032.png)

用户收藏管理：

![image-20211116223428795](https://github.com/086whl/voyage-site/blob/master/src/main/resources/image/image-20211116223428795.png)

商品模糊搜索：

![image-20211116223527631](https://github.com/086whl/voyage-site/blob/master/src/main/resources/image/image-20211116223527631.png)

收藏排行榜：![image-20211117102743110](https://github.com/086whl/voyage-site/blob/master/src/main/resources/image/image-20211117102743110-16371160658611.png)



后台登录：

![image-20211116223945408](https://github.com/086whl/voyage-site/blob/master/src/main/resources/image/image-20211116223945408.png)

后台旅游线路管理：

![image-20211116224015191](https://github.com/086whl/voyage-site/blob/master/src/main/resources/image/image-20211116224015191.png)

![image-20211116224045850](https://github.com/086whl/voyage-site/blob/master/src/main/resources/image/image-20211116224045850.png)

后台旅游路线信息新增、编辑与删除：

![image-20211116224307708](https://github.com/086whl/voyage-site/blob/master/src/main/resources/image/image-20211116224307708.png)

![image-20211116224324619](https://github.com/086whl/voyage-site/blob/master/src/main/resources/image/image-20211116224324619.png)

![image-20211116224346618](https://github.com/086whl/voyage-site/blob/master/src/main/resources/image/image-20211116224346618.png)

后台旅游路线信息模糊搜索：

![image-20211116224434340](https://github.com/086whl/voyage-site/blob/master/src/main/resources/image/image-20211116224434340.png)
