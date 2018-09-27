package com.springcloud.zuulserver.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.commons.lang.StringUtils;

import javax.servlet.http.HttpServletRequest;

public class ZuulAccessFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest httpServletRequest = requestContext.getRequest();
        String accessToken = httpServletRequest.getParameter("token");
        if(StringUtils.isBlank(accessToken)){
            requestContext.setSendZuulResponse(false);
            requestContext.setResponseStatusCode(401);
            String body = "loss token";
            requestContext.setResponseBody(body);
            return null;
        }
        return null;
    }
}
