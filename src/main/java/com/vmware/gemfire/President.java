package com.vmware.gemfire;

import java.io.Serializable;

public class President implements Serializable {
    private String name;
    private Integer number;
    private String party;
    private Integer birth;
    private Integer death;
   
    public President(String name, Integer number, String party, Integer birth, Integer death) {
        this.name = name;
        this.number = number;
        this.party = party;
        this.birth = birth;
        this.death = death;
    }
    
    public String getName() {
        return name;
    }
    public Integer getNumber() {
        return number;
    }
    public String getParty() {
        return party;
    }
    public Integer getBirth() {
        return birth;
    }
    public Integer getDeath() {
        return death;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNumber(Integer number) {
        this.number = number;
    }
    public void setParty(String party) {
        this.party = party;
    }
    public void setBirth(Integer birth) {
        this.birth = birth;
    }
    public void setDeath(Integer death) {
        this.death = death;
    }
    @Override
    public String toString() {
        return "President [name=" + name + ", number=" + number + ", Party=" + party + ", birth=" + birth + ", death="
                + death + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((number == null) ? 0 : number.hashCode());
        result = prime * result + ((party == null) ? 0 : party.hashCode());
        result = prime * result + ((birth == null) ? 0 : birth.hashCode());
        result = prime * result + ((death == null) ? 0 : death.hashCode());
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
        President other = (President) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (number == null) {
            if (other.number != null)
                return false;
        } else if (!number.equals(other.number))
            return false;
        if (party == null) {
            if (other.party != null)
                return false;
        } else if (!party.equals(other.party))
            return false;
        if (birth == null) {
            if (other.birth != null)
                return false;
        } else if (!birth.equals(other.birth))
            return false;
        if (death == null) {
            if (other.death != null)
                return false;
        } else if (!death.equals(other.death))
            return false;
        return true;
    }


}
