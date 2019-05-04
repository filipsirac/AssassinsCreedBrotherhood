package main

import datautils.combatant_utils.assassin
import datautils.combatant_utils.templarList
var index: Int = 0


fun selectWeaponForFight(): Int {
    println("Select your weapon for fight.(Select by name)\n ${assassin.weapon}")
    when (readLine()) {
        "venetian falchion" -> index = 0
        "cavalieri mace" -> index = 1
        else -> println("Invalid entry.")
    }

    return index
}


fun showHealthStrength() {
    println(
        "Templar has: (Health, Strength) ${templarList.random().calculateStrength(
            templarList[0].armor[0],
            templarList[0].weapon[0],
            templarList[0].health
        )}"
    )
    selectWeaponForFight()
    println(
        "Ezio has: (Health, Strength)${assassin.calculateStrength(
            assassin.armor[0],
            assassin.weapon[index],
            assassin.health
        )}"
    )

}


fun postFight() {
    println("You can heal yourself. Doctor heal you fully, medicine heal you by 50.\n1. Go to doctor\n2. Heal with your medicine.")
    when (readLine()) {
        "1." -> assassin.healByDoctor()
        "2." -> assassin.healByMedicine()
        else -> println("Invalid entry")
    }
}

fun eagleView(): Int {
    println("You are using eagle view to spot your enemy, and make him vulnerable.")
    return 2
}


fun fight() {
    var assassinStrenght: Pair<Int, Double> =
        assassin.calculateStrength(assassin.armor[0], assassin.weapon[index], assassin.health)
    var templarStrenght: Pair<Int, Double> =
        templarList.random().calculateStrength(templarList[0].armor[0], templarList[0].weapon[0], templarList[0].health)

    var first = assassinStrenght.first
    var second = assassinStrenght.second

    if (assassinStrenght.second > templarStrenght.second) {
        first -= templarStrenght.second.toInt() * 3
    } else {
        second *= eagleView()
        first -= templarStrenght.second.toInt() * 3
    }
    assassinStrenght = Pair(first, second)
    println("You win the battle. Your health is ${assassinStrenght.first}, and your strength is ${assassinStrenght.second}")
}