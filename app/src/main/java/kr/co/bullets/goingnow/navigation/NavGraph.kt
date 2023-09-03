package kr.co.bullets.goingnow.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import kr.co.bullets.goingnow.presentation.screens.auth.AuthenticationScreen
import kr.co.bullets.goingnow.util.Constants.WRITE_SCREEN_ARGUMENT_KEY

@ExperimentalMaterial3Api
@Composable
fun SetupNavGraph(startDestination: String, navController: NavHostController) {
    NavHost(
        startDestination = startDestination,
        navController = navController
    ) {
        authenticationRoute()
        homeRoute()
        writeRoute()
    }
}

@ExperimentalMaterial3Api
fun NavGraphBuilder.authenticationRoute() {
    composable(route = Screen.Authentication.route) {
        AuthenticationScreen(
            loadingState = false,
            onButtonClicked = {

            }
        )
    }
}

fun NavGraphBuilder.homeRoute() {
    composable(route = Screen.Home.route) {

    }
}

fun NavGraphBuilder.writeRoute() {
    composable(
        route = Screen.Write.route,
        arguments = listOf(navArgument(name = WRITE_SCREEN_ARGUMENT_KEY) {
            type = NavType.StringType
            nullable = true
            defaultValue = null
        })
    ) {

    }
}

