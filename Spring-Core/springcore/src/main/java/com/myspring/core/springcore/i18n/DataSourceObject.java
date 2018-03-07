package com.myspring.core.springcore.i18n;

/**
 * @author johnybasha
 *
 */
public class DataSourceObject {

	private int portNumber;

	private String dbName;

	private String hostName;

	/**
	 * Default Constructor
	 */
	public DataSourceObject() {

	}

	public DataSourceObject(int portNumber, String dbName, String hostName) {
		this.portNumber = portNumber;
		this.dbName = dbName;
		this.hostName = hostName;
	}

	@Override
	public String toString() {
		return "\nDataSourceObject [portNumber=" + portNumber + ", " + "dbName=" + dbName + ", hostName=" + hostName
				+ "]\n";
	}

}