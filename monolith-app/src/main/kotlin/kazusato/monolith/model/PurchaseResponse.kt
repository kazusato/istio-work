package kazusato.monolith.model

data class PurchaseResponse(
        var paymentId: String = "",
        var reservationId: String = "",
        var paymentStatus: String = ""
)