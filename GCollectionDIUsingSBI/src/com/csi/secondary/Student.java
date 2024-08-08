package com.csi.secondary;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {

	List<Integer>list;
	
	Set<String>set;
	
	Map<Integer, String>map;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(List<Integer> list, Set<String> set, Map<Integer, String> map) {
		super();
		this.list = list;
		this.set = set;
		this.map = map;
	}

	public List<Integer> getList() {
		return list;
	}

	public void setList(List<Integer> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<Integer, String> getMap() {
		return map;
	}

	public void setMap(Map<Integer, String> map) {
		this.map = map;
	}

	@Override
	public String toString() {
		return "\n Student [list=" + list + ", \n set=" + set + ",\n map=" + map + "]";
	}
	
	
	
	
}
