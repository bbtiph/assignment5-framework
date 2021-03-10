package kz.reself.springdata.service;

import kz.reself.springdata.entity.User;

import java.util.Collection;
import java.util.List;

public interface UserService {
    void rewardSalariedCommissionEmployees(double persent);
    List<User> getByName(String name);
    Collection<User> employeeList();
    void createEmployee(User employee);
    void updateEmployee(Long id);
    void deleteEmployee(Long id);
    void salaryHourlyEmployees();
    void salaryCommisionAndSalariedCommision();
}
