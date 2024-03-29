package cn.edu.nuist.voyagesite;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @Description: 登录拦截器
 * @author: whl
 * @date: 2021年11月13日13点32分
 */
public class SessionInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //拦截登录页面
        if(request.getRequestURI().equals("/login.html")){
            //通过session内容判断用户是否已登录

            Object obj=request.getSession().getAttribute("user");
            if(obj!=null){
                response.setContentType("text/html; charset=UTF-8");
                response.getWriter().print("<html><body><script type='text/javascript'>alert('请勿重复登录,点击确定返回主页！');window.location.replace('/');</script></body></html>");
                response.getWriter().close();
                return false;
            }
        }
        return true;

//        if(request.getRequestURI().equals("/login.html"))
//            return true;
//        if (request.getRequestURI().equals("/index.html"))
//            return true;
//        if (request.getRequestURI().equals("/layuimini/page/login-1.html"))
//            return true;
//        if ((request.getSession().getAttribute("user"))!=null)
//            return true;
//        if ((request.getSession().getAttribute("admin"))!=null)
//            return true;
//        return false;
    }
}
