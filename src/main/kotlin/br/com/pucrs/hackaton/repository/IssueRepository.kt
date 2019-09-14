package br.com.pucrs.hackaton.repository

import br.com.pucrs.hackaton.model.Issue
import com.google.cloud.firestore.DocumentReference
import com.google.cloud.firestore.Firestore
import com.google.firebase.FirebaseApp

import com.google.firebase.cloud.FirestoreClient
import com.google.firebase.database.DatabaseReference
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Repository
import java.sql.Timestamp

@Repository
class IssueRepository @Autowired constructor(private val firestore: Firestore){

    fun addIssue(issue : Issue): String {
        return firestore.collection("desastres").add(issue).get().id
    }

}