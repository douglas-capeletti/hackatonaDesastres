package br.com.pucrs.hackaton.repository

import br.com.pucrs.hackaton.model.Issue
import com.google.cloud.firestore.Firestore

import com.google.firebase.cloud.FirestoreClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import java.sql.Timestamp

@Repository
class IssueRepository @Autowired constructor(){

    fun addIssue(issue : Issue): Timestamp? {
        return FirestoreClient.getFirestore().collection("desastres").document("issues").set(issue).get().updateTime.toSqlTimestamp()
    }

}