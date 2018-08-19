package kazusato.monolith.model

data class ReservationResponse(
        var customer: Customer? = null,
        var reservationItemList: MutableList<ReservationItem> = mutableListOf(),
        var reservationId: String = ""
) {
    fun addReservationItem(reservationItem: ReservationItem) {
        reservationItemList.add(reservationItem)
    }
}