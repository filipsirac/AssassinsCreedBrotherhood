package difficulty

import combatants.Templar

fun choseDifficulty() {
    when (readLine()) {
        "EASY" -> Templar.SelectedDifficulty = Difficulty.EASY.difficulty
        "NORMAL" -> Templar.SelectedDifficulty = Difficulty.NORMAL.difficulty
        "HARD" -> Templar.SelectedDifficulty = Difficulty.HARD.difficulty
        else -> println("Invalid entry.")
    }
}