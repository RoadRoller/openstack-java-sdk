package com.woorea.openstack.quantum.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("floatingip")
public class FloatingIP implements Serializable {

	@JsonProperty("router_id")
	String routerId;
	@JsonProperty("status")
	String status;
	@JsonProperty("tenant_id")
	String tenantId;
	@JsonProperty("floating_network_id")
	String floatingNetworkId;
	@JsonProperty("fixed_ip_address")
	String fixedIP;
	@JsonProperty("floating_ip_address")
	String floatingIP;
	@JsonProperty("port_id")
	String portId;
	@JsonProperty("id")
	String id;

	public String getRouterId() {
		return routerId;
	}

	public void setRouterId(String routerId) {
		this.routerId = routerId;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getFloatingNetworkId() {
		return floatingNetworkId;
	}

	public void setFloatingNetworkId(String floatingNetworkId) {
		this.floatingNetworkId = floatingNetworkId;
	}

	public String getFixedIP() {
		return fixedIP;
	}

	public void setFixedIP(String fixedIP) {
		this.fixedIP = fixedIP;
	}

	public String getFloatingIP() {
		return floatingIP;
	}

	public void setFloatingIP(String floatingIP) {
		this.floatingIP = floatingIP;
	}

	public String getPortId() {
		return portId;
	}

	public void setPortId(String portId) {
		this.portId = portId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
