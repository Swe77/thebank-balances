package org.acme.dto

import java.math.BigDecimal

data class BalanceDTO(val id: Long, val accountId: Long, val amount: BigDecimal)
