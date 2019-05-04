package equipment.equipment_methods

import datautils.combatant_utils.assassin
import datautils.printTypeOfEquipmet
import datautils.shopEquipment

fun buyingWeapon() {
    println(shopEquipment.weapon.filter { it.name != findWeaponByName(it.name) })
    printCommandForUser()
    when (readLine()) {
        "venetian falchion" -> assassin.weapon.add(shopEquipment.weapon[0])
        "cavalieri mace" -> assassin.weapon.add(shopEquipment.weapon[1])
        "common sword" -> assassin.weapon.add(shopEquipment.weapon[2])
        "captain's sword" -> assassin.weapon.add(shopEquipment.weapon[3])
        "schiavona" -> assassin.weapon.add(shopEquipment.weapon[4])
        "mercenario war hammer" -> assassin.weapon.add(shopEquipment.weapon[5])
        "condottiero war hammer" -> assassin.weapon.add(shopEquipment.weapon[6])
        "odl syrian sword" -> assassin.weapon.add(shopEquipment.weapon[7])
        "bearded axe" -> assassin.weapon.add(shopEquipment.weapon[8])
        "stocco" -> assassin.weapon.add(shopEquipment.weapon[9])
        "spada lunga" -> assassin.weapon.add(shopEquipment.weapon[10])
        "spadone" -> assassin.weapon.add(shopEquipment.weapon[11])
        else -> println("Invalid entry.")
    }
}

fun buyingArmor() {
    println(shopEquipment.armor.filter { it.name != findArmorByName(it.name) })
    printCommandForUser()
    when (readLine()) {
        "seusenhofer greaves" -> assassin.armor.add(shopEquipment.armor[0])
        "seusenhofer vambraces" -> assassin.armor.add(shopEquipment.armor[1])
        "seusenhofer chest guard" -> assassin.armor.add(shopEquipment.armor[2])
        "seusenhofer pauldrons" -> assassin.armor.add(shopEquipment.armor[3])
        else -> println("Invalid entry.")
    }
}

fun buyingAmmunition() {
    println(shopEquipment.ammunition)
    printCommandForUser()
    when (readLine()) {
        "throwing knives" -> setAmmunitionStatus(readLine().toString(), 0)
        "smoke bombs" -> setAmmunitionStatus(readLine().toString(), 1)
        "bullets" -> setAmmunitionStatus(readLine().toString(), 2)
        "crossbow bolts" -> setAmmunitionStatus(readLine().toString(), 3)
        else -> println("Invalid entry.")
    }
}

fun setAmmunitionStatus(value: String, i: Int) {
    if (assassin.ammunition[i].name == value) {
        assassin.ammunition[i].quantity += 1
    } else {
        assassin.ammunition.add(shopEquipment.ammunition[i])
    }
}


fun printCommandForUser() {
    println("Type the name of the equipment you want to buy.")
}