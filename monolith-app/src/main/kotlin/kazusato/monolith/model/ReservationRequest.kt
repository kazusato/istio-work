package kazusato.monolith.model

data class ReservationRequest(
        var customer: Customer? = null,
        var serviceList: MutableList<Service> = mutableListOf()
) {
    fun addService(service: Service) {
        serviceList.add(service)
    }
}
