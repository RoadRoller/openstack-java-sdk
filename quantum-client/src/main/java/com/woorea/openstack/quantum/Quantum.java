package com.woorea.openstack.quantum;

import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackClientConnector;
import com.woorea.openstack.quantum.api.ExtensionsResource;
import com.woorea.openstack.quantum.api.FloatingIPResource;
import com.woorea.openstack.quantum.api.NetworksResource;
import com.woorea.openstack.quantum.api.PortsResource;
import com.woorea.openstack.quantum.api.RoutersResource;
import com.woorea.openstack.quantum.api.SubnetsResource;


public class Quantum extends OpenStackClient {

	private final ExtensionsResource EXTENSIONS;

	private final NetworksResource NETWORKS;

	private final PortsResource PORTS;

	private final SubnetsResource SUBNETS;

	private final RoutersResource ROUTERS;

	private final FloatingIPResource FLOATING_IPS;

	public Quantum(String endpoint, OpenStackClientConnector connector) {
		super(endpoint, connector);
		EXTENSIONS = new ExtensionsResource(this);
		NETWORKS = new NetworksResource(this);
		PORTS = new PortsResource(this);
		SUBNETS = new SubnetsResource(this);
		ROUTERS = new RoutersResource(this);
		FLOATING_IPS = new FloatingIPResource(this);
	}

	public Quantum(String endpoint) {
		this(endpoint, null);
	}

	public ExtensionsResource extensions() {
		return EXTENSIONS;
	}

	public NetworksResource networks() {
		return NETWORKS;
	}

	public PortsResource ports() {
		return PORTS;
	}

	public SubnetsResource subnets() {
		return SUBNETS;
	}

	public RoutersResource routers()
	{
		return ROUTERS;
	}

	public FloatingIPResource floatingIPs() {
		return FLOATING_IPS;
	}

}
