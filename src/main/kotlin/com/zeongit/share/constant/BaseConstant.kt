package com.zeongit.share.constant

import java.util.*

object BaseConstant {
    val JWT_SECRET: String = Base64.getEncoder().encodeToString("zeongit".toByteArray(charset("utf-8")))

    const val NOT_UUID = "00000000000000000000000000000000"

    const val NOT_ID = 0
}