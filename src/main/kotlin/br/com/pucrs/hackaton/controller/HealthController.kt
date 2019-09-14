package br.com.pucrs.hackaton.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/health")
class HealthController{

    @GetMapping("/alive")
    fun liveStatus() = ResponseEntity.ok().body(true)
}