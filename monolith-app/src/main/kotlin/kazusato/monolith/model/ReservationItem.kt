package kazusato.monolith.model

data class ReservationItem(
        var service: Service? = null,
        var reservationStatus: String = ""
)