package com.dian.api_service.common.exception.errorcode;

/**
 * rrorCode异常接口
 * 对于不同的应用自建IErrorCode的枚举实现
 * Created by Administrator on 2018/11/23 0023.
 */
public interface IErrorCode {
    /**
     * 错误名称(为具体的枚举常量的name())
     *
     * @return
     */
    String errName();

    /**
     * 错误码
     *
     * @return
     */
    int errCode();

}
