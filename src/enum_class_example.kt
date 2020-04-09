/*
*    Enum Class
*    Definition :
*      We have a game that only has three states
*      . STARTED
*      . PLAYING
*      . GAMEOVER
*
*      The state can only move in the direction STARTED->PLAYING->GAMEOVER,
*      So a game class has a function to move the game from one state to another.
*
*      Create a game class and an object that is used to move the game through the states and print the result.
* */

fun main(argus: Array<String>) {
   var currentState = GameState.STARTED
    for (i in 1..30){
        println(currentState)
        currentState = changeState(currentState)
    }
}

fun changeState(currentState: GameState): GameState {
    return when (currentState) {
        GameState.STARTED -> GameState.STARTED
        GameState.PLAYING -> GameState.PLAYING
        GameState.GAMEOVER -> GameState.GAMEOVER
    }
}

enum class GameState {
    STARTED,
    PLAYING,
    GAMEOVER
}