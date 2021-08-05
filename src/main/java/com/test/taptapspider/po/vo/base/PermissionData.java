package com.test.taptapspider.po.vo.base;

public class PermissionData {
    private String permission;
    private String label;
    private String description;

    public PermissionData(){}

    public PermissionData(String permission, String label, String description) {
        this.permission = permission;
        this.label = label;
        this.description = description;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "PermissionData{" +
                "permission='" + permission + '\'' +
                ", label='" + label + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
