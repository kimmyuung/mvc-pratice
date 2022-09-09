package org.example.mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Controller { // 에노테이션 형태로 구현 요청 시
    String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception;
}