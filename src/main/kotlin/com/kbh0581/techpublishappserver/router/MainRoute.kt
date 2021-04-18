package com.kbh0581.techpublishappserver.router

import com.kbh0581.techpublishappserver.handler.MainHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions.route
import org.springframework.web.reactive.function.server.ServerResponse

@Configuration
class MainRoute(private val mainHandler: MainHandler) {

  @Bean
  fun mainRoutes():RouterFunction<ServerResponse> {
    return route().GET("/",mainHandler::getTest).build()
  }
}