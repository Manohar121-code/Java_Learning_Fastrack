package oops.encapsulation;

public class JavaBeanClass {
	private int id;
	private String name;

	public JavaBeanClass(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "JavaBeanClass [id=" + id + ", name=" + name + "]";
	}
	
}
