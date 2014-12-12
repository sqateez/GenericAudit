package com.betfair.aping.entities;

import com.betfair.aping.enums.ExecutionReportErrorCode;
import com.betfair.aping.enums.ExecutionReportStatus;

import java.io.Serializable;
import java.util.List;


public class CurrentOrdersReport  implements Serializable {

	private List<Order> currentOrders;

	public List<Order> getCurrentOrders() {
		return currentOrders;
	}

	public void setCurrentOrders(List<Order> currentOrders) {
		this.currentOrders = currentOrders;
	}
}