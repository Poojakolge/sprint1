package com.projectEMS.converter;

import org.springframework.stereotype.Component;
import com.projectEMS.dto.DepartmentDTO;
import com.projectEMS.entities.Department;

@Component
public class DepartmentConverter {
	 public DepartmentDTO entityToDto(Department department) {
	        DepartmentDTO departmentDTO = new DepartmentDTO();
	        departmentDTO.setId(department.getId());
	        departmentDTO.setName(department.getName());
	        departmentDTO.setDescription(department.getDescription());
	        return departmentDTO;
	    }

	    public Department dtoToEntity(DepartmentDTO departmentDTO) {
	        Department department = new Department();
	        department.setId(departmentDTO.getId());
	        department.setName(departmentDTO.getName());
	        department.setDescription(departmentDTO.getDescription());
	        return department;
	    }

}
