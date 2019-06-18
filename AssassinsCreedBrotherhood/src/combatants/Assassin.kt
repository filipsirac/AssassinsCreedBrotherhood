package combatants

import equipment.Ammunition
import equipment.Armor
import equipment.Weapon
import main.eagleView
import shop.Doctor

class Assassin(
    var name: String,
    health: Int,
    weapon: MutableList<Weapon>,
    armor: MutableList<Armor>,
    val ammunition: MutableList<Ammunition>
) : Combatant(health, weapon, armor), Doctor {

    override fun hunterAttack(armor: Armor, weapon: Weapon): Double {
        return Weapon.attackPoints(weapon.damage, weapon.speed, weapon.deflect)
    }

    override fun warriorAttack(armor: Armor, weapon: Weapon): Double {
        return Weapon.attackPoints(weapon.damage, weapon.speed, weapon.deflect) + armor.resistance
    }

    fun assassinAttack(weapon: Weapon): Double {
        return (weapon.damage * eagleView())/weapon.deflect
    }

    override fun calculateStrength(armor: Armor, weapon: Weapon, health: Int): Pair<Int, Double> {
        var fightingCoefficient: Double = ((weapon.damage + weapon.speed) - weapon.deflect)
        this.health = health + armor.health
        return Pair(this.health, fightingCoefficient)
    }

    fun healByMedicine() {
        val medicine = 50
        if (this.health <= 50) {
            this.health += medicine
        } else {
            this.health = 100
        }
    }

    override fun healByDoctor() {
        val doctorMedicine: Int = 100 - this.health
        this.health += doctorMedicine
    }


}

