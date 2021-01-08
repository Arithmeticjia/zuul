package com.arithmeticjia.zuul.utils;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import com.auth0.jwt.JWT;
import javax.servlet.http.HttpServletRequest;

/**
 * @author ArithmeticJia
 * @version 1.0
 * @date 2021/1/8 3:14 下午
 */
public class TokenUtil {
    public static String getTokenUserId() {
        // 从 http 请求头中取出 token
        String token = getRequest().getHeader("token");
        String userId = JWT.decode(token).getAudience().get(0);
        return userId;
    }

    /**
     * 获取request
     *
     * @return
     */
    public static HttpServletRequest getRequest() {
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        return requestAttributes == null ? null : requestAttributes.getRequest();
    }
}
