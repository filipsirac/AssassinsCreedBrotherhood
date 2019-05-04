package combatants

import datautils.combatant_utils.assassin
import equipment.*
import shop.Doctor

class Assassin(
    val name: String,
    var health: Int,
    val weapon: MutableList<Weapon>,
    val armor: MutableList<Armor>,
    val ammunition: MutableList<Ammunition>
) : CombatantsInteraction, Doctor() {

    override fun calculateStrength(armor: Armor, weapon: Weapon, health: Int): Pair<Int, Double> {
        var fightingCoefficient: Double = ((weapon.damage + weapon.speed)/ weapon.deflect)
        this.health = health + armor.health
        return Pair(this.health, fightingCoefficient)
    }

    fun healByMedicine(){
        val medicine = 50
        if (this.health <= 50) {
            this.health += medicine
        }else{
            this.health = 100
        }
    }

    override fun healByDoctor() {
        val doctorMedicine: Int = 100 - this.health
        this.health += doctorMedicine
    }


}

