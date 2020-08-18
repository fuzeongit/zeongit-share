package com.zeongit.share.exception

import com.zeongit.share.constant.ExceptionCodeConstant

open class BaseException(message: String, var status: Int = ExceptionCodeConstant.PROGRAM, var data: Any? = null)
    : RuntimeException(message)