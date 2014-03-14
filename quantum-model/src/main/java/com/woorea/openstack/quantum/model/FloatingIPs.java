package com.woorea.openstack.quantum.model;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FloatingIPs implements Iterable<FloatingIP>, Serializable {

	@JsonProperty("floatingips")
	private List<FloatingIP> list;

	/**
	 * @return the list
	 */
	public List<FloatingIP> getList() {
		return list;
	}


	/**
	 * @param list
	 *            the list to set
	 */
	public void setList(List<FloatingIP> list) {
		this.list = list;
	}


	@Override
	public String toString() {
		return "Floating IPs [list=" + list + "]";
	}


	@Override
	public Iterator<FloatingIP> iterator() {
		return list.iterator();
	}

}
