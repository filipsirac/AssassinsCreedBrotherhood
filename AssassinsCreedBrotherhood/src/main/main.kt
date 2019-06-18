package main

import datautils.printListOfEquipment
import difficulty.choseDifficulty


fun main() {
    println("Chose difficulty level: EASY, NORMAL, HARD")
    choseDifficulty()
    showHealthStrength()
    fight()
    postFight()

    println("Do you want to enter the shop? [Y/N]")
    printListOfEquipment()
}


