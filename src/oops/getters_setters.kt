package oops

fun main() {
    val voter = Voter()
    println(voter.ageToVote)
    voter.ageToVote = 23
    voter.ageToVote = 15
    println(voter.ageToVote)
}

class Voter() {
    var ageToVote: Int = 18
        get() = field // default getter (redundant)
        set(value) {
            if (value >= 18) {
                field = value
            } else {
                println("Age to vote can not be less than 18")
            }
        }
    var nameOfVoter: String = "John Doe"
        get() {
            return "$field has $ageToVote age"
        }
}