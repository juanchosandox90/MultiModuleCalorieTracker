package com.juanchosandox90.core.domain.model

sealed class GoalType(val name: String) {
    object LoseWeight : GoalType("lose_weight")
    object KeepWeight : GoalType("keep_weight")
    object GainWeigth : GoalType("gain_weight")

    companion object {
        fun fromString(name: String): GoalType {
            return when (name) {
                "lose_weight" -> LoseWeight
                "keep_weight" -> KeepWeight
                "gain_weight" -> GainWeigth
                else -> KeepWeight
            }
        }
    }
}

