package com.woorea.openstack.quantum.api;

import com.woorea.openstack.base.client.Entity;
import com.woorea.openstack.base.client.HttpMethod;
import com.woorea.openstack.base.client.OpenStackClient;
import com.woorea.openstack.base.client.OpenStackRequest;
import com.woorea.openstack.quantum.model.FloatingIP;
import com.woorea.openstack.quantum.model.FloatingIPs;

public class FloatingIPResource {

	private final OpenStackClient CLIENT;

	public FloatingIPResource(OpenStackClient client) {
		CLIENT = client;
	}

	public List list() {
		return new List();
	}

	public class List extends OpenStackRequest<FloatingIPs> {

		public List() {
			super(CLIENT, HttpMethod.GET, "floatingips", null, FloatingIPs.class);
		}
	}

	public Show show(String floatingIPId) {
		return new Show(floatingIPId);
	}

	public class Show extends OpenStackRequest<FloatingIP> {

		public Show(String id) {
			super(CLIENT, HttpMethod.GET, buildPath("floatingips/", id), null, FloatingIP.class);
		}
	}

	public Create create(FloatingIP floatingIP) {
		return new Create(floatingIP);
	}

	public class Create extends OpenStackRequest<FloatingIP> {

		public Create(FloatingIP floatingIP) {
			super(CLIENT, HttpMethod.POST, "floatingips", Entity.json(floatingIP), FloatingIP.class);
		}
	}

	public Update update(FloatingIP floatingIP) {
		return new Update(floatingIP);
	}

	public class Update extends OpenStackRequest<FloatingIP> {

		public Update(FloatingIP floatingIP) {
			super(CLIENT, HttpMethod.POST, buildPath("floatingips/", floatingIP.getId()), Entity.json(floatingIP),
					FloatingIP.class);
		}
	}

	public Delete delete(String floatingIPId) {
		return new Delete(floatingIPId);
	}

	public class Delete extends OpenStackRequest<Void> {

		public Delete(String id) {
			super(CLIENT, HttpMethod.DELETE, buildPath("floatingips/", id), null, Void.class);
		}
	}
}
