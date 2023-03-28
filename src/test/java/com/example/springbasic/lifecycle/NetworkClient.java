package com.example.springbasic.lifecycle;

import lombok.Setter;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class NetworkClient {
    private String url;

    public NetworkClient() {
        System.out.println("NetworkClient.NetworkClient");
    }

    public void connect() {
        System.out.println("connect : "  + url);
    }

    public void call(String message) {
        System.out.println("call : " + url + " message : " + message);
    }

    public void disconnect() {
        System.out.println("close : " + url);
    }

    public void init() throws Exception {
        System.out.println("NetworkClient.afterPropertiesSet");
        connect();
        call("초기화 연결 메시지");
    }

    public void close() throws Exception {
        System.out.println("NetworkClient.destroy");
        disconnect();
    }

    public void setUrl(String url) {
        System.out.println("NetworkClient.setUrl");
        this.url = url;
    }
}
