package kr.co.bullets.goingnow

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import kr.co.bullets.goingnow.navigation.Screen
import kr.co.bullets.goingnow.navigation.SetupNavGraph
import kr.co.bullets.goingnow.ui.theme.GoingNowTheme

@ExperimentalMaterial3Api
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        setContent {
            GoingNowTheme {
                val navController = rememberNavController()
                SetupNavGraph(startDestination = Screen.Authentication.route, navController = navController)
            }
        }
    }
}