package greedy

class Asteroids {
    fun asteroidsDestroyed(mass: Int, asteroids: IntArray): Boolean {
        asteroids.sort()
        var currMass = mass
        for (asteroid in asteroids) {
            if (asteroid > currMass) {
                return false
            }
            currMass += asteroid
        }

        return true
    }
}