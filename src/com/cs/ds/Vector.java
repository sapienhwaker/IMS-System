package com.cs.ds;

class Vector{
	int attr;
	int source;
	int target;
	
	public Vector() {};
	
	public Vector(int attr, int source, int target) {
		super();
		this.attr = attr;
		this.source = source;
		this.target = target;
	}
	public int getAttr() {
		return attr;
	}
	public void setAttr(int attr) {
		this.attr = attr;
	}
	public int getSource() {
		return source;
	}
	public void setSource(int source) {
		this.source = source;
	}
	public int getTarget() {
		return target;
	}
	public void setTarget(int target) {
		this.target = target;
	}

	@Override
	public String toString() {
		return "Vector [attr=" + attr + ", source=" + source + ", target=" + target + "]";
	}
}
