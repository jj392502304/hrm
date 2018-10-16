package com.adc.da.manager.entity;

import java.util.List;

public class PersonroleAndFunctionVO {

    private PersonroleEO personroleEO;
    private List<RolefunctionEO> rolefunction;

    public PersonroleEO getPersonroleEO() {
        return personroleEO;
    }

    public void setPersonroleEO(PersonroleEO personroleEO) {
        this.personroleEO = personroleEO;
    }

    public List<RolefunctionEO> getRolefunction() {
        return rolefunction;
    }

    public void setRolefunction(List<RolefunctionEO> rolefunction) {
        this.rolefunction = rolefunction;
    }

    public PersonroleAndFunctionVO(PersonroleEO personroleEO, List<RolefunctionEO> rolefunction) {
        this.personroleEO = personroleEO;
        this.rolefunction = rolefunction;
    }

    public PersonroleAndFunctionVO() {
    }
}
