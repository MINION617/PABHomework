package com.example.hw04.task2

// kasih status submit
enum class StatusSubmit(val label: String) {
    NOT_SUBMITTED("Not submitted yet"),
    SUBMITTED("Submitted"),
    LATE("Late submission"),
    GRADED("Graded")
}

// masukin status info
fun cetakStatusInfo(status: StatusSubmit) {
    val action = when (status) {
        StatusSubmit.NOT_SUBMITTED -> "Please submit before the deadline."
        StatusSubmit.SUBMITTED -> "Waiting for grading."
        StatusSubmit.LATE -> "A late penalty may apply."
        StatusSubmit.GRADED -> "Check your score in the portal."
    }
    println("$status: ${status.label} -> $action")
}

//fungsi main
fun main() {
    cetakStatusInfo(StatusSubmit.NOT_SUBMITTED)
    cetakStatusInfo(StatusSubmit.SUBMITTED)
    cetakStatusInfo(StatusSubmit.LATE)
    cetakStatusInfo(StatusSubmit.GRADED)
}
