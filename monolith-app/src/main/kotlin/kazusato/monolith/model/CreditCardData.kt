package kazusato.monolith.model

data class CreditCardData(
        var cardNumber: String = "",
        var cardHolderName: String = "",
        var expiration: String = "",
        var securityCode: String = ""
)