package kazusato.monolith.api

import kazusato.monolith.model.Price
import kazusato.monolith.model.Service
import kazusato.monolith.model.ServiceListRequest
import kazusato.monolith.model.ServiceListResponse
import org.slf4j.LoggerFactory
import java.math.BigDecimal
import java.time.LocalDate
import javax.ws.rs.Consumes
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/servicelist")
class ServiceListApi {

    private val logger = LoggerFactory.getLogger(ServiceListApi::class.java)

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun list(serviceListRequest: ServiceListRequest): ServiceListResponse {
        logger.info("[START] ServiceListApi#list")
        logger.info("DATE=${serviceListRequest.searchCriteria?.date ?: "null"}")
        val resp = ServiceListResponse().also {
            it.addService(Service(1, "name1", LocalDate.of(2018, 9, 7),
                    Price("JPY", BigDecimal(1500))))
            it.addService(Service(2, "name2", LocalDate.of(2018, 9, 7),
                    Price("JPY", BigDecimal(2000))))
            it.addService(Service(3, "name3", LocalDate.of(2018, 9, 7),
                    Price("JPY", BigDecimal(1350))))
        }
        logger.info("[END] ServiceListApi#list")

        return resp
    }

}