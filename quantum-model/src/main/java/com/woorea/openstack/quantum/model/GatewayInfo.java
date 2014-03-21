package com.woorea.openstack.quantum.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GatewayInfo implements Serializable {

	@JsonProperty("network_id")
	private String networkId;

	@JsonProperty("enable_snat")
	private String enableSnat;

	public String getEnableSnat() {
		return enableSnat;
	}

	public void setEnableSnat(String enableSnat) {
		this.enableSnat = enableSnat;
	}

	public String getNetworkId() {
		return networkId;
	}

	public void setNetworkId(String id) {
		this.networkId = id;
	}

	@Override
	public String toString() {
		return "[networkId=" + networkId + "]";
	}
}
