package main

import datautils.combatant_utils.assassin
import datautils.combatant_utils.templar
import kotlin.random.Random

var index: Int = 0
var assassinStrength: Pair<Int, Double> =
    assassin.calculateStrength(assassin.armor[0], assassin.weapon[index], assassin.health)
var templarStrength: Pair<Int, Double> =
    templar.calculateStrength(templar.armor[0], templar.weapon[0], templar.health)

var firstA = assassinStrength.first
var secondA = assassinStrength.second
var firstT = templarStrength.first
var secondT = templarStrength.second


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
        "Templar has: (Health, Strength) ${templar.calculateStrength(
            templar.armor[0],
            templar.weapon[0],
            templar.health
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
    do {
        println("Templar attacks.")
        when (Random.nextInt(1, 2)) {
            1 -> handleHunterAttackTemplar()
            2 -> handleWarriorAttackTemplar()
        }

        println("Chose your attack against templar:\n 1. Hunter attack\n 2. Warrior attack\n 3. Assassin attack")
        when (readLine()) {
            "1." -> handleHunterAttack()
            "2-" -> handleWarriorAttack()
            "3." -> handleAssassinAttack()
        }
    } while (firstT > 0)
}

fun handleHunterAttackTemplar() {
    firstA -= (templar.hunterAttack(templar.armor[0], templar.weapon[0])/ secondT).toInt()
    println("Your health is $firstA")
}

fun handleWarriorAttackTemplar() {
    firstA -= (templar.warriorAttack(templar.armor[0], templar.weapon[0]) * 1.6).toInt()
    println("Your health is $firstA")
}

fun handleAssassinAttack() {
    firstT -= (assassin.assassinAttack(assassin.weapon[index]) - 30).toInt()
    if (firstT <= 0) {
        println("Templar health is 0")
        println("You won.\n")
    } else {
        println("Templar health is $firstT")
    }
}

fun handleWarriorAttack() {
    firstT -= (assassin.hunterAttack(assassin.armor[0], assassin.weapon[index]) / secondA).toInt()
    if (firstT <= 0) {
        println("Templar health is 0")
        println("You won.\n")
    } else {
        println("Templar health is $firstT")
    }
}

fun handleHunterAttack() {
    firstT -= (assassin.warriorAttack(assassin.armor[0], assassin.weapon[index]) / secondA).toInt()
    if (firstT <= 0) {
        println("Templar health is 0")
        println("You won.\n")
    } else {
        println("Templar health is $firstT")
    }
}
