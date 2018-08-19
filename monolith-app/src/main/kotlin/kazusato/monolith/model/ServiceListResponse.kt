package kazusato.monolith.model

data class ServiceListResponse(
        var serviceList: MutableList<Service> = mutableListOf()
) {
    fun addService(service: Service) {
        serviceList.add(service)
    }
}