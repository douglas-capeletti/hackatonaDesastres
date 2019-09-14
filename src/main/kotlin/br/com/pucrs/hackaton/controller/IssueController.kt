package br.com.pucrs.hackaton.controller

import br.com.pucrs.hackaton.service.IssueService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/issues")
class IssueController @Autowired constructor(private val issueService : IssueService){

    @PostMapping("/issue/example")
    fun insertExample() = issueService.addTestIssue()

}