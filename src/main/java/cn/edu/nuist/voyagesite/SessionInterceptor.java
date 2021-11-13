package cn.edu.nuist.voyagesite;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SessionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if(request.getRequestURI().equals("/login.html")){
            Object obj=request.getSession().getAttribute("user");
            if(obj!=null){
                response.setContentType("text/html; charset=UTF-8");
                response.getWriter().print("<html><body><script type='text/javascript'>alert('请勿重复登录,点击确定返回主页！');window.location.replace('/');</script></body></html>");
                response.getWriter().close();
                return false;
            }
        }
        return true;
    }
}
