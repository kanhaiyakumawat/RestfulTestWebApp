package com.paypal.orchpoc.webservice;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.paypal.orchpoc.pojo.BankTransaction;

@Path("/")
@Produces("application/json")
@Consumes({"application/json"})
public class BankSettlementWebServiceImpl implements BankSettlementWebService {


	@GET
	@Path("transaction/{transactionId}")
	@Produces("application/json")
	@Consumes({"application/json"})
	public Response getBankTransactionDetails(@PathParam("transactionId") String transactionId) {
		BankTransaction transaction = new BankTransaction();
		transaction.setTransactionId(transactionId);
		transaction.setAmount(100);
		transaction.setCurrency("USD");
		Response response = Response.ok(transaction).build();
		System.out.println("done with operation");
		return response;
	}
	@POST
	@Path("settransaction/{transactionId}")
	@Produces("application/json")
	@Consumes({"application/json"})
	public Response setBankTransactionDetails(@PathParam("transactionId") String transactionId) {
		BankTransaction transaction = new BankTransaction();
		transaction.setTransactionId(transactionId);
		transaction.setAmount(100);
		transaction.setCurrency("USD");
		Response response = Response.ok(transaction).build();
		System.out.println("done with operation");
		return response;
	}

}
