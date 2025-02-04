package com.techpedia.projectmanagement.bean;

public class DownloadDocVO {
	
	private long projId;
	private long regstrId;
	/**
	 * @return the projId
	 */
	public long getProjId() {
		return projId;
	}
	/**
	 * @param projId the projId to set
	 */
	public void setProjId(long projId) {
		this.projId = projId;
	}
	/**
	 * @return the regstrId
	 */
	public long getRegstrId() {
		return regstrId;
	}
	/**
	 * @param regstrId the regstrId to set
	 */
	public void setRegstrId(long regstrId) {
		this.regstrId = regstrId;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DownloadDocVO [projId=" + projId + ", regstrId=" + regstrId
				+ "]";
	}
}
