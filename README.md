# GitLab CI Java 服务示例

这是一个基于Spring Boot的Java Web服务示例，演示了如何在GitLab CI/CD环境中实现Java应用的持续集成和部署。

## 功能特性

- Spring Boot Web应用程序
- RESTful API服务
- Maven构建管理
- Docker容器化
- Kubernetes部署支持

## 技术栈

- **框架**: Spring Boot 2.x
- **构建工具**: Maven
- **Java版本**: Java 8+
- **容器化**: Docker
- **部署**: Kubernetes

## 项目结构

```
gitlabci-cidevops-java-service/
├── manifest_tpl/                    # Kubernetes部署模板
│   ├── deployment.yaml              # 基础部署配置
│   ├── deployment-stag.yaml         # 预发布环境配置
│   ├── deployment-uat.yaml          # UAT环境配置
│   └── deployment-prod.yaml         # 生产环境配置
├── src/                             # 源代码目录
│   ├── main/                        # 主要源代码
│   │   ├── java/com/example/        # Java源文件
│   │   │   ├── HelloWorldApplication.java  # 启动类
│   │   │   └── MyService.java       # 业务服务类
│   │   └── resources/               # 资源文件
│   │       └── application.properties  # 应用配置
│   └── test/                        # 测试代码
│       └── java/com/example/        # 测试源文件
├── Dockerfile                       # Docker镜像构建文件
├── pom.xml                          # Maven配置文件
├── settings.xml                     # Maven设置文件
└── README.md                        # 项目说明文档
```

## 快速开始

### 本地运行

1. 克隆项目
```bash
git clone <repository-url>
cd gitlabci-cidevops-java-service
```

2. 构建项目
```bash
mvn clean package
```

3. 运行应用
```bash
mvn spring-boot:run
```

或者直接运行jar包：
```bash
java -jar target/*.jar
```

### Docker运行

1. 构建镜像
```bash
docker build -t java-service .
```

2. 运行容器
```bash
docker run -p 8080:8080 java-service
```

## Maven配置

项目使用Maven进行依赖管理和构建，主要配置在 `pom.xml` 文件中。

### 重要依赖
- Spring Boot Starter Web
- Spring Boot Starter Test

### 构建命令
```bash
# 清理并编译
mvn clean compile

# 运行测试
mvn test

# 打包应用
mvn package

# 安装到本地仓库
mvn install
```

## CI/CD配置

项目包含完整的GitLab CI/CD配置，支持：
- Maven项目构建
- 单元测试执行
- Docker镜像构建
- 多环境自动化部署

## 部署配置

### Kubernetes部署

使用提供的YAML模板进行Kubernetes部署：

```bash
# 部署到开发环境
kubectl apply -f manifest_tpl/deployment.yaml

# 部署到预发布环境
kubectl apply -f manifest_tpl/deployment-stag.yaml

# 部署到生产环境
kubectl apply -f manifest_tpl/deployment-prod.yaml
```

## 环境要求

- Java 8 或更高版本
- Maven 3.6+
- Docker (可选)
- Kubernetes集群 (可选)

## 测试

运行单元测试：
```bash
mvn test
```

## 配置文件

`application.properties` 包含应用的基本配置，可根据不同环境进行调整。

## 许可证

MIT License
