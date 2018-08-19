package kazusato.monolith.api

import kazusato.monolith.model.PurchaseRequest
import kazusato.monolith.model.PurchaseResponse
import kazusato.monolith.model.SearchCriteria
import org.slf4j.LoggerFactory
import javax.ws.rs.Consumes
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/purchase")
class PurchaseApi {

    private val logger = LoggerFactory.getLogger(PurchaseApi::class.java)

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun purchase(purchaseRequest: PurchaseRequest): PurchaseResponse {
        logger.info("[START] PurchaseApi#purchase")
        val resp = PurchaseResponse("P00000001", purchaseRequest.reservationId, "OK")
        logger.info("[END] PurchaseApi#purchase")

        return resp
    }

}