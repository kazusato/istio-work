package kazusato.monolith.api

import kazusato.monolith.model.*
import org.slf4j.LoggerFactory
import javax.ws.rs.Consumes
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/reservation")
class ReservationApi {

    private val logger = LoggerFactory.getLogger(ReservationApi::class.java)

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    fun reserve(reservationRequest: ReservationRequest): ReservationResponse {
        logger.info("[START] ReservationApi#reserve")
        val resp = ReservationResponse(
                customer = Customer("Yamada", "Taro"),
                reservationId = "R00000001"
        )
        for (svc in reservationRequest.serviceList) {
            resp.addReservationItem(ReservationItem(svc, "OK"))
        }
        logger.info("[END] ReservationApi#reserve")

        return resp
    }

}