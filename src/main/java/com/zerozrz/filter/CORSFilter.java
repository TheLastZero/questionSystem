package com.zerozrz.filter;

import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 用来处理跨域请求的过滤器
 */
public class CORSFilter extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        response.addHeader("Access-Control-Allow-Origin", "*");//配置的是域名，允许哪些域名来请求例如：http://localhost:8080
        response.addHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE");
        response.addHeader("Access-Control-Allow-Headers", "zrzHeader,Content-Type");//自定义请求头，要求ajax发送请求的时候有这个请求头才行
        response.addHeader("Access-Control-Max-Age", "60");//30 min
        filterChain.doFilter(request, response);
    }
}
