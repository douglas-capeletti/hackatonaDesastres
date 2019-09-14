package br.com.pucrs.hackaton.config

import com.google.auth.oauth2.GoogleCredentials
import com.google.firebase.FirebaseApp
import com.google.firebase.FirebaseOptions
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.core.io.ClassPathResource

import java.io.IOException

@Configuration
class FirestoreConfig {

    @Bean
    @Throws(IOException::class)
    fun firestore() {
        val inputStream = ClassPathResource("/hackatonadesastres-firebase-adminsdk-emcbo-e22c507f0d.json").inputStream
        val options = FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(inputStream))
                .setDatabaseUrl("https://hackatonadesastres.firebaseio.com")
                .build()

        FirebaseApp.initializeApp(options)
    }
}
