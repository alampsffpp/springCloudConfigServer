package com.msxf.controller;

public class SaasClientFallback implements SaasClient {
    @Override
    public String getLulaZZInterfaceInfo() {
        return "SaasClientFallback : 服务器开小猜了... ...";
    }
}
