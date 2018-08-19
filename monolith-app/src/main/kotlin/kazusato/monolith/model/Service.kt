package kazusato.monolith.model

import java.time.LocalDate

data class Service(
        var serviceId: Long = 0L,
        var name: String = "",
        var date: LocalDate? = null,
        var price: Price? = null
)