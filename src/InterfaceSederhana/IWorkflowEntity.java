package InterfaceSederhana;

import java.io.Serializable;

public interface IWorkflowEntity {
	public void setProcInstId(String procInstId);
	public String getProcInstId();
	public Serializable getFidParent() throws Exception;
	public void setFidParent(Serializable fidParent);
	public void setId(Serializable id) throws Exception;

}
