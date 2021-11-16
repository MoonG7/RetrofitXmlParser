package com.smg.retrofitxmlparser.api.data

import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml

@Xml(name = "msgHeader")
data class MsgHeader(
    @PropertyElement
    val headerCd: Int,
    @PropertyElement
    val headerMsg: String,
    @PropertyElement
    val itemCount: Int

)
