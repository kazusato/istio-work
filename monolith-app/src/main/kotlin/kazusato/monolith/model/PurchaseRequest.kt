package kazusato.monolith.model

data class PurchaseRequest(
        var customer: Customer? = null,
        var reservationId: String = "",
        var paymentType: String = "",
        var creditCardData: CreditCardData? = null
)