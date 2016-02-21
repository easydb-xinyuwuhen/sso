package com.db2.sso.server.service;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * 登录页前置处理器
 *
 * @author db2
 */
public interface IPreLoginHandler {

    public static final String SESSION_ATTR_NAME = "login_session_attr_name";

    /**
     * 前置处理
     */
    public abstract Map<?, ?> handle(HttpSession session) throws Exception;
}
