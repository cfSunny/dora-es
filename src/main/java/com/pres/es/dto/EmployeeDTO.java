package com.pres.es.dto;

import com.pres.es.entity.Employee;
import lombok.Data;
import org.springframework.beans.BeanUtils;

import java.util.Date;

/**
 * @author Dora
 * @date 2019/10/25 9:09
 **/
@Data
public class EmployeeDTO {
    private String id;

    private String firstName;


    private String lastName;


    private Integer age = 0;


    private String about;

    private Date birthday;

    // 实体类上加上注解,自动生成这些代码
    public Employee convertToEmployee(){
        EmployeeInputDTOConvert convert=new EmployeeInputDTOConvert();
        return convert.doForward(this);
    }

    public EmployeeDTO convertFor(Employee employee){
        EmployeeInputDTOConvert convert=new EmployeeInputDTOConvert();
        return convert.doBackward(employee);
    }

    public class EmployeeInputDTOConvert implements ConvertDTO<EmployeeDTO, Employee> {

        @Override
        public Employee doForward(EmployeeDTO source) {
            Employee employee=new Employee();
            BeanUtils.copyProperties(source,employee);
            return employee;
        }

        @Override
        public EmployeeDTO doBackward(Employee employee) {
            EmployeeDTO employeeDTO=new EmployeeDTO();
            BeanUtils.copyProperties(employee,employeeDTO);
            return employeeDTO;
        }


    }


}
