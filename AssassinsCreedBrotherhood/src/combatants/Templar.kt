package combatants

import equipment.*

class Templar(
    val type: String,
    health: Int,
    val level: Int,
    weapon: MutableList<Weapon>,
    armor: MutableList<Armor>,
    val ammunition: List<Ammunition>
) : Combatant(health, weapon, armor) {
    companion object {
        var SelectedDifficulty: Double = 1.0
    }

    override fun calculateStrength(armor: Armor, weapon: Weapon, health: Int): Pair<Int, Double> {
        var fightingCoefficient: Double = ((weapon.damage + weapon.speed)- weapon.deflect) * SelectedDifficulty
        var healthStr: Int = health + armor.health
        return Pair(healthStr, fightingCoefficient)
    }

    override fun hunterAttack(armor: Armor, weapon: Weapon): Double {
        return Weapon.attackPoints(weapon.damage, weapon.speed, weapon.deflect) + 15
    }

    override fun warriorAttack(armor: Armor, weapon: Weapon): Double {
        return Weapon.attackPoints(weapon.damage, weapon.speed, weapon.deflect) + armor.resistance
    }

}