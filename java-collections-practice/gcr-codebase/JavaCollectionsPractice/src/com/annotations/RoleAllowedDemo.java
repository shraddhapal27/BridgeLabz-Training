package com.annotations;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
    String value();
}

class SecurityManager {
    private String currentUserRole;
    
    public void login(String role) {
        this.currentUserRole = role;
        System.out.println("Logged in as: " + role);
    }
    
    public void checkAccess(String methodName, RoleAllowed roleAllowed) {
        if (roleAllowed == null || !roleAllowed.value().equals(currentUserRole)) {
            throw new SecurityException("Access Denied: Required role - " + roleAllowed.value());
        }
    }
}

class AdminService {
    SecurityManager security = new SecurityManager();
    
    @RoleAllowed("ADMIN")
    public void deleteUser(int userId) {
        try {
			security.checkAccess("deleteUser", 
			    AdminService.class.getMethod("deleteUser", int.class).getAnnotation(RoleAllowed.class));
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("User " + userId + " deleted by ADMIN");
    }
    
    @RoleAllowed("ADMIN")
    public void viewReports() {
        try {
			security.checkAccess("viewReports", 
			    AdminService.class.getMethod("viewReports").getAnnotation(RoleAllowed.class));
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println("Admin reports generated");
    }
    
    public void publicMethod() {
        System.out.println("Public method accessible to all");
    }
}

class RoleAllowedDemo {
    public static void main(String[] args) {
        AdminService service = new AdminService();
        
        service.security.login("ADMIN");
        service.deleteUser(123);
        service.viewReports();
        
        service.security.login("USER");
        try {
            service.deleteUser(456);
        } catch (SecurityException e) {
            System.out.println(e.getMessage());
        }
    }
}
