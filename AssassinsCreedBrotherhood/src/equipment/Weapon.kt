package equipment

data class Weapon(
    val name: String,
    val damage: Double,
    val speed: Double,
    val deflect: Double
){
    companion object {
        fun attackPoints(damage: Double, speed: Double, deflect: Double): Double{
            return (damage+speed)- deflect
        }
    }
}