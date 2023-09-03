package kr.co.bullets.goingnow.navigation

import kr.co.bullets.goingnow.util.Constants.WRITE_SCREEN_ARGUMENT_KEY

sealed class Screen(val route: String) {
    object Authentication : Screen(route = "authentication_screen")
    object Home : Screen(route = "home_screen")
    object Write : Screen(route = "write_screen?$WRITE_SCREEN_ARGUMENT_KEY={diaryId}") {
        fun passDiaryId(diaryId: String) =
            "write_screen?$WRITE_SCREEN_ARGUMENT_KEY=$diaryId"
    }
}
