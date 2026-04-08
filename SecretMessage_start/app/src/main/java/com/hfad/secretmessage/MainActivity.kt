package com.hfad.secretmessage

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.hfad.secretmessage.ui.theme.SecretMessageTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enable edge-to-edge display on API level < 35
        enableEdgeToEdge()

        setContent {
            SecretMessageTheme {
                val navController = rememberNavController()

                // ------------------------------------------------------------------------
                // LEZIONE 17 E 19
                // ------------------------------------------------------------------------

                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    NavHost(
                        navController = navController, startDestination = "welcome",
                        modifier = Modifier.padding(innerPadding)
                    ) {
                        composable("welcome") {
                            WelcomeScreen(
                                onStartClicked = { navController.navigate("message") }
                            )
                        }
                        composable("message") {
                            MessageScreen(
                                goToEncrypted = { m ->
                                    navController.navigate("encrypt/${Uri.encode(m)}")
                                    { popUpTo("welcome") }
                                }
                            )
                        }
                        composable("encrypt/{message}") { backStackEntry ->
                            EncryptScreen(Uri.decode(backStackEntry.arguments?.getString("message").orEmpty()))
                            /*EncryptScreen(
                                //messageCrypt = txt,
                                // goHome = {navController.popBackStack()}
                                //goHome = { navController.popBackStack("welcome", false) } //ma va tolto il popUpTo su messageScreen
                            )*/
                        }
                    }
                }
            }
        }
    }
}
