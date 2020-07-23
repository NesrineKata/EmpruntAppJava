/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioproject.Users;

/**
 *
 * @author KataTheQueen
 */
public class User {
        private String cin;
	private String type;
	private String name;

	public User(String cin,String type, String name) {
		this.cin=cin;
                this.type = type;
		this.name = name;
	}
        
        public String getCin(){
            return cin;
        }
        public void setCin(String c){
            this.cin=c;
        }
	public String getType() {
		return type;
	}
        public void setType(String c){
            this.type=c;
        }

	public String getName() {
		return name;
	}
        public void setName(String c){
            this.name=c;
        }

	public String toString() {
		return type + " " + name + ".";
	}

	public boolean equals(User user) {
		if (user.getName().equals(name) && user.getType().equals(type))
			return true;
		return false;
	}
}
