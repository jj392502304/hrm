package com.adc.da.manager.entity;

import java.util.List;

public class UserRoleAndFunctionVO extends UserroleEO{
    private List<RolefunctionEO> rolefunction;

    public UserRoleAndFunctionVO() {
    }

    public UserRoleAndFunctionVO( List<RolefunctionEO> rolefunction) {
        this.rolefunction = rolefunction;
    }
    public List<RolefunctionEO> getRolefunction() {
        return rolefunction;
    }

    public void setRolefunction(List<RolefunctionEO> rolefunction) {
        this.rolefunction = rolefunction;
    }

}
