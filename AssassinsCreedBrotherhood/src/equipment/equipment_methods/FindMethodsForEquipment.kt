package equipment.equipment_methods

import datautils.combatant_utils.assassin

fun findWeaponByName(name: String): String {
    val message = " "
    for ((i, weapon) in assassin.weapon.withIndex()) {
        if (name.contains(assassin.weapon[i].name)) {
            return name
        }
    }
    return message
}

fun findArmorByName(name: String): String {
    val message = " "
    for ((i, armor) in assassin.armor.withIndex()) {
        if (name.contains(assassin.armor[i].name)) {
            return name
        }
    }
    return message
}