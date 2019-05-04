package shop

import equipment.Ammunition
import equipment.Armor
import equipment.Weapon

class EquipmentShop(
    val weapon: List<Weapon>,
    val armor: List<Armor>,
    val ammunition: List<Ammunition>
)