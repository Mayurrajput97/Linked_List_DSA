package com.linked_List;

	public class Constructors {
	    int id;
	    String name;
	    double marks;

	    public Constructors(int id, String name, double marks) {
	        this.id = id;
	        this.name = name;
	        this.marks = marks;
	    }

	    public void display() {
	        System.out.println("Student ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Marks: " + marks);
	    }

	    public static void main(String[] args) {
	        Constructors mayur = new Constructors(1, "Mayur", 95.5);
	        Constructors Pavan = new Constructors(2, "Pavan", 98.5);

	        mayur.display();
	        System.out.println();
	        Pavan.display();
	    }
	}


