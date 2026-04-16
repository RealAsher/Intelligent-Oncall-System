package org.example.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "milvus")
public class MilvusProperties {

    /**
     * 云端连接 URI（Zilliz Cloud / Milvus Cloud），优先于 host/port
     */
    private String uri = "";

    private String host = "localhost";
    private Integer port = 19530;

    /**
     * 云端 token 认证（优先于 username/password）
     */
    private String token = "";

    private String username = "";
    private String password = "";
    private String database = "default";
    private Long timeout = 10000L;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getHost() {
        return host;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public Long getTimeout() {
        return timeout;
    }

    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    public String getAddress() {
        return host + ":" + port;
    }
}
