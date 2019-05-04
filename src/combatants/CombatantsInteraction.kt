package combatants

import equipment.Armor
import equipment.Weapon

interface CombatantsInteraction {
    fun calculateStrength(armor: Armor, weapon: Weapon, health: Int): Pair<Int, Double>
}