package com.Intercepter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {
    public void destroy() {

    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws ServletException, IOException {
        
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        String currentURL = request.getRequestURI();
        String ctxPath = request.getContextPath();
        
        // 除掉项目名称时访问页面当前路径
        String targetURL = currentURL.substring(ctxPath.length());
        HttpSession session = request.getSession(false);
        
        if(targetURL.indexOf("/register.jsp")>=0) {
        	filterChain.doFilter(request, response);
            return;
        }
        // 对当前页面进行判断，如果当前页面不为登录页面
        if (targetURL.indexOf("/login.jsp")<0) {// 在不为登陆页面时，再进行判断，如果不是登陆页面也没有session则跳转到登录页面，
        	
        	
            if (session == null || session.getAttribute("user") == null) {
                response.sendRedirect("login.jsp");
                return;
            } else {
                // 这里表示正确，会去寻找下一个链，如果不存在，则进行正常的页面跳转
                filterChain.doFilter(request, response);
                return;
            }
        } else {
            // 这里表示如果当前页面是登陆页面，跳转到登陆页面
            filterChain.doFilter(request, response);
            return;
        }

    }

    public void init(FilterConfig filterConfig) throws ServletException {

    }

}