package com.smg.retrofitxmlparser.api.data

import com.tickaroo.tikxml.annotation.Element
import com.tickaroo.tikxml.annotation.Xml

@Xml(name="msgBody")
data class MsgBody(
    @Element(name = "itemList")
    val items: List<ItemList>
)
