package combatants

import equipment.*

class Templar(
    val type: String,
    var health: Int,
    val level: Int,
    val weapon: List<Weapon>,
    val armor: List<Armor>,
    val ammunition: List<Ammunition>

) : CombatantsInteraction {
    companion object {
        var SelectedDifficulty: Double = 1.0
    }

    override fun calculateStrength(armor: Armor, weapon: Weapon, health: Int): Pair<Int, Double> {
        var fightingCoefficient: Double = ((weapon.damage + weapon.speed)/weapon.deflect)* SelectedDifficulty
        var healthStr:Int = health + armor.health
        return Pair(healthStr, fightingCoefficient)
    }
}