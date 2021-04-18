package com.kbh0581.techpublishappserver.handler

import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse.notFound
import org.springframework.web.reactive.function.server.ServerResponse.ok


@Component
class MainHandler {

  fun getTest(req:ServerRequest) = ok()
    .contentType(MediaType.TEXT_EVENT_STREAM).bodyValue("안녕")
    .switchIfEmpty(notFound().build())

}