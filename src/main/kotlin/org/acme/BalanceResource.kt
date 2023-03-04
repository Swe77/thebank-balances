package org.acme

import org.acme.dto.BalanceDTO
import java.math.BigDecimal
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/balance")
class BalanceResource {

    @GET
    @Path("/account/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    fun getBalance(id: Long) : BalanceDTO {
        return BalanceDTO(1L, id, BigDecimal.valueOf(50 + id))

    }
}