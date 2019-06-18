package combatants

import equipment.Armor
import equipment.Weapon

abstract class Combatant(
    var health: Int,
    var weapon: MutableList<Weapon>,
    var armor: MutableList<Armor>
    ) {
    abstract fun calculateStrength(armor: Armor, weapon: Weapon, health: Int): Pair<Int, Double>

    abstract fun hunterAttack(armor: Armor, weapon: Weapon): Double

    abstract fun warriorAttack(armor: Armor, weapon: Weapon): Double
}