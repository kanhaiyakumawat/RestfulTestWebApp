package com.paypal.orchpoc.webservice;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

public interface BankSettlementWebService {
	Response getBankTransactionDetails(String transactionId);
	Response setBankTransactionDetails(String transactionId);
}
