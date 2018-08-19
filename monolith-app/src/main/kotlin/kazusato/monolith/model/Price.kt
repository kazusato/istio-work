package kazusato.monolith.model

import java.math.BigDecimal

data class Price(
        var currencyCode: String = "",
        var amount: BigDecimal = BigDecimal.ZERO
)