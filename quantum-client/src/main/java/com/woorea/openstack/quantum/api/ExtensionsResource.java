package com.woorea.openstack.quantum.api;


import com.woorea.openstack.base.client.HttpMethod;
import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.quantum.model.Extensions;

public class ExtensionsResource {

	private final OpenStackClient CLIENT;

	public ExtensionsResource(OpenStackClient client) {
		CLIENT = client;
	}

	public List list() {
		return new List();
	}

	public class List extends OpenStackRequest<Extensions> {

		public List() {
			super(CLIENT, HttpMethod.GET, "extensions", null, Extensions.class);
		}

	}

}
