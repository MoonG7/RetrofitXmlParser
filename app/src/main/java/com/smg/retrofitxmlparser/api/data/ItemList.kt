package com.smg.retrofitxmlparser.api.data

import com.tickaroo.tikxml.annotation.PropertyElement
import com.tickaroo.tikxml.annotation.Xml

@Xml(name="itemList")
data class ItemList(
    @PropertyElement(name = "busRouteId") var busRouteId: String,
    @PropertyElement(name = "busRouteNm") var busRouteNm: String,
    @PropertyElement(name = "corpNm") var corpNm: String,
    @PropertyElement(name = "edStationNm") var edStationNm: String,
    @PropertyElement(name = "firstBusTm") var firstBusTm: String,
    @PropertyElement(name = "firstLowTm") var firstLowTm: String,
    @PropertyElement(name = "lastBusTm") var lastBusTm: String,
    @PropertyElement(name = "lastBusYn") var lastBusYn: String,
    @PropertyElement(name = "lastLowTm") var lastLowTm: String,
    @PropertyElement(name = "length") var length: String,
    @PropertyElement(name = "routeType") var routeType: String,
    @PropertyElement(name = "stStationNm") var stStationNm: String,
    @PropertyElement(name = "term") var term: String
)
