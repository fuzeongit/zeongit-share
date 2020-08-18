package com.zeongit.share.model

import com.zeongit.share.constant.ExceptionCodeConstant

/**
 * 返回信息
 * @author fjj
 * @param <T>
</T> */
class Result<T> {
    var status: Int = ExceptionCodeConstant.SUCCESS

    var message: String? = null

    var data: T? = null

    constructor(data: T) {
        this.data = data
    }

    constructor(message: String?, data: T? = null) {
        this.message = message
        this.data = data
    }

    constructor(status: Int, message: String?, data: T? = null) {
        this.status = status
        this.message = message
        this.data = data
    }
}