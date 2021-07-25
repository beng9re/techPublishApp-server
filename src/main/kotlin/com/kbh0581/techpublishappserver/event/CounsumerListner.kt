package com.kbh0581.techpublishappserver.event


import com.fasterxml.jackson.databind.ObjectMapper
import mu.KLogging
import org.springframework.amqp.core.Message
import org.springframework.amqp.rabbit.annotation.RabbitHandler
import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component



@Component
class CounsumerListner(
  private val objectMapper: ObjectMapper){
  companion object : KLogging()



  @RabbitListener(queues = arrayOf("hello"))
  fun receive (data: Message){
    val list = objectMapper.readTree(String(data.body))
    logger.info("[x] Received : {}",list)
    //TODO :: Message Publish 서비스 해야함

  }

}