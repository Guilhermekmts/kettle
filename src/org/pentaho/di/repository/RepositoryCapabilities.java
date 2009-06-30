package org.pentaho.di.repository;

public interface RepositoryCapabilities {

	/**
	 * @return true if the repository supports users.
	 */
	public boolean supportsUsers();
	
	/**
	 * @return true if this repository is read-only
	 */
	public boolean isReadOnly();

	/**
	 * @return true if the repository supports revisions.
	 */
	public boolean supportsRevisions();
	
	/**
	 * @return true if the repository supports storing metadata like names, descriptions, ... outside of the object definitions (XML)
	 */
	public boolean supportsMetadata();

	/**
	 * @return true if this repository supports file locking
	 */
	public boolean supportsLocking();
}