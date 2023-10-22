package org.acme

import kotlinx.coroutines.delay
import org.acme.dto.BalanceDTO
import java.math.BigDecimal
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.PathParam
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/balance")
class BalanceResource {

    @GET
    @Path("/account/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    suspend fun getBalance(@PathParam("id") id: Long) : BalanceDTO {
        delay(200)
        return BalanceDTO(1L, id, BigDecimal.valueOf(50 + id))

    }
}