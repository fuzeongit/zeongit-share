package com.zeongit.share.exception

import com.zeongit.share.constant.ExceptionCodeConstant

class SignInException(message: String, status: Int = ExceptionCodeConstant.SIGN_IN, data: Any? = null)
    : BaseException(message, status, data)
