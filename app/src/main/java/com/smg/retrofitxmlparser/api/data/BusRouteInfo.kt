package com.smg.retrofitxmlparser.api.data

import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.Xml

@Xml(name="ServiceResult")
data class BusRouteInfo(
    /*@Element(name = "comMsgHeader")
    val comMsgHeader: Any,*/
    @Element(name = "msgHeader")
    val msgHeader: MsgHeader,
    @Element(name = "msgBody")
    val msgBody: MsgBody
)