package datautils

import equipment.Ammunition
import equipment.Armor
import equipment.Weapon
import equipment.equipment_methods.buyingAmmunition
import equipment.equipment_methods.buyingArmor
import equipment.equipment_methods.buyingWeapon
import shop.EquipmentShop

val shopEquipment: EquipmentShop = EquipmentShop(
    listOf(
        Weapon("venetian falchion", 40.0, 7.4, 1.3),
        Weapon("cavalieri mace", 55.0, 8.4, 1.1),
        Weapon("common sword", 27.0, 7.4, 1.2),
        Weapon("captain's sword", 34.0, 8.4, 1.4),
        Weapon("schiavona", 43.0, 7.4, 1.1),
        Weapon("mercenario war hammer", 27.0, 8.4, 1.2),
        Weapon(" condottiero war hammer", 33.0, 7.4, 3.4),
        Weapon("odl syrian sword", 37.0, 8.4, 3.4),
        Weapon("stocco", 43.0, 7.4, 1.2),
        Weapon("bearded axe", 67.0, 8.4, 1.1),
        Weapon("spada lunga", 77.0, 7.4, 1.1),
        Weapon("spadone", 50.0, 8.4, 1.2)
    ),
    listOf(
        Armor("seusenhofer greaves", 40, 35.0),
        Armor("seusenhofer vambraces", 80, 35.0),
        Armor("seusenhofer chest guard", 60, 35.0),
        Armor("seusenhofer pauldrons", 50, 35.0)
    ),
    listOf(
        Ammunition("throwing knives", 3),
        Ammunition("smoke bombs", 3),
        Ammunition("bullets", 5),
        Ammunition("crossbow bolts", 10)
    )
)

fun printListOfEquipment() {
    when (readLine()) {
        "Y" -> printTypeOfEquipmet()
        "N" -> println("Keep with the game.")
        else -> println("Invalid entry.")
    }


}

fun printTypeOfEquipmet() {
    println(println("Weapons:\n ${shopEquipment.weapon}" + "\nAmmunition:\n ${shopEquipment.ammunition}" + "\nArmor:\n ${shopEquipment.armor}"))
    println("Chose type of equipment that you want to buy or if you want to leave type l. \n!!(shows you only equipment that you don't have, except ammunition)!!")
    when (readLine()) {
        "Weapons" -> buyingWeapon()
        "Ammunition" -> buyingAmmunition()
        "Armor" -> buyingArmor()
        "l" -> println("You left the shop.")
        else -> println("Invalid entry.")
    }
}







