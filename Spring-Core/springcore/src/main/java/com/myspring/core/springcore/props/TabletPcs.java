package com.myspring.core.springcore.props;

import java.util.Properties;

/**
 * @author johnybasha
 *
 */
public class TabletPcs {

	private Properties pcName;

	/**
	 * Default Constructor
	 */
	public TabletPcs() {
		super();
	}

	/**
	 * @return the pcName
	 */
	public Properties getPcName() {
		return pcName;
	}

	/**
	 * @param pcName
	 *            the pcName to set
	 */
	public void setPcName(Properties pcName) {
		this.pcName = pcName;
	}

	@Override
	public String toString() {
		return "TabletPcs [pcName=" + pcName + "]";
	}

	private void initialization() {
		System.out.println("Default Initialization");
	}

	private void destruction() {
		System.out.println("Default Destruction");
	}
}