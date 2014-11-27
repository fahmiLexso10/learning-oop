package InterfaceSederhana;

import java.io.Serializable;

public class Customer implements IWorkflowEntity {

	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void setProcInstId(String procInstId) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getProcInstId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Serializable getFidParent() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setFidParent(Serializable fidParent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setId(Serializable id) throws Exception {
		// TODO Auto-generated method stub

	}

}
