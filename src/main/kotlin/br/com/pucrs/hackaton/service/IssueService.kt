package br.com.pucrs.hackaton.service

import br.com.pucrs.hackaton.model.Issue
import br.com.pucrs.hackaton.repository.IssueRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class IssueService @Autowired constructor(private val issueRepository: IssueRepository) {

    fun addTestIssue() = issueRepository.addIssue(Issue(1L, 2L, 3L))
}
