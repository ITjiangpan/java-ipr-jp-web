package com.ipr.jp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.HttpRequestHandler;

/**     
 *
 * @author jiangpan 
 * @title StatusHandle.java
 * @date 2017年8月3日 
 *     
 */
public class StatusHandle implements HttpRequestHandler{

    private static Logger logger = LoggerFactory.getLogger(StatusHandle.class);

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            logger.info("SUCCESS");
            response.getWriter().println("SUCCESS");
        }catch (Exception e) {
            logger.error(e.getMessage(),e);
            response.sendError(503);
        }
    }
}
