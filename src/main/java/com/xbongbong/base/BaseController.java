package com.xbongbong.base;

import com.alibaba.fastjson.JSONObject;
import com.xbongbong.util.StringUtil;

/**
 * @author 章华隽
 * E-mail: GavinChangCN@163.com
 * Desc:
 * Date: 2017-03-18
 * Time: 19:07
 */
public abstract class BaseController {
    protected static final String TAG = "BaseController";

    /**
     * 设置Controller的返回值
     *
     * @param errorCode 错误码
     * @param msg       错误信息
     * @param params    参数
     *
     * @return String 返回内容
     * @author huajun.zhang
     * @time 2017-02-21 上午10:25:00
     */
    protected String formatResponse(int errorCode, String msg, String params) {
        JSONObject json = new JSONObject();
        json.put("code", errorCode);
        json.put("msg", msg);
        if (!StringUtil.isEmpty(params)) {
            json.put("params", params);
        }
        return json.toJSONString();
    }

    protected String formatErrorResponse(int errorCode, String msg) {
        return formatResponse(errorCode, msg, null);
    }

    /**
     * 设置Controller的请求成功返回
     *
     * @return String 返回内容
     * @author huajun.zhang
     * @time 2017-02-21 上午10:26:00
     */
    protected String formatSuccessResponse(String param) {
        return formatResponse(1, "success", param);
    }

    /**
     * 设置Controller的请求成功返回
     *
     * @return String 返回内容
     * @author huajun.zhang
     * @time 2017-02-21 上午10:26:00
     */
    protected String formatSuccessResponse() {
        return formatResponse(1, "success", null);
    }

}
