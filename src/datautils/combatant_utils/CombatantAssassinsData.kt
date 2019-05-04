package datautils.combatant_utils

import combatants.Assassin
import equipment.Ammunition
import equipment.Armor
import equipment.Weapon


var assassin = Assassin(
    "Ezio Auditore da Firenze",
    100,
    mutableListOf(
        Weapon("venetian falchion", 40.0, 7.4, 1.3),
        Weapon("cavalieri mace", 55.0, 8.4, 1.1)
    ),
    mutableListOf(
        Armor("seusenhofer greaves", 40, 35.0)
    ),
    mutableListOf(
        Ammunition("throwing knives", 3),
        Ammunition("smoke bombs", 3),
        Ammunition("bullets", 5)
    )

)



