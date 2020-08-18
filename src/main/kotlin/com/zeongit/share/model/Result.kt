package com.zeongit.share.model

import com.zeongit.share.constant.ExceptionCodeConstant

/**
 * 返回信息
 * @author fjj
 * @param <T>
</T> */
class Result<T>(var status: Int = 200, var message: String? = null, var data: T? = null)