package com.algorithm.graph;

//import java.util.List;

public class Vertex {

	String label;
	Color c;
	Vertex p; //parent
	int d; //discovery time;
	int f; //found time
//	List<Vertex> adj; //adjencent vertices
	
	public Vertex(String label) {
		this.label = label;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((c == null) ? 0 : c.hashCode());
		result = prime * result + d;
		result = prime * result + f;
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		result = prime * result + ((p == null) ? 0 : p.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		if (c != other.c)
			return false;
		if (d != other.d)
			return false;
		if (f != other.f)
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		if (p == null) {
			if (other.p != null)
				return false;
		} else if (!p.equals(other.p))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return label;
	}
		
}

